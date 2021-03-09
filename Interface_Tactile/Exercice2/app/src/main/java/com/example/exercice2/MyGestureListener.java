package com.example.exercice2;

import android.graphics.Color;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MyGestureListener extends GestureDetector.SimpleOnGestureListener {


    private View caseView;
    public MyGestureListener(View v)
    {
        this.caseView = v;


    }

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d("TAG","onDown: ");

        // don't return false here or else none of the other
        // gestures will work
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.i("TAG", "onSingleTapConfirmed: ");
        caseView.setBackgroundColor(Color.RED);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.i("TAG", "onLongPress: ");
        caseView.setBackgroundColor(Color.BLUE);

    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.i("TAG", "onDoubleTap: ");
        caseView.setBackgroundColor(Color.YELLOW);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                            float distanceX, float distanceY) {
        Log.i("TAG", "onScroll: ");
        caseView.setBackgroundColor(Color.WHITE);

        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d("TAG", "onFling: ");
        return true;
    }
}