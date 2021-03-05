package com.example.pois;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import static android.view.MotionEvent.ACTION_CANCEL;
import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_POINTER_DOWN;
import static android.view.MotionEvent.ACTION_POINTER_UP;
import static android.view.MotionEvent.ACTION_UP;

public class Controler implements View.OnTouchListener {

    private com.example.pois.CView vue;

    public Controler (com.example.pois.CView vue) {
        this.vue = vue;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getActionMasked();

        if(action == ACTION_DOWN || action == ACTION_POINTER_DOWN) {
            int pointerIndex = event.getActionIndex();
            int pointerId = event.getPointerId(pointerIndex);
            float x = event.getX(pointerIndex);
            float y = event.getY(pointerIndex);
            Log.d("clic", "touch x = " + x + "; y = " + y + "; index = " + pointerIndex + "; id = " + pointerId);
            Point p = new Point(pointerId, x, y);
            vue.addPoint(p);
        }

        if(action == ACTION_MOVE) {
            for(int i = 0; i < event.getPointerCount(); i++) {
                int pointerIndex = i;
                int pointerId = event.getPointerId(pointerIndex);
                for(Point point : vue.getList()) {
                    if (pointerId == point.getId()) {
                        float x = event.getX(i);
                        float y = event.getY(i);
                        Log.d("clic", "move x = " + x + "; y = " + y + "; index = " + pointerIndex + "; id = " + pointerId);
                        point.setX(x);
                        point.setY(y);
                    }
                }
            }
        }

        if(action == ACTION_UP || action == ACTION_POINTER_UP || action == ACTION_CANCEL) {
            int pointerIndex = event.getActionIndex();
            int pointerId = event.getPointerId(pointerIndex);
            Log.d("clic", "del index = " + pointerIndex + "; id = " + pointerId);
            vue.delPoint(pointerId);
        }


        vue.invalidate();
        return true;
    }
}