package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity implements View.OnClickListener{

  Animation smltobig, nothingtocome, btnanim;
  ImageView gambar1;
  TextView text1, text2;
  Button about, masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        smltobig = AnimationUtils.loadAnimation (this, R.anim.smltobig);
        nothingtocome = AnimationUtils.loadAnimation (this, R.anim.nothingtocome);
        btnanim = AnimationUtils.loadAnimation (this, R.anim.btnanim);


        gambar1 = (ImageView) findViewById(R.id.gambar1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        about = (Button) findViewById(R.id.about);
        masuk = (Button) findViewById(R.id.masuk);

        gambar1.startAnimation(smltobig);
        text1.startAnimation(nothingtocome);
        text2.startAnimation(nothingtocome);
        about.startAnimation(btnanim);
        masuk.startAnimation(btnanim);

        about.setOnClickListener((View.OnClickListener) this);
        masuk.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.about:
                startActivity(new Intent(this, About.class));
                break;
            case R.id.masuk:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }

    }
}