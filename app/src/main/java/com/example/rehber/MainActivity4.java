package com.example.rehber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    /*TextView TV1;
    TextView TV2;
    TextView TV3;
    TextView TV4;
    TextView TV5;
    TextView TV6;*/
    DatabaseOperations databaseOperations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        databaseOperations.VeriAl();
    }
}