package com.example.linguadeus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class snalazenje1_ucenje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snalazenje1_ucenje);
    }
    public void button1(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec1);
        rec_popup.show();
    }
    public void bs1_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak1_s1l1);
        md.start();
    }
    public void button2(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec2);
        rec_popup.show();
    }
    public void bs2_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak2_s1l1);
        md.start();
    }
    public void button3(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec3);
        rec_popup.show();
    }
    public void bs3_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak3_s1l1);
        md.start();
    }
    public void button4(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec4);
        rec_popup.show();
    }
    public void bs4_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak4_s1l1);
        md.start();
    }
    public void button5(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec5);
        rec_popup.show();
    }
    public void bs5_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak5_s1l1);
        md.start();
    }
    public void button6(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec6);
        rec_popup.show();
    }
    public void bs6_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak6_s1l1);
        md.start();
    }
    public void button7(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.pu_snalazenje1_lekcija1_rec7);
        rec_popup.show();
    }
    public void bs7_s1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak7_s1l1);
        md.start();
    }
}