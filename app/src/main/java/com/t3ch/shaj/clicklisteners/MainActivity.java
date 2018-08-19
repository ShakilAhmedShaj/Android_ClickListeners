package com.t3ch.shaj.clicklisteners;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button PlayButton;
    private Button PauseButton;
    private TextView TextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayButton = findViewById(R.id.PlayButtonID);
        PauseButton = findViewById(R.id.PauseButtonID);
        TextView = findViewById(R.id.TextViewID);

        PlayButton.setOnClickListener(this);
        PauseButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.PlayButtonID) {
            TextView.setText("Playing");
        }

        if (v.getId() == R.id.PauseButtonID) {
            TextView.setText("Paused");
        }


    }
}
