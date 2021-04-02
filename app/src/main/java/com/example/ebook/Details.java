package com.example.ebook;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {

    ImageView imgdetails;
    TextView tvdetails,tvjudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi);

        imgdetails = findViewById(R.id.image_detail);
        tvjudul =  findViewById(R.id.judul_detail);
        tvdetails = findViewById(R.id.isi_detail);

        tvjudul.setText(getIntent().getStringExtra("TITLE_KEY"));
        tvdetails.setText(getIntent().getStringExtra("DESC_KEY"));
        String URL_IMAGE = getIntent().getStringExtra("IMAGE_KEY");

        Glide.with(this)
                .load(URL_IMAGE)
                .into(imgdetails);


    }
}
