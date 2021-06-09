package com.example.rehber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView TV1;
    TextView TV2;
    TextView TV3;
    TextView TV4;
    TextView TV5;
    TextView TV6;

    EditText EDT1;
    EditText EDT2;
    EditText EDT3;
    EditText EDT4;
    EditText EDT5;
    EditText EDT6;

    Button BTN1;

    DatabaseOperations databaseOperations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TV1=(TextView) findViewById(R.id.EkleTV1);
        EDT1=(EditText) findViewById(R.id.EkleEDT1);

        TV2=(TextView) findViewById(R.id.EkleTV2);
        EDT2=(EditText) findViewById(R.id.EkleEDT2);

        TV3=(TextView) findViewById(R.id.EkleTV3);
        EDT3=(EditText) findViewById(R.id.EkleEDT3);

        TV4=(TextView) findViewById(R.id.EkleTV4);
        EDT4=(EditText) findViewById(R.id.EkleEDT4);

        TV5=(TextView) findViewById(R.id.EkleTV5);
        EDT5=(EditText) findViewById(R.id.EkleEDT5);

        TV6=(TextView) findViewById(R.id.EkleTV6);
        EDT6=(EditText) findViewById(R.id.EkleEDT6);

        BTN1=(Button) findViewById(R.id.EkleBTN1);

        databaseOperations=new DatabaseOperations(this);



    }

    public void Ekle(View view) {
        ContentValues cv=new ContentValues();
        cv.put("AdSoyad",EDT1.getText().toString());
        cv.put("TelefonNo",EDT2.getText().toString());
        cv.put("Mail",EDT3.getText().toString());
        cv.put("KisiselNot",EDT4.getText().toString());
        cv.put("EklenmeTarih",EDT5.getText().toString());
        cv.put("DogumTarihi",EDT6.getText().toString());
        databaseOperations.VeriEkle(cv);
    }
}