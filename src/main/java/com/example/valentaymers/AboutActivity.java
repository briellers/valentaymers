package com.example.valentaymers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        final RatingBar ratingAbout = (RatingBar) findViewById(R.id.ratingAbout);
        Button btnAbtRate = (Button) findViewById(R.id.btnAbtRate);
        btnAbtRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = "Rating: " + ratingAbout.getRating();
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });

    }

}
