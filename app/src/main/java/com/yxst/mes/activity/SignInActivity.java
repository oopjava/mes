package com.yxst.mes.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.text.InputType;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.yxst.mes.PrimaryActivity;
import com.yxst.mes.R;
import com.yxst.mes.database.DatabaseManager;
import com.yxst.mes.database.Manager.RecordQueryUtil;
import com.yxst.mes.database.model.InspectDevice;
import com.yxst.mes.database.model.Item;
import com.yxst.mes.database.Manager.InspectDevicQueryUtil;
import com.yxst.mes.database.Manager.InspectDevicValueQueryUtil;
import com.yxst.mes.database.Manager.ItemQueryUtil;
import com.yxst.mes.database.Manager.ItemValueQueryUtil;
import com.yxst.mes.database.Manager.LubeDeviceQuery;
import com.yxst.mes.database.Manager.LubeItemQuery;
import com.yxst.mes.database.Manager.PlaceQueryUtil;
import com.yxst.mes.database.Manager.PlaceValueQueryUtil;
import com.yxst.mes.database.model.Place;
import com.yxst.mes.database.model.User;
import com.yxst.mes.database.model.LubeDevice;
import com.yxst.mes.database.model.LubeItem;
import com.yxst.mes.net.RestCreator;
import com.yxst.mes.util.GsonUtil;
import com.yxst.mes.util.SharedPreferenceUtil;
import com.yxst.mes.util.ThrowableUtil;
import com.yxst.mes.util.TimeUtil;
import com.yxst.mes.util.WiFiUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created By YuanCheng on 2019/6/14 19:25
 */
public class SignInActivity extends AppCompatActivity {
    @BindView(R.id.edit_sign_in_email) TextInputEditText mEmail = null;
    @BindView(R.id.edit_sign_in_password) TextInputEditText mPassword = null;
    @BindView(R.id.btn_sign_in)
    AppCompatButton mSignIn = null;
    private SharedPreferences sp;
    private List<User> userList;
    @OnClick(R.id.btn_sign_in)
    void onClickSignIn() {
        if (checkForm()) {
            boolean isAp = WiFiUtil.getInstance(this).isWifiApEnabled();
            if (isAp) {
                WiFiUtil.getInstance(this).closeWifiAp();
            }
        }
        mSignIn.setText("登录中...");
        mSignIn.setEnabled(false);
        signIn();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        titlebarSetting();
        setContentView(R.layout.delegate_sign_in);
        ButterKnife.bind(this);

        sp = SharedPreferenceUtil.getSharedPreference(this,"User");
        mEmail.setText(sp.getString("name",""));
        mPassword.setText(sp.getString("pwd",""));
        mPassword.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, true) {
            @Override
            public int getInputType() {
                return InputType.TYPE_CLASS_PHONE;
            }
        });
    }

    private void signIn(){
              RestCreator.getRxRestService().signInBy(mEmail.getText().toString(),mPassword.getText().toString())
                      .subscribeOn(Schedulers.io())
                      .observeOn(AndroidSchedulers.mainThread())
                      .subscribe(new Consumer<JsonObject>() {
//                      .subscribe(new Consumer<String>() {
                          @Override
//                          public void accept(String s) throws Exception {
                          public void accept(JsonObject s) throws Exception {
//                              JsonObject json = GsonUtil.parseStringToJson(s);
//                              String data1 = json.get("data1").getAsString();
//                              String data2 = json.get("data2").getAsString();
                              String data1 = s.get("data1").getAsString();
                              String data2 = s.get("data2").getAsString();
                              List<InspectDevice> deviceList = GsonUtil.getGson().fromJson(data2,new TypeToken<List<InspectDevice>>(){}.getType());
                              userList = GsonUtil.getGson().fromJson(data1,new TypeToken<List<User>>(){}.getType());
                              if(userList.size()==0){
                                  Toast.makeText(SignInActivity.this, "用户名或者密码错误！", Toast.LENGTH_SHORT).show();
                                  mSignIn.setText("登录");
                                  mSignIn.setEnabled(true);

                              }else {

                                  User user = DatabaseManager.getInstance().getUserDao().load(userList.get(0).getUserID());
                                  Log.e("user",userList.get(0).getDeptID()+",");
                                  SharedPreferences.Editor edit = sp.edit();
                                  edit.putString("name",mEmail.getText().toString());
                                  edit.putString("real",userList.get(0).getRealName());
                                  edit.putString("pwd",mPassword.getText().toString());
                                  edit.putLong("id",userList.get(0).getUserID());
                                  edit.putString("permission",userList.get(0).getRoleCode());//system
                                  edit.commit();
                                  if(user == null){//未存储过。需存储下
                                      DatabaseManager.getInstance().getUserDao().insert(userList.get(0));
                                  }
                                  if(userList.get(0).getDeptID()==2){
                                      Intent intent = new Intent(SignInActivity.this,SampleActivity.class);
                                      startActivity(intent);
                                      finish();
                                  }else{
                                      if(deviceList.size()!=0){
                                          //有巡检项，看下是否需要存储。，有的话看下是否更新。2，是否需要更新。
                                          List<InspectDevice> inspectDeviceList = InspectDevicQueryUtil.getInpectDeviceListByTime(SignInActivity.this);
                                          //              Toast.makeText(SignInActivity.this, ""+inspectDeviceList.size(), Toast.LENGTH_SHORT).show();
                                          //数据库无数据，表示未存储过,存储
                                          if(inspectDeviceList.size()==0){

                                              clearData(userList.get(0).getUserID(),deviceList);
                                              InspectDevicQueryUtil.saveByList(deviceList);
                                              RxRetrofitLine();

                                          }
                                          else{
                                              //根据时间 判断是否需要更新InspectDevice，
                                              Date deviceDate = TimeUtil.dateFormat2(inspectDeviceList.get(0).getBeginTime());
                                              Date nowDate = TimeUtil.dateFormat2(new Date());
                                              if(nowDate.getTime()>deviceDate.getTime()){
                                                  //     Toast.makeText(SignInActivity.this, "is>:"+userList.get(0).getUserID(), Toast.LENGTH_SHORT).show();
                                                  //存最新数据
                                                  clearData(userList.get(0).getUserID(),deviceList);
                                                  InspectDevicQueryUtil.saveByList(deviceList);
                                                  RxRetrofitLine();

                                              }else{
                                                  //  InspectDevicQueryUtil.deleteByUserID(userList.get(0).getUserID());
                                                  Intent intents = new Intent(SignInActivity.this,PrimaryActivity.class);
                                                  startActivity(intents);
                                                  finish();

                                              }
                                          }
                                      }else{
                                          //没有分巡检项
                                          AlertDialog.Builder builder = new AlertDialog.Builder(SignInActivity.this)
                                                  .setMessage("用户未分配巡检项，请联系管理员！")
                                                  .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                                      @Override
                                                      public void onClick(DialogInterface dialog, int which) {

                                                      }
                                                  });
                                          builder.show();
                                          mSignIn.setText("登录");
                                          mSignIn.setEnabled(true);
                                      }
                                  }

                              }
                          }
                      },new Consumer<Throwable>() {
                          @Override
                          public void accept(Throwable throwable) throws Exception {
                              ThrowableUtil.exceptionManager(throwable,SignInActivity.this);
                              Intent intent = new Intent(SignInActivity.this,PrimaryActivity.class);
                              startActivity(intent);
                              finish();
                          }
                      });
    }

    @Override
    protected void onResume() {
        super.onResume();
        InputMethodManager imm = (InputMethodManager)mPassword.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);//得到系统的输入方法服务
        imm.showSoftInput(mPassword, 0);
    }

    private void clearData(Long userId, List<InspectDevice> deviceList) {
        ItemValueQueryUtil.deletItemValue(userId);
        PlaceValueQueryUtil.deleteByUserId(userId);
        InspectDevicValueQueryUtil.deleteByUserID(userId);
        //     Toast.makeText(SignInActivity.this, deviceList.size()+","+inspectDeviceList.size(), Toast.LENGTH_SHORT).show();
        InspectDevicQueryUtil.deleteByUserID(userId);
        Calendar calendar   =   new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DATE,-2);//把日期往后增加一天.整数往后推,负数往前移动
        RecordQueryUtil.deleteRecordByTime(userId,calendar.getTime());

    }

    private void RxRetrofitLine(){
        //1.如果网络正常情况下，正常返回值，清一下Line数据库值，获取最新。
        // 2、如果网络正常，服务器异常，未返回值，不清数据库，从数据库获取值
        // 3、如果网络异常，从数据库获取userList.get(0).getUserID()
        Observable grade = RestCreator.getRxRestService().getDangerGrade();
        Observable lubeDevice = RestCreator.getRxRestService().getLubeDevice(userList.get(0).getUserID());
        Observable lube= RestCreator.getRxRestService().getLubeRecord(userList.get(0).getUserID());
        Observable place = RestCreator.getRxRestService().getPlaceByUserId(userList.get(0).getUserID());
        Observable item = RestCreator.getRxRestService().getItemByUserId(userList.get(0).getUserID());

        Observable.merge(item,place,lube,lubeDevice).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                    @Override
                    public void onNext(List list) {
                        //请求所有的任务线成功后，先清一下Line表数据
                        if(list!=null&&list.size()>0){
                            Long userId =  userList.get(0).getUserID();
                            if(list.get(0) instanceof Item){
                                ItemQueryUtil.deleteByUserId(userId);
                                ItemQueryUtil.saveWithItemList(list);
            //                 Toast.makeText(SignInActivity.this, ""+list.size(), Toast.LENGTH_SHORT).show();
                            }
                            else if(list.get(0) instanceof Place){
                                 PlaceQueryUtil.deleteByUserId(userId);
                                 PlaceQueryUtil.saveWithList(list);
                    //           Toast.makeText(SignInActivity.this, "palce:"+list.size(), Toast.LENGTH_SHORT).show();

                            }
                            else if(list.get(0) instanceof LubeDevice){
                                LubeDeviceQuery.deleteByUserId(userId);
                                LubeDeviceQuery.saveWithList(list);

                            }
                            else if (list.get(0) instanceof LubeItem) {
                                LubeItemQuery.deleteByUserId(userId);
                                LubeItemQuery.saveWithList(list);
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
           //             Toast.makeText(SignInActivity.this,"请确认网络是否可用！",Toast.LENGTH_LONG).show();
                        Log.e("sign",e.getMessage()+","+e.getCause());
                        Intent intent = new Intent(SignInActivity.this,PrimaryActivity.class);
                        startActivity(intent);
                     //   finish();
                    }
                    @Override
                    public void onComplete() {
                        Intent intent = new Intent(SignInActivity.this,PrimaryActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
    }
    private boolean checkForm() {
        final String email = mEmail.getText().toString();
        final String password = mPassword.getText().toString();
        boolean isPass = true;
        if (email.isEmpty()) {
            mEmail.setError("账号不可为空");
            isPass = false;
        } else {
            mEmail.setError(null);
        }

        if (password.isEmpty() || password.length() < 1) {
            mPassword.setError("请填写至少1位数密码");
            isPass = false;
        } else {
            mPassword.setError(null);
        }

        return isPass;
    }
    /*
        状态栏沉浸式
         */
    private void titlebarSetting() {
        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN) ;//隐藏状态栏
        //透明状态栏
        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //透明导航栏
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = SignInActivity.this.getWindow();
//取消设置透明状态栏,使 ContentView 内容不再覆盖状态栏
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//设置状态栏颜色
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimary));

        ViewGroup mContentView = (ViewGroup)findViewById(Window.ID_ANDROID_CONTENT);
        View mChildView = mContentView.getChildAt(0);
        if (mChildView != null) {
            //注意不是设置 ContentView 的 FitsSystemWindows, 而是设置 ContentView 的第一个子 View . 预留出系统 View 的空间.
            ViewCompat.setFitsSystemWindows(mChildView, false);
        }
    }
}
