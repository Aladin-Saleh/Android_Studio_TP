package com.example.exercice2;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.core.view.GestureDetectorCompat;

public class Controller implements View.OnTouchListener{

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        v.setBackgroundColor(Color.BLUE);
        return false;
    }

}
