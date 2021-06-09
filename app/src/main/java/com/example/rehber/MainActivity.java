package com.example.rehber;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void kontrol(View view){
        //kullanıcı adı şifre kontrol doğruysa gir
        EditText edt1=(EditText)findViewById(R.id.edt1);
        EditText edt2=(EditText)findViewById(R.id.edt2);
        if(edt1.getText().toString().equals(getString(R.string.kullanici_adi))&&edt2.getText().toString().equals(getString(R.string.sifre)))
        {
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        }
        else
        {
            //hatalıysa hata ver
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("**Hata!!!!!");
            builder.setMessage("**Kullanıcı Adı veya Şifre hatalı!!!!!!!!!!!");
            builder.show();
        }



    }
}