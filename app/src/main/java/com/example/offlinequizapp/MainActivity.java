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
        final LinearLayout Math = findViewById(R.id.javaLayout);
        final LinearLayout Information = findViewById(R.id.phpLayout);
        final LinearLayout English = findViewById(R.id.htmlLayout);
        final LinearLayout Physics = findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        Math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Math";
                Math.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Information.setBackgroundResource(R.drawable.round_back_white10);
                English.setBackgroundResource(R.drawable.round_back_white10);
                Physics.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Informatika";
                Information.setBackgroundResource(R.drawable.round_back_white_stroke10);

                Math.setBackgroundResource(R.drawable.round_back_white10);
                English.setBackgroundResource(R.drawable.round_back_white10);
                Physics.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Ingliz Tili";
                English.setBackgroundResource(R.drawable.round_back_white_stroke10);
                Information.setBackgroundResource(R.drawable.round_back_white10);
                Math.setBackgroundResource(R.drawable.round_back_white10);
                Physics.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "Fizika";
                Physics.setBackgroundResource(R.drawable.round_back_white_stroke10);
                Information.setBackgroundResource(R.drawable.round_back_white10);
                English.setBackgroundResource(R.drawable.round_back_white10);
                Math.setBackgroundResource(R.drawable.round_back_white10);
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