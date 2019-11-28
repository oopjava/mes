package com.yxst.mes.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yxst.mes.database.model.Record;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECORD".
*/
public class RecordDao extends AbstractDao<Record, Long> {

    public static final String TABLENAME = "RECORD";

    /**
     * Properties of entity Record.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CheckValue = new Property(1, String.class, "CheckValue", false, "CHECK_VALUE");
        public final static Property CheckConclusion = new Property(2, int.class, "CheckConclusion", false, "CHECK_CONCLUSION");
        public final static Property CheckUser = new Property(3, String.class, "CheckUser", false, "CHECK_USER");
        public final static Property UserId = new Property(4, Long.class, "UserId", false, "USER_ID");
        public final static Property Remark = new Property(5, String.class, "Remark", false, "REMARK");
        public final static Property InputDate = new Property(6, String.class, "InputDate", false, "INPUT_DATE");
        public final static Property DangerTitle = new Property(7, String.class, "DangerTitle", false, "DANGER_TITLE");
        public final static Property EquipmentID = new Property(8, Long.class, "EquipmentID", false, "EQUIPMENT_ID");
        public final static Property PlanId = new Property(9, Long.class, "PlanId", false, "PLAN_ID");
        public final static Property LineID = new Property(10, Long.class, "LineID", false, "LINE_ID");
        public final static Property InspectionItemID = new Property(11, Long.class, "InspectionItemID", false, "INSPECTION_ITEM_ID");
        public final static Property BeginTime = new Property(12, String.class, "BeginTime", false, "BEGIN_TIME");
        public final static Property EndTime = new Property(13, String.class, "EndTime", false, "END_TIME");
        public final static Property CheckStatus = new Property(14, int.class, "CheckStatus", false, "CHECK_STATUS");
        public final static Property InspectionTime = new Property(15, java.util.Date.class, "InspectionTime", false, "INSPECTION_TIME");
        public final static Property UpdateUser = new Property(16, String.class, "UpdateUser", false, "UPDATE_USER");
        public final static Property UpdateTime = new Property(17, java.util.Date.class, "UpdateTime", false, "UPDATE_TIME");
        public final static Property ClassCode = new Property(18, int.class, "ClassCode", false, "CLASS_CODE");
        public final static Property CreateUser = new Property(19, String.class, "CreateUser", false, "CREATE_USER");
        public final static Property CreateTime = new Property(20, java.util.Date.class, "CreateTime", false, "CREATE_TIME");
    }


    public RecordDao(DaoConfig config) {
        super(config);
    }
    
    public RecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECORD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"CHECK_VALUE\" TEXT," + // 1: CheckValue
                "\"CHECK_CONCLUSION\" INTEGER NOT NULL ," + // 2: CheckConclusion
                "\"CHECK_USER\" TEXT," + // 3: CheckUser
                "\"USER_ID\" INTEGER," + // 4: UserId
                "\"REMARK\" TEXT," + // 5: Remark
                "\"INPUT_DATE\" TEXT," + // 6: InputDate
                "\"DANGER_TITLE\" TEXT," + // 7: DangerTitle
                "\"EQUIPMENT_ID\" INTEGER," + // 8: EquipmentID
                "\"PLAN_ID\" INTEGER," + // 9: PlanId
                "\"LINE_ID\" INTEGER," + // 10: LineID
                "\"INSPECTION_ITEM_ID\" INTEGER," + // 11: InspectionItemID
                "\"BEGIN_TIME\" TEXT," + // 12: BeginTime
                "\"END_TIME\" TEXT," + // 13: EndTime
                "\"CHECK_STATUS\" INTEGER NOT NULL ," + // 14: CheckStatus
                "\"INSPECTION_TIME\" INTEGER," + // 15: InspectionTime
                "\"UPDATE_USER\" TEXT," + // 16: UpdateUser
                "\"UPDATE_TIME\" INTEGER," + // 17: UpdateTime
                "\"CLASS_CODE\" INTEGER NOT NULL ," + // 18: ClassCode
                "\"CREATE_USER\" TEXT," + // 19: CreateUser
                "\"CREATE_TIME\" INTEGER);"); // 20: CreateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECORD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Record entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String CheckValue = entity.getCheckValue();
        if (CheckValue != null) {
            stmt.bindString(2, CheckValue);
        }
        stmt.bindLong(3, entity.getCheckConclusion());
 
        String CheckUser = entity.getCheckUser();
        if (CheckUser != null) {
            stmt.bindString(4, CheckUser);
        }
 
        Long UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindLong(5, UserId);
        }
 
        String Remark = entity.getRemark();
        if (Remark != null) {
            stmt.bindString(6, Remark);
        }
 
        String InputDate = entity.getInputDate();
        if (InputDate != null) {
            stmt.bindString(7, InputDate);
        }
 
        String DangerTitle = entity.getDangerTitle();
        if (DangerTitle != null) {
            stmt.bindString(8, DangerTitle);
        }
 
        Long EquipmentID = entity.getEquipmentID();
        if (EquipmentID != null) {
            stmt.bindLong(9, EquipmentID);
        }
 
        Long PlanId = entity.getPlanId();
        if (PlanId != null) {
            stmt.bindLong(10, PlanId);
        }
 
        Long LineID = entity.getLineID();
        if (LineID != null) {
            stmt.bindLong(11, LineID);
        }
 
        Long InspectionItemID = entity.getInspectionItemID();
        if (InspectionItemID != null) {
            stmt.bindLong(12, InspectionItemID);
        }
 
        String BeginTime = entity.getBeginTime();
        if (BeginTime != null) {
            stmt.bindString(13, BeginTime);
        }
 
        String EndTime = entity.getEndTime();
        if (EndTime != null) {
            stmt.bindString(14, EndTime);
        }
        stmt.bindLong(15, entity.getCheckStatus());
 
        java.util.Date InspectionTime = entity.getInspectionTime();
        if (InspectionTime != null) {
            stmt.bindLong(16, InspectionTime.getTime());
        }
 
        String UpdateUser = entity.getUpdateUser();
        if (UpdateUser != null) {
            stmt.bindString(17, UpdateUser);
        }
 
        java.util.Date UpdateTime = entity.getUpdateTime();
        if (UpdateTime != null) {
            stmt.bindLong(18, UpdateTime.getTime());
        }
        stmt.bindLong(19, entity.getClassCode());
 
        String CreateUser = entity.getCreateUser();
        if (CreateUser != null) {
            stmt.bindString(20, CreateUser);
        }
 
        java.util.Date CreateTime = entity.getCreateTime();
        if (CreateTime != null) {
            stmt.bindLong(21, CreateTime.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Record entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String CheckValue = entity.getCheckValue();
        if (CheckValue != null) {
            stmt.bindString(2, CheckValue);
        }
        stmt.bindLong(3, entity.getCheckConclusion());
 
        String CheckUser = entity.getCheckUser();
        if (CheckUser != null) {
            stmt.bindString(4, CheckUser);
        }
 
        Long UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindLong(5, UserId);
        }
 
        String Remark = entity.getRemark();
        if (Remark != null) {
            stmt.bindString(6, Remark);
        }
 
        String InputDate = entity.getInputDate();
        if (InputDate != null) {
            stmt.bindString(7, InputDate);
        }
 
        String DangerTitle = entity.getDangerTitle();
        if (DangerTitle != null) {
            stmt.bindString(8, DangerTitle);
        }
 
        Long EquipmentID = entity.getEquipmentID();
        if (EquipmentID != null) {
            stmt.bindLong(9, EquipmentID);
        }
 
        Long PlanId = entity.getPlanId();
        if (PlanId != null) {
            stmt.bindLong(10, PlanId);
        }
 
        Long LineID = entity.getLineID();
        if (LineID != null) {
            stmt.bindLong(11, LineID);
        }
 
        Long InspectionItemID = entity.getInspectionItemID();
        if (InspectionItemID != null) {
            stmt.bindLong(12, InspectionItemID);
        }
 
        String BeginTime = entity.getBeginTime();
        if (BeginTime != null) {
            stmt.bindString(13, BeginTime);
        }
 
        String EndTime = entity.getEndTime();
        if (EndTime != null) {
            stmt.bindString(14, EndTime);
        }
        stmt.bindLong(15, entity.getCheckStatus());
 
        java.util.Date InspectionTime = entity.getInspectionTime();
        if (InspectionTime != null) {
            stmt.bindLong(16, InspectionTime.getTime());
        }
 
        String UpdateUser = entity.getUpdateUser();
        if (UpdateUser != null) {
            stmt.bindString(17, UpdateUser);
        }
 
        java.util.Date UpdateTime = entity.getUpdateTime();
        if (UpdateTime != null) {
            stmt.bindLong(18, UpdateTime.getTime());
        }
        stmt.bindLong(19, entity.getClassCode());
 
        String CreateUser = entity.getCreateUser();
        if (CreateUser != null) {
            stmt.bindString(20, CreateUser);
        }
 
        java.util.Date CreateTime = entity.getCreateTime();
        if (CreateTime != null) {
            stmt.bindLong(21, CreateTime.getTime());
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Record readEntity(Cursor cursor, int offset) {
        Record entity = new Record( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // CheckValue
            cursor.getInt(offset + 2), // CheckConclusion
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // CheckUser
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // UserId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Remark
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // InputDate
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // DangerTitle
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // EquipmentID
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // PlanId
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // LineID
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // InspectionItemID
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // BeginTime
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // EndTime
            cursor.getInt(offset + 14), // CheckStatus
            cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)), // InspectionTime
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // UpdateUser
            cursor.isNull(offset + 17) ? null : new java.util.Date(cursor.getLong(offset + 17)), // UpdateTime
            cursor.getInt(offset + 18), // ClassCode
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // CreateUser
            cursor.isNull(offset + 20) ? null : new java.util.Date(cursor.getLong(offset + 20)) // CreateTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Record entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCheckValue(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCheckConclusion(cursor.getInt(offset + 2));
        entity.setCheckUser(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setRemark(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setInputDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDangerTitle(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setEquipmentID(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setPlanId(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setLineID(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setInspectionItemID(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setBeginTime(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setEndTime(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCheckStatus(cursor.getInt(offset + 14));
        entity.setInspectionTime(cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)));
        entity.setUpdateUser(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setUpdateTime(cursor.isNull(offset + 17) ? null : new java.util.Date(cursor.getLong(offset + 17)));
        entity.setClassCode(cursor.getInt(offset + 18));
        entity.setCreateUser(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setCreateTime(cursor.isNull(offset + 20) ? null : new java.util.Date(cursor.getLong(offset + 20)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Record entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Record entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Record entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}