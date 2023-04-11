package com.example.linguadeus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //funkcije vezane za startovanje popupova
    public void button_uvod1(View view){
        Dialog uvod1_popup;
        uvod1_popup=new Dialog(this);
        uvod1_popup.setContentView(R.layout.uvod1_popup);
        uvod1_popup.show();
    }
    public void button_prodavnica1(View view){
        Dialog prodavnica1_popup;
        prodavnica1_popup=new Dialog(this);
        prodavnica1_popup.setContentView(R.layout.prodavnica1_popup);
        prodavnica1_popup.show();
    }
    public void button_apoteka1(View view){
        Dialog apoteka1_popup;
        apoteka1_popup=new Dialog(this);
        apoteka1_popup.setContentView(R.layout.apoteka1_popup);
        apoteka1_popup.show();
    }
    public void button_snalazenje1(View view){
        Dialog snalazenje1_popup;
        snalazenje1_popup=new Dialog(this);
        snalazenje1_popup.setContentView(R.layout.snalazenje1_popup);
        snalazenje1_popup.show();
    }


    //buttons in popup uvod1
    public void popup_uvod1_b1(View view){
        startActivity(new Intent(MainActivity.this, uvod1_lekcija1.class));
    }
    public void popup_uvod1_b2(View view){
        startActivity(new Intent(MainActivity.this, uvod1_lekcija2.class));
    }
    public void popup_uvod1_b3(View view){
        startActivity(new Intent(MainActivity.this, uvod1_lekcija3.class));
    }
    public void popup_prodavnica1_b1(View view){
        startActivity(new Intent(MainActivity.this, prodavnica1_lekcija1.class));
    }
    public void popup_prodavnica1_b2(View view){
        startActivity(new Intent(MainActivity.this, prodavnica1_lekcija2.class));
    }
    public void popup_apoteka_b1(View view){
        startActivity(new Intent(MainActivity.this, medicina1_lekcija1.class));
    }
    public void popup_apoteka_b2(View view){
        startActivity(new Intent(MainActivity.this, medicina1_lekcija2.class));
    }
    public void popup_snalaznje1_b1(View view){
        startActivity(new Intent(MainActivity.this, snalazenje1_lekcija1.class));
    }
    //buttons za ucenje
    public void popup_uvod1_ucenje(View view){
        startActivity(new Intent(MainActivity.this, uvod1_ucenje1.class));
    }
    public void popup_prodavnica1_ucenje(View view){
        startActivity(new Intent(MainActivity.this, prodavnica1_ucenje.class));
    }
    public void popup_apoteka_ucenje(View view){
        startActivity(new Intent(MainActivity.this, medicina1_ucenje.class));
    }
    public void popup_snalazenje1_ucenje(View view){
        startActivity(new Intent(MainActivity.this, snalazenje1_ucenje1.class));
    }
}