package com.example.valentaymers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SelectedActivity extends AppCompatActivity {

    ImageView selectedImage;
    TextView selectedLabel;
    TextView selectedDesc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected);

        switch(MemoriesActivity.press) {
            case 1: //taeyeon
                String taeyeon = getString(R.string.taeyeon);
                String tyDesc = getString(R.string.tyDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.taeyeon));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(taeyeon);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(tyDesc);
                break;

            case 2: //jessica
                String jessica = getString(R.string.jessica);
                String sjDesc = getString(R.string.sjDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.jessica));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(jessica);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(sjDesc);
                break;

            case 3: //tiffany
                String tiffany = getString(R.string.tiffany);
                String myDesc = getString(R.string.myDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.tiffany));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(tiffany);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(myDesc);
                break;

            case 4: //sunny
                String sunny = getString(R.string.sunny);
                String skDesc = getString(R.string.skDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.sunny));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(sunny);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(skDesc);
                break;

            case 5: //yuri
                String yuri = getString(R.string.yuri);
                String yrDesc = getString(R.string.yrDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.yuri));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(yuri);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(yrDesc);
                break;

            case 6: //hyoyeon
                String hyoyeon = getString(R.string.hyoyeon);
                String hyDesc = getString(R.string.hyDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.hyoyeon));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(hyoyeon);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(hyDesc);
                break;

            case 7: //seohyun
                String seohyun = getString(R.string.seohyun);
                String shDesc = getString(R.string.shDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.seohyun));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(seohyun);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(shDesc);
                break;

            case 8: //sooyoung
                String sooyoung = getString(R.string.sooyoung);
                String syDesc = getString(R.string.syDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.sooyoung));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(sooyoung);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(syDesc);
                break;

            case 9: //yoona
                String yoona = getString(R.string.yoona);
                String ynDesc = getString(R.string.ynDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.yoona));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(yoona);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(ynDesc);
                break;

            case 10: //snsd
                String snsd = getString(R.string.snsd);
                String snsdDesc = getString(R.string.snsdDesc);

                selectedImage = findViewById(R.id.selectedImage);
                selectedImage.setImageDrawable(getResources().getDrawable(R.drawable.snsd));
                selectedLabel = findViewById(R.id.selectedLabel);
                selectedLabel.setText(snsd);
                selectedDesc = findViewById(R.id.selectedDesc);
                selectedDesc.setText(snsdDesc);
                break;
        }

        final RatingBar ratingSelected = (RatingBar) findViewById(R.id.ratingSelected);
        Button btnSelRate = (Button) findViewById(R.id.btnSelRate);
        btnSelRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = "Rating: " + ratingSelected.getRating();
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}
