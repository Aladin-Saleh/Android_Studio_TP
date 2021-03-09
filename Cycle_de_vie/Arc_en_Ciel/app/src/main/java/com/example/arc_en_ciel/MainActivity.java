package com.example.arc_en_ciel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.viewB);
        Button button = findViewById(R.id.buttonAEC);

        ArrayList<Boolean> isActiveColor = new ArrayList<>();

        CheckBox cBox[] = new CheckBox[6];
        cBox[0] = findViewById(R.id.c1);
        cBox[1] = findViewById(R.id.c2);
        cBox[2] = findViewById(R.id.c3);
        cBox[3] = findViewById(R.id.c4);
        cBox[4] = findViewById(R.id.c5);
        cBox[5] = findViewById(R.id.c6);

        for (int i = 0; i <5; i++) {
            Log.d("TAG", "onCreate: "+cBox[i].isChecked());;
        }


        ColorAECGestion cAE = new ColorAECGestion();
        Controller c = new Controller(v,cAE);


        BController bController = new BController(this);
        button.setOnClickListener(bController);
        v.setOnTouchListener(c);

    }




}