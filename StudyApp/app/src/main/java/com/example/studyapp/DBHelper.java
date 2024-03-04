package com.example.studyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "Log.db";

    public DBHelper( Context context) {
        super(context, "Log.db", null , 1);
    }


    @Override
    public void onCreate(SQLiteDatabase Logdb) {
        Logdb.execSQL("create Table users (username TEXT primary key, password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase Logdb, int oldVersion, int newVersion) {
        Logdb.execSQL("drop Table if exists users");

    }
    public Boolean insertData (String username, String password) {
        SQLiteDatabase Logdb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = Logdb.insert("users", null, contentValues);
        if(result==-1) return false;
        else
            return true;


    }
    public Boolean checkusername(String username){
        SQLiteDatabase Logdb = this.getWritableDatabase();
        Cursor cursor = Logdb.rawQuery("Select * from users where username = ?", new String[]{username});
        if (cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean checkusernamepassword (String username, String password){
        SQLiteDatabase Logdb = this.getWritableDatabase();
        Cursor cursor = Logdb.rawQuery("Select * from users where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }



}
