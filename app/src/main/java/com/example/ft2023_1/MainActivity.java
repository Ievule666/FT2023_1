package com.example.ft2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnChangeMainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = findViewById(R.id.textView);
        this.btnChangeMainText = (Button) findViewById(R.id.btnChangeMainText);

        btnChangeMainText.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                   textView.setText("Sveiki kolegos");
            }
        });

    }
}