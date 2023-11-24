package com.example.androidstudiossproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int clicks = 0;
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.clicker);
        imageButton = findViewById(R.id.imageButton);
    }
    public void onClick(View v){
        clicks = clicks + 1;
        textView.setText("Clicks: " + clicks);



    }

}