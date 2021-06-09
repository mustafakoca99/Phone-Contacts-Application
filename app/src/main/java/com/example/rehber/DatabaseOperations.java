package com.example.rehber;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DatabaseOperations {
        Context contex;
        DatabaseOperations(Context cn){contex=cn;}
        public Cursor VeriAl(){
                //raw query ile yazdım
                SQLiteDatabase sqLiteDatabase=new DatabaseHelper(contex).getReadableDatabase();
                Cursor cursor=sqLiteDatabase.rawQuery("select * from Kisiler",null);
                return cursor;
        }
        public boolean VeriEkle(ContentValues cv){
                //burda sql komutunun kendi içinde gömülü kodu gördüm
                SQLiteDatabase sqLiteDatabase=new DatabaseHelper(contex).getWritableDatabase();
                long newRowId=sqLiteDatabase.insert("Kisiler",null,cv);
                return newRowId != -1 ? true : false;
        }
        public int VeriSil(ContentValues cv){
                SQLiteDatabase sqLiteDatabase=new DatabaseHelper(contex).getWritableDatabase();
                String id=cv.get("id").toString();
                int deleteRowId=sqLiteDatabase.delete("Kisiler","id"+cv.getAsString("id"),null);
                return deleteRowId;
        }
        public int VeriGuncelle(ContentValues cv){
                SQLiteDatabase sqLiteDatabase=new DatabaseHelper(contex).getWritableDatabase();
                int updateRowId=sqLiteDatabase.update("Kisiler",cv,"id"+cv.getAsString("id"),null);
                return  updateRowId;
        }
}