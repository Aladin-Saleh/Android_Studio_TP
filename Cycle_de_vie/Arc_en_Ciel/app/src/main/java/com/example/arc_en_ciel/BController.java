package com.example.arc_en_ciel;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.core.content.ContextCompat;

public class BController extends Activity implements View.OnClickListener {


    public BController()
    {
    }

    @Override
    public void onClick(View v) {

        Log.d("clic", "Button");
        Intent nActivity = new Intent(getApplicationContext(), MainActivityParam.class);
        startActivity(nActivity);
    }


}
