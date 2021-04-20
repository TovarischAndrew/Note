package com.example.sqlite_pr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static String COLUMN_NAME="title";
    public static String DATA="data";
    public static String TABLE="storage";

    public DBHelper(Context context){
        super(context, "db", null, 1);
    }
//TODO : подумать как реализовать по другому
    @Override
    public void onCreate(SQLiteDatabase db){
        String SQL_CREATE_GUESTS_TABLE="CREATE TABLE storage ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NAME + " VARCHAR(255) NOT NULL, "
                + DATA + " VARCHAR(255) NOT NULL);";

        db.execSQL(SQL_CREATE_GUESTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
