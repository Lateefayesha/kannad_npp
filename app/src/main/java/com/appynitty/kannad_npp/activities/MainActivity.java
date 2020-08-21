package com.appynitty.kannad_npp.activities;

import android.content.Intent;
import android.os.Bundle;

import com.appynitty.ghantagaditracker.activity.SplashScreenActivity;
import com.appynitty.ghantagaditracker.utils.AUtils;
import com.appynitty.kannad_npp.BuildConfig;
import com.appynitty.kannad_npp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.pixplicity.easyprefs.library.Prefs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Prefs.putString(AUtils.APP_ID, "2025");
        Prefs.putString(AUtils.APP_ID_GG, "3035");

        Prefs.putString(AUtils.LOCATION, "20.268788,75.129976");
        Prefs.putInt(AUtils.VERSION_CODE, BuildConfig.VERSION_CODE);

        Prefs.putString(AUtils.LANGUAGE_NAME, Prefs.getString(AUtils.LANGUAGE_NAME, AUtils.LanguageConstants.MARATHI));

        List<String> languageList = new ArrayList<String>();
        languageList.add(AUtils.LanguageNameConstants.ENGLISH);
        languageList.add(AUtils.LanguageNameConstants.MARATHI);
        AUtils.setLanguageList(languageList);

        startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}