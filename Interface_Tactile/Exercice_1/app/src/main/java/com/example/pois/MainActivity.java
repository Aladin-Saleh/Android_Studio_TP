package com.example.pois;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CView view = findViewById(R.id.my_view);
        Controler c = new Controler(view);
        view.setOnTouchListener(c);

    }



}