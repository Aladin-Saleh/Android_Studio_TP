package com.example.dsoxyribonuclique;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonController implements View.OnClickListener {




    private TextView appEditText;
    public ButtonController(TextView edt)
    {
        this.appEditText = edt;
    }




    @Override
    public void onClick(View v) {

        Log.d("Tag", "onClick: Button");
        Button button = (Button)v;
        String text = button.getText().toString();
        this.appEditText.setText(this.appEditText.getText()+text);

    }
}
