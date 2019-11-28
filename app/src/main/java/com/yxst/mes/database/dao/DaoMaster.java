package com.yxst.mes.database.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 2): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 2;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        CycleDao.createTable(db, ifNotExists);
        DeviceDao.createTable(db, ifNotExists);
        GradeDao.createTable(db, ifNotExists);
        InspectDeviceDao.createTable(db, ifNotExists);
        InspectDeviceValueDao.createTable(db, ifNotExists);
        InspectImageDao.createTable(db, ifNotExists);
        InspectLineDao.createTable(db, ifNotExists);
        ItemDao.createTable(db, ifNotExists);
        ItemValueDao.createTable(db, ifNotExists);
        LineDao.createTable(db, ifNotExists);
        LubeDeviceDao.createTable(db, ifNotExists);
        LubeImageDao.createTable(db, ifNotExists);
        LubeItemDao.createTable(db, ifNotExists);
        MonitorDao.createTable(db, ifNotExists);
        PlaceDao.createTable(db, ifNotExists);
        PlaceValueDao.createTable(db, ifNotExists);
        PlanDao.createTable(db, ifNotExists);
        RecordDao.createTable(db, ifNotExists);
        SampleDao.createTable(db, ifNotExists);
        UndetectDao.createTable(db, ifNotExists);
        UnLubeDao.createTable(db, ifNotExists);
        UserDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        CycleDao.dropTable(db, ifExists);
        DeviceDao.dropTable(db, ifExists);
        GradeDao.dropTable(db, ifExists);
        InspectDeviceDao.dropTable(db, ifExists);
        InspectDeviceValueDao.dropTable(db, ifExists);
        InspectImageDao.dropTable(db, ifExists);
        InspectLineDao.dropTable(db, ifExists);
        ItemDao.dropTable(db, ifExists);
        ItemValueDao.dropTable(db, ifExists);
        LineDao.dropTable(db, ifExists);
        LubeDeviceDao.dropTable(db, ifExists);
        LubeImageDao.dropTable(db, ifExists);
        LubeItemDao.dropTable(db, ifExists);
        MonitorDao.dropTable(db, ifExists);
        PlaceDao.dropTable(db, ifExists);
        PlaceValueDao.dropTable(db, ifExists);
        PlanDao.dropTable(db, ifExists);
        RecordDao.dropTable(db, ifExists);
        SampleDao.dropTable(db, ifExists);
        UndetectDao.dropTable(db, ifExists);
        UnLubeDao.dropTable(db, ifExists);
        UserDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(CycleDao.class);
        registerDaoClass(DeviceDao.class);
        registerDaoClass(GradeDao.class);
        registerDaoClass(InspectDeviceDao.class);
        registerDaoClass(InspectDeviceValueDao.class);
        registerDaoClass(InspectImageDao.class);
        registerDaoClass(InspectLineDao.class);
        registerDaoClass(ItemDao.class);
        registerDaoClass(ItemValueDao.class);
        registerDaoClass(LineDao.class);
        registerDaoClass(LubeDeviceDao.class);
        registerDaoClass(LubeImageDao.class);
        registerDaoClass(LubeItemDao.class);
        registerDaoClass(MonitorDao.class);
        registerDaoClass(PlaceDao.class);
        registerDaoClass(PlaceValueDao.class);
        registerDaoClass(PlanDao.class);
        registerDaoClass(RecordDao.class);
        registerDaoClass(SampleDao.class);
        registerDaoClass(UndetectDao.class);
        registerDaoClass(UnLubeDao.class);
        registerDaoClass(UserDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
