package com.t3ch.shaj.clicklisteners;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button PlayButton;
    private TextView TextView;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButton = findViewById(R.id.PlayButtonID);
        TextView = findViewById(R.id.TextViewID);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter++;
                TextView.setText("Play Button is Pressed " + counter + " Times");
            }
        });
    }
}
