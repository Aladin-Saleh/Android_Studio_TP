package com.example.pois;

import android.graphics.Color;

import java.util.Random;

public class Point {

    private int id;
    private float x, y;

    public Point(int id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return this.id;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

}
