package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends Activity {


    private ArrayList<View> viewContainer = new ArrayList<>();
    private GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v1 = findViewById(R.id.r1);
        View v2= findViewById(R.id.r2);
        View v3 = findViewById(R.id.r3);
        View v4 = findViewById(R.id.r4);
        View v5 = findViewById(R.id.r5);
        View v6 = findViewById(R.id.r6);

        viewContainer.add(v1);
        viewContainer.add(v2);
        viewContainer.add(v3);
        viewContainer.add(v4);
        viewContainer.add(v5);
        viewContainer.add(v6);

        Controller c = new Controller();
        v1.setOnTouchListener(c);

        GController gc = new GController(v1);//Avec une seule vue pour tester 
        mDetector = new GestureDetector(this,gc);
        mDetector.setOnDoubleTapListener(gc);



        for (int ind = 0; ind < 6; ind++)
        {
            viewContainer.get(ind).setOnTouchListener(c);
        }

    }

}