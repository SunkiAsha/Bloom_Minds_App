package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database_helper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    public static final String Database_Name="users.db";
    public static final String Table_name="user_details";
    public static final String COLUMN_1="NAME";
    public static final String COLUMN_2="PHONE";
    public static final String COLUMN_3="USERNAME";
    public static final String COLUMN_4="PASSWORD";

    public Database_helper(@Nullable Context context) {
        super(context, Database_Name,null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE User_details(NAME varchar(20),PHONE varchar(10),USERNAME varchar(30),PASSWORD varchar(20))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+Table_name);
        onCreate(db);
    }
    public boolean inserdata(String NAME, String PHONE,String USERNAME,String PASSWORD){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_1,NAME);
        cv.put(COLUMN_2,PHONE);
        cv.put(COLUMN_3,USERNAME);
        cv.put(COLUMN_4,PASSWORD);
        long res = db.insert(Table_name,null,cv);
        if(res==-1){
            return false;
        }
        else{
            return true;
        }
    }
}
