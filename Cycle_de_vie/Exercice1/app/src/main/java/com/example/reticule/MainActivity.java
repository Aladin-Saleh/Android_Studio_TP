package com.example.reticule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {


    private ImageView imageView;
    private View rView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageView = findViewById(R.id.reticule);
        this.rView = findViewById(R.id.myView);
        Controller c = new Controller(this.imageView);
        rView.setOnTouchListener(c);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putFloat("posX",this.imageView.getX());
        outState.putFloat("posY",this.imageView.getY());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        this.imageView.setX(savedInstanceState.getFloat("posX"));
        this.imageView.setY(savedInstanceState.getFloat("posY"));


    }
}