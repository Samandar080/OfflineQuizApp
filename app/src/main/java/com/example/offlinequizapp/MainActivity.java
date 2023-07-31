package com.example.offlinequizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout Matematika = findViewById(R.id.javaLayout);
        final LinearLayout Informatika = findViewById(R.id.phpLayout);
        final LinearLayout InglizTili = findViewById(R.id.htmlLayout);
        final LinearLayout Fizika = findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        Matematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Matematika";
                Matematika.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Informatika.setBackgroundResource(R.drawable.round_back_white10);
                InglizTili.setBackgroundResource(R.drawable.round_back_white10);
                Fizika.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Informatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Informatika";
                Informatika.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Matematika.setBackgroundResource(R.drawable.round_back_white10);
                InglizTili.setBackgroundResource(R.drawable.round_back_white10);
                Fizika.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        InglizTili.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Ingliz Tili";
                InglizTili.setBackgroundResource(R.drawable.round_back_white_stroke10);
                Informatika.setBackgroundResource(R.drawable.round_back_white10);
                Matematika.setBackgroundResource(R.drawable.round_back_white10);
                Fizika.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        Fizika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Fizika";
                Fizika.setBackgroundResource(R.drawable.round_back_white_stroke10);
                Informatika.setBackgroundResource(R.drawable.round_back_white10);
                InglizTili.setBackgroundResource(R.drawable.round_back_white10);
                Matematika.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Topic no selected", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}