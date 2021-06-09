package com.example.rehber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    Button btn = (Button)findViewById(R.id.button2);
    TextView txt=(TextView)findViewById(R.id.textView2);
    DatabaseOperations databaseOperations;
    ContentValues koca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //id ye göre veri sil!!!!
                databaseOperations.VeriSil(koca);
            }
        });
    }
}