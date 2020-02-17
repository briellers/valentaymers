package com.example.valentaymers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        button = findViewById(R.id.button);

        final String code1 = "0";
        final String code2 = "2";
        final String code3 = "1";
        final String code4 = "4";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code1.equals(editText1.getText().toString()) && code2.equals(editText2.getText().toString()) &&
                        code3.equals(editText3.getText().toString()) && code4.equals(editText4.getText().toString()) ){
                    Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
                else
                    Toast.makeText(getApplicationContext(), "Invalid login details", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
