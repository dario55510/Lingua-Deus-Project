package com.example.linguadeus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class prodavnica1_ucenje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodavnica1_ucenje);
    }
    public void button1(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec1);
        rec_popup.show();
    }
    public void bs1_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak1_p1l1);
        md.start();
    }
    public void button2(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec2);
        rec_popup.show();
    }
    public void bs2_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak2_p1l1);
        md.start();
    }
    public void button3(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec3);
        rec_popup.show();
    }
    public void bs3_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak3_p1l1);
        md.start();
    }
    public void button4(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec4);
        rec_popup.show();
    }
    public void bs4_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak4_p1l1);
        md.start();
    }
    public void button5(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec5);
        rec_popup.show();
    }
    public void bs5_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak5_p1l1);
        md.start();
    }
    public void button6(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec6);
        rec_popup.show();
    }
    public void bs6_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak6_p1l1);
        md.start();
    }
    public void button7(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec7);
        rec_popup.show();
    }
    public void bs7_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak7_p1l1);
        md.start();
    }
    public void button8(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec8);
        rec_popup.show();
    }
    public void bs8_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak8_p1l1);
        md.start();
    }
    public void button9(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija1_rec9);
        rec_popup.show();
    }
    public void bs9_p1l1(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak9_p1l1);
        md.start();
    }
    public void button10(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija2_rec1);
        rec_popup.show();
    }
    public void bs1_p1l2(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak1_p1l2);
        md.start();
    }
    public void button11(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija2_rec2);
        rec_popup.show();
    }
    public void bs2_p1l2(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak2_p2l2);
        md.start();
    }
    public void button12(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija2_rec3);
        rec_popup.show();
    }
    public void bs3_p1l2(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak3_p2l2);
        md.start();
    }
    public void button13(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija2_rec4);
        rec_popup.show();
    }
    public void bs4_p1l2(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak4_p2l2);
        md.start();
    }
    public void button14(View view){
        Dialog rec_popup;
        rec_popup=new Dialog(this);
        rec_popup.setContentView(R.layout.up_prodavnica1_lekcija2_rec5);
        rec_popup.show();
    }
    public void bs5_p1l2(View view){
        final MediaPlayer md=MediaPlayer.create(this, R.raw.snimak5_p2l2);
        md.start();
    }
}