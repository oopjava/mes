package com.yxst.mes.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created By YuanCheng on 2019/6/23 12:24
 */
public class SharedPreferenceUtil {
    public static SharedPreferences getSharedPreference(Context cxt,String spName){
        SharedPreferences sp = cxt.getSharedPreferences(spName,Context.MODE_PRIVATE);
        return sp;
    }
    public static Long getId(Context cxt,String spName){
        SharedPreferences sp = cxt.getSharedPreferences(spName,Context.MODE_PRIVATE);
        Long id = sp.getLong("id",0);
        return id;
    }
    public static String getName(Context cxt,String spName){
        SharedPreferences sp = cxt.getSharedPreferences(spName,Context.MODE_PRIVATE);
        String name = sp.getString("name","");
        return name;
    }
    public static String getRealName(Context cxt,String spName){
        SharedPreferences sp = cxt.getSharedPreferences(spName,Context.MODE_PRIVATE);
        String name = sp.getString("real","");
        return name;
    }
    public static String getRoleCode(Context cxt,String spName){
        SharedPreferences sp = cxt.getSharedPreferences(spName,Context.MODE_PRIVATE);
        String roleCode = sp.getString("permission","");//administrator
        return roleCode;
    }
}
