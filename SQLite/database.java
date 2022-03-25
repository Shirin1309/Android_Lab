package com.example.shirin_sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {


    public database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "shop", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL("CREATE TABLE employee(eid INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(30),role VARCHAR(10));");
        } catch (SQLException e){ }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
     try{
         db.execSQL("DROP TABLE IF EXISTS employee;");
     }catch (SQLException e){ }
    }

    public long insertData(String user, String role) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", user);
        cv.put("role", role);
        long rowid = db.insert("employee", null, cv);
        return rowid;
    }

    public String display() {
        SQLiteDatabase db = getWritableDatabase();
        String columns[] = {"eid", "name", "role"};
        Cursor cr = db.query("employee", columns, null, null, null, null, null);
        StringBuffer buffer = new StringBuffer();
        while ( cr.moveToNext())
        {
            int pid = cr.getInt(0);
            String name = cr.getString(1);
            String role = cr.getString(2);

            buffer.append(pid +" --- "+name+"---"+role + "\n");
        }
        return buffer.toString();
    }
}
