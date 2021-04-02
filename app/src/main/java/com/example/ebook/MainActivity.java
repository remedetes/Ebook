package com.example.ebook;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvHeroes = findViewById(R.id.androidList);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list, this);
        rvHeroes.setAdapter(listHeroAdapter);
    }



//    int[] images = {R.drawable.buku1, R.drawable.buku2, R.drawable.buku3, R.drawable.buku4, R.drawable.buku55, R.drawable.buku6, R.drawable.buku7, R.drawable.buku8, R.drawable.buku9, R.drawable.buku10, R.drawable.buku11, R.drawable.buku12};
//
//    String[] judul = {"Si Anak Pemberani", "Si Anak Spesial", "Si Anak Kuat", "Si Anak Cahaya", "Negeri Para Bedebah", "Pulang", "Matahari", "Earth", "Bulan", "Pergi", "Rindu", "Hujan"};
//
//    String[] Sinopsis =
//            {"Buku ini tentang Eliana, si anak pemberani yang membela tanah, sungai, hutan, dan lembah kampungnya. ",
//                    "Buku ini tentang Burlian, si anak keras kepala yang memiliki masa kecil sangat spesial. ",
//                    "Buku ini tentang Amelia, kisah anak yang memiliki mimpi-mimpi hebat untuk kampung tercintanya.",
//                    "Buku ini tentang Nurmas, si anak cahaya yang memiliki petualangan masa kecil yang penuh keceriaan dan menakjubkan. Apa yang sebenarnya dilakukan oleh Nurmas hingga penduduk seluruh kampung selalu mengingat kejadian yang membuatnya resmi dipanggil si anak cahaya? ",
//                    "Di negeri para bedebah, kisah fiksi kalah seru dibanding kisah nyata. Di negeri para bedebah, musang berbulu domba berkeliaran di halaman rumah.",
//                    "Sebuah kisah tentang perjalanan pulang, melalui pertarungan demi pertarungan, untuk memeluk erat semua kebencian dan rasa sakit.'",
//                    "Namanya Ali, 15 tahun, kelas X. Jika saja orangtuanya mengizinkan, seharusnya dia sudah duduk di tingkat akhir ilmu fisika program doktor di universitas ternama. Ali tidak menyukai sekolahnya, guru-gurunya, teman-teman sekelasnya. Semua membosankan baginya.",
//                    "Namaku Raib, usiaku 15 tahun, kelas sepuluh. Aku anak perempuan seperti kalian, adik-adik kalian, tetangga kalian. Aku punya dua kucing, namanya si Putih dan si Hitam. Mama dan papaku menyenangkan.",
//                    "Namanya Seli, usianya 15 tahun, kelas sepuluh, dan dia salah satu teman baikku. Dia sama seperti remaja yang lain. Menyukai hal yang sama, mendengarkan lagu-lagu yang sama, pergi ke gerai fast food, menonton serial drama, film, dan hal-hal yang disukai remaja.",
//                    "Sebuah kisah tentang menemukan tujuan, ke mana hendak pergi, melalui kenangan demi kenangan masa lalu, pertarungan hidup-mati, untuk memutuskan ke mana langkah kaki akan dibawa.",
//                    "Ini adalah kisah tentang masa lalu yang memilukan. Tentang kebencian kepada seseorang yang seharusnya disayangi. Tentang kehilangan kekasih hati. ",
//                    "Berkisah tentang persahabatan, tentang cinta, tentang perpisahan, tentang melupakan, dan tentang hujan...",
//                    };
//    ListView lView;
//
//    ListAdapter lAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        lView = (ListView) findViewById(R.id.androidList);
//
//
//        lAdapter = new ListAdapter(MainActivity.this, judul, Sinopsis, images);
//
//        lView.setAdapter(lAdapter);
//
//        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                Toast.makeText(MainActivity.this, " Memuat data buku "+ judul[i], Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
//
//        }



    @Override
    public void onBackPressed() {
        showAlertDialog();
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Apakah Kamu Yakin Ingin Keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                        finish();
                    }
                })

                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}