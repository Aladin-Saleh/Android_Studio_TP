package com.example.reticule;

import android.media.Image;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_POINTER_DOWN;

public class Controller implements View.OnTouchListener {


    private ImageView imageV;

    public Controller(ImageView imgV)
    {
        this.imageV = imgV;

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {


        int action = event.getActionMasked();

        if (action == ACTION_DOWN ||action == ACTION_POINTER_DOWN)
        {
            this.imageV.setX(event.getX());
            this.imageV.setY(event.getY());
        }

        if (action == ACTION_MOVE)
        {
            imageV.setX(event.getX());
            imageV.setY(event.getY());
        }

        return true;
    }
}
