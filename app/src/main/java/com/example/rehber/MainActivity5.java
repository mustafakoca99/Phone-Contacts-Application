package com.example.rehber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//GÜNCELLEME SAYFASI
public class MainActivity5 extends AppCompatActivity {
    DatabaseOperations databaseOperations;
    //TextView txt=(TextView)findViewById(R.id.textView);
    Button btn=(Button)findViewById(R.id.button);
    ContentValues mustafa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        //verileri yaz
        databaseOperations.VeriAl();
        //daha sonra olanları guncelle
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseOperations.VeriGuncelle(mustafa);
            }
        });
    }
}