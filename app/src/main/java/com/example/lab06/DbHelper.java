package com.example.lab06;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class DbHelper extends SQLiteOpenHelper {


    public DbHelper(Context context) {
        super(context, "TODOLIST", null, 1);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE TODO(ID INTEGER PRIMARY KEY AUTOINCREMENT, " + "TITLE TEXT, CONTENT TEXT, DATE TEXT, TYPE TEXT, STATUS INTEGER)";
        sqLiteDatabase.execSQL(sql);
        String data = "INSERT INTO TODO VALUES(1, 'Học Java', 'Học Java cơ bản', '27/2/2023', 'Bình thường',1)," +
                "(2, 'Học React Native', 'Hoc React Native cơ bản', '24/3/2023','Khá', 0)," +
                "(3, 'Hoc Kotlin', 'Học kotlin cơ bản', '1/4/2023', 'D', 0)";

        sqLiteDatabase.execSQL(data);
    }
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if(i != i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS TODO");

            onCreate(sqLiteDatabase);
        }
}}