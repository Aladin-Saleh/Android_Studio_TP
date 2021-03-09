package com.example.exercice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.app.Activity;
import android.gesture.Gesture;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends Activity {


    private GestureDetector gestureDetector;
    private ArrayList<View> vContainer = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v1 = findViewById(R.id.v1);
        View v2 = findViewById(R.id.v2);
        View v3 = findViewById(R.id.v3);

        vContainer.add(v1);
        vContainer.add(v2);
        vContainer.add(v3);

        for (int i = 0; i <vContainer.size(); i++) {
            gestureDetector = new GestureDetector(this, new MyGestureListener(vContainer.get(i)));
            Controller onTouchController = new Controller(gestureDetector);
            vContainer.get(i).setOnTouchListener(onTouchController);
        }

        /*gestureDetector = new GestureDetector(this, new MyGestureListener(v1));
        Controller onTouchController = new Controller(gestureDetector);
        v1.setOnTouchListener(onTouchController);
*/

    }




}