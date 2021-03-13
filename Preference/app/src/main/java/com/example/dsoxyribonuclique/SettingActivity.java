package com.example.dsoxyribonuclique;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class SettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.addPreferencesFromResource(R.xml.activity_preference);
    }
}
