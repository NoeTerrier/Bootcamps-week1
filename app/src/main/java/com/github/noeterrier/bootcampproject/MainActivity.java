package com.github.noeterrier.bootcampproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button gotButton;
    EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotButton = findViewById(R.id.mainGoButton);
        nameText = findViewById(R.id.mainName);

        gotButton.setOnClickListener(v -> {

            //set the event you want to perform when button is clicked
            //you can go to another activity in your app by creating Intent
            Intent intent = new Intent(this, GreetingActivity.class);
            intent.putExtra("name", nameText.getText().toString());
            startActivity(intent);
        });
    }

}