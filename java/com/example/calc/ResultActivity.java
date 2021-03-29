package com.example.calc;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);

        TextView textView = new TextView(this);
        textView.setTextSize(50);
        textView.setGravity(Gravity.CENTER);
        setContentView(linearLayout);
        linearLayout.addView(textView);

        Intent intent = getIntent();
        String firstText = intent.getStringExtra("firstText");
        String secondtext = intent.getStringExtra("secondText");

        String result = intent.getStringExtra("result");
        String finalText = firstText + " + " + secondtext + " = " + result;
        textView.setText(finalText);


    }

}

