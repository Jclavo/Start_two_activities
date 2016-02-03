package com.example.jclavo.start_two_activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

        TextView txtMensaje = (TextView)findViewById(R.id.txtMessage);

        //Log.e("nombre", nombre);
        //Log.e("apellido", apellidos);

        String mensaje = "";

        mensaje = "Tu nombre es: "+nombre+"\nTu apellido es: "+apellidos;

        txtMensaje.setText(mensaje);

    }
    public void exit(View v)
    {
        finish();
    }
}
