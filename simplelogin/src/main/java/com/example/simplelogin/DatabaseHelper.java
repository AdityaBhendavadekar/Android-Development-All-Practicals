package com.example.simplelogin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DBNAME = "DEMO";
    private static final String TNAME= "user_info";
    private static final String D_NAME="uname";
    private static final String D_PASS="upass";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TNAME+" ("+D_NAME+" TEXT, "+D_PASS+" TEXT"+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+TNAME);
        onCreate(sqLiteDatabase);
    }
}
