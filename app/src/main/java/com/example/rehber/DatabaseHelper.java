package com.example.rehber;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    static String veritabaniismi="Kisiler";
    static int dbversion=1;


    public DatabaseHelper(Context context) {
        super(context, veritabaniismi, null, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table Kisiler(id INTEGER primary key autoincrement,AdSoyad TEXT not null,TelefonNo TEXT not null,Mail TEXT,KisiselNot TEXT,EklenmeTarih TEXT not null,DogumTarihi TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
