package com.example.pois;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CView extends View {

    private int colorContainer[] = {Color.BLUE,Color.GREEN,Color.RED,Color.YELLOW,Color.MAGENTA,Color.rgb(55,12,38)};
    private ArrayList<Point> points = new ArrayList<>();
    Paint pt = new Paint();
    public CView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("clic", "------------------------ Liste : " + points + " ------------------------");
        for (Point p : points) {
            if(p != null) {
                    pt.setColor(this.colorContainer[p.getId()]);
                    canvas.drawCircle(p.getX(), p.getY(), 80, pt);
            }
        }
    }

    public ArrayList<Point> getList() {
        return this.points;
    }

    public void addPoint(Point p) {
        this.points.add(p);
    }

    public void delPoint(int id) {
        ArrayList<Point> save = new ArrayList<>();
        for(Point point : points) {
            if (id == point.getId()) {
                save.add(point);
                Log.d("clic", "------------------------POINT SUPPRIMÉ------------------------");
            }
        }
        points.removeAll(save);
    }

}