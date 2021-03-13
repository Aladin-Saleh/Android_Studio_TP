package com.example.dsoxyribonuclique;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends Activity {

    private ArrayList<Button> buttonContainer = new ArrayList<>();
    private ButtonController bController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView appEditText = findViewById(R.id.textInput);

        Button bA = findViewById(R.id.A);
        Button bT = findViewById(R.id.T);
        Button bC = findViewById(R.id.C);
        Button bG = findViewById(R.id.G);


        buttonContainer.add(bA);
        buttonContainer.add(bT);
        buttonContainer.add(bC);
        buttonContainer.add(bG);


        for (int i = 0; i < buttonContainer.size(); i++) {

            bController = new ButtonController(appEditText);
            buttonContainer.get(i).setOnClickListener(bController);

        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.desacB:
                Intent i = new Intent(this,SettingActivity.class);
                startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
