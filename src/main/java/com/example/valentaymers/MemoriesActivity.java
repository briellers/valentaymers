package com.example.valentaymers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MemoriesActivity extends AppCompatActivity {

    public static int press;
    ImageButton picTaeyeon;
    ImageButton picJessica;
    ImageButton picTiffany;
    ImageButton picSunny;
    ImageButton picYuri;
    ImageButton picHyoyeon;
    ImageButton picSeohyun;
    ImageButton picSooyoung;
    ImageButton picYoona;
    ImageButton picSnsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memories);

        picTaeyeon = findViewById(R.id.picTaeyeon);
        picJessica = findViewById(R.id.picJessica);
        picTiffany = findViewById(R.id.picTiffany);
        picSunny = findViewById(R.id.picSunny);
        picYuri = findViewById(R.id.picYuri);
        picHyoyeon = findViewById(R.id.picHyoyeon);
        picSeohyun = findViewById(R.id.picSeohyun);
        picSooyoung = findViewById(R.id.picSooyoung);
        picYoona = findViewById(R.id.picYoona);
        picSnsd = findViewById(R.id.picSnsd);

        picTaeyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 1;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picJessica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 2;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picTiffany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 3;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 4;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picYuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 5;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picHyoyeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 6;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picSeohyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 7;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picSooyoung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 8;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picYoona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 9;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

        picSnsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                press = 10;
                Intent intent = new Intent(MemoriesActivity.this, SelectedActivity.class);
                startActivity(intent);
            }
        });

    }
}
