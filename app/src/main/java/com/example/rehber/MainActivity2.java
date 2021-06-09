package com.example.rehber;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    DatabaseOperations databaseOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Context deger2=this;



        databaseOperations = new DatabaseOperations(this);
        Cursor cursor = databaseOperations.VeriAl();


        ListView ltv = (ListView) findViewById(R.id.lsv);

        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> AdiSoyadi = new ArrayList<>();
        ArrayList<String> TelefonNumarasi = new ArrayList<>();
        ArrayList<String> Mail = new ArrayList<>();
        ArrayList<String> KisiNotu = new ArrayList<>();
        ArrayList<String> KisininEklenmeTarihi = new ArrayList<>();
        ArrayList<String> DogumTarihi = new ArrayList<>();




        if (cursor.getCount() != -1) {
            while (cursor.moveToNext()) {
                id.add(cursor.getInt(0));
                AdiSoyadi.add(cursor.getString(1));
                TelefonNumarasi.add(cursor.getString(2));
                Mail.add(cursor.getString(3));
                KisiNotu.add(cursor.getString(4));
                KisininEklenmeTarihi.add(cursor.getString(5));
                DogumTarihi.add(cursor.getString(6));
            }
        }
        MyAdapter myAdapter = new MyAdapter(this, AdiSoyadi, TelefonNumarasi, Mail, KisiNotu, KisininEklenmeTarihi, DogumTarihi, id);
        ltv.setAdapter(myAdapter);
        ltv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent();
                intent.setData(Uri.parse("tel:" + TelefonNumarasi.get(position)));
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);

            }

        });

        ltv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                String[] sec={"Kişinin Detaylarını Gör","Kişiyi Düzenle","Kişiyi Sil"};
                builder.setItems(sec, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:{
                                Intent in=new Intent(MainActivity2.this,MainActivity4.class);
                                startActivity(in);
                            }
                            break;
                            case 1:{
                                Intent in=new Intent(MainActivity2.this,MainActivity5.class);
                                startActivity(in);
                            }
                            break;
                            case 2:{
                                Intent in=new Intent(MainActivity2.this,MainActivity6.class);
                                startActivity(in);

                            }
                            break;
                            default:
                                break;
                        }
                    }
                });
                builder.show();
                return true;
            }
        });

    }

    public void Ekle(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
}