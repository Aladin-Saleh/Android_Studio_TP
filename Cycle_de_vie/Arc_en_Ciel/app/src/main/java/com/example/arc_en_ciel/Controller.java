package com.example.arc_en_ciel;

import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Controller implements View.OnTouchListener {

    private ColorAECGestion aecGestion;
    private int ind = 0;
    private View aView;

    public Controller(View v,ColorAECGestion c)
    {
        this.aView = v;
        this.aecGestion = c;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        int action = event.getActionMasked();

        if (action == MotionEvent.ACTION_DOWN)
        {
            this.ind = ++ind%this.aecGestion.getColorCount();
            this.aView.setBackgroundColor(this.aecGestion.getOneColor(this.ind));
            Log.d("clic", "Touch ACTION DOWN");
        }


        return true;
    }
}
