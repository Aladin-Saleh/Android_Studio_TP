package com.example.exercice2;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class GController implements  View.OnTouchListener,
        GestureDetector.OnGestureListener,
        View.OnDragListener,
        GestureDetector.OnDoubleTapListener{


    private View gView;

    public GController(View v)
    {
        this.gView = v;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
//        this.gView.setBackgroundColor(Color.YELLOW);
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        this.gView.setBackgroundColor(Color.GREEN);
        Log.d("TAG", "onDoubleTap:DEBUG DOUBLE TAP ");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        return false;
    }
}
