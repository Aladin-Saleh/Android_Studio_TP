package com.example.arc_en_ciel;

import android.graphics.Color;

public class ColorAECGestion {

    private int orange = Color.rgb(255,165,0);
    private int violet = Color.rgb(255,0,255);

    private int colorsContainer[] = {Color.RED,orange,Color.YELLOW,Color.GREEN,Color.BLUE,violet};


    private boolean isActiveColors[] = {true,true,true,true,true,true,};
    private int colorCount = colorsContainer.length;

    public int getOneColor(int i)
    {
        return this.colorsContainer[i];
    }

    public boolean getStateColor(int i)
    {
        return this.isActiveColors[i];
    }

    public int getColorCount()
    {
        return this.colorCount;
    }

}
