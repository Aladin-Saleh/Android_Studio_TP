package com.example.arc_en_ciel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.viewB);
        Button button = findViewById(R.id.buttonAEC);


        ColorAECGestion cAE = new ColorAECGestion();
        Controller c = new Controller(v,cAE);

        BController bController = new BController();
        button.setOnClickListener(bController);
        v.setOnTouchListener(c);

    }




}