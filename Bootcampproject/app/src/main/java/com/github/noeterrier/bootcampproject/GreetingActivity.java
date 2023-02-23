package com.github.noeterrier.bootcampproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting_activity);

        Intent intent = getIntent();

        TextView greetingText = findViewById(R.id.greetingMessage);

        String content = "Hello " + intent.getStringExtra("name") + "!";
        greetingText.setText(content);
    }
}
