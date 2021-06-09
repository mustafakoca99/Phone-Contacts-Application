package com.example.rehber;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class MyAdapter extends ArrayAdapter<String> {
    ArrayList<Integer> id;
    ArrayList<String> AdSoyad;
    ArrayList<String> TelefonNo;
    ArrayList<String> Mail;
    ArrayList<String> KisiselNot;
    ArrayList<String> EklenmeTarih;
    ArrayList<String> DogumTarihi;
    Activity contex;
    public MyAdapter(Activity context, ArrayList<String> AdSoyad,ArrayList<String> TelefonNo,ArrayList<String> Mail,ArrayList<String> KisiselNot,ArrayList<String> EklenmeTarih,ArrayList<String> DogumTarihi,ArrayList<Integer> id) {
        super(context, R.layout.listview, AdSoyad);
        this.AdSoyad=AdSoyad;
        this.TelefonNo=TelefonNo;
        this.Mail=Mail;
        this.KisiselNot=KisiselNot;
        this.EklenmeTarih=EklenmeTarih;
        this.DogumTarihi=DogumTarihi;
        this.contex=context;
        this.id=id;

    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater lyt=contex.getLayoutInflater();
        View listeleman=lyt.inflate(R.layout.listview,null,true);
        TextView txAd=(TextView) listeleman.findViewById(R.id.text1);
        TextView txTel=(TextView) listeleman.findViewById(R.id.text2);

        txAd.setText(AdSoyad.get(position));
        txTel.setText(TelefonNo.get(position));
        return listeleman;
    }
}
