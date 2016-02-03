package com.example.jclavo.start_two_activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by JClavo on 31/01/2016.
 */
public class TwoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        getDataActivity();
    }

    public void getDataActivity()
    {
        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellido");
        Log.e("nombre", nombre);
        Log.e("apellido", apellidos);
    }
    public void exit(View v)
    {
        finish();
    }
}
