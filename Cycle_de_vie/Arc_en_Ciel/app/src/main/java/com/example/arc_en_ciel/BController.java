package com.example.arc_en_ciel;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.core.content.ContextCompat;

public class BController implements View.OnClickListener {


    private Activity mainActivity;
    public BController(Activity activity)
    {
            this.mainActivity = activity;
    }

    @Override
    public void onClick(View v) {
        Log.d("clic", "Button");
        mainActivity.startActivity(new Intent(mainActivity, MainActivityParam.class));
    }


}
