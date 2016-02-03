package com.example.jclavo.start_two_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JClavo on 31/01/2016.
 */
public class TwoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void exit(View v)
    {
        finish();
    }
}
