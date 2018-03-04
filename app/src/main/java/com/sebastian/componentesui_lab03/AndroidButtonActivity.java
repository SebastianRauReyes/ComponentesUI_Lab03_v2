package com.sebastian.componentesui_lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class AndroidButtonActivity extends AppCompatActivity {

    private final String TAG = AndroidButtonActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);

    }

    public void simpleButton(View view){
        Log.wtf(TAG,"Botón 1 pulsado");
        Toast.makeText(this, "Se pulsó el botón 1", Toast.LENGTH_LONG).show();
    }

    public void leftIconButton(View view){
        Log.wtf(TAG,"Botón 1 pulsado");
        Toast.makeText(this, "Se pulsó el botón 1", Toast.LENGTH_LONG).show();
    }

    public void rightIconButton(View view){
        Log.wtf(TAG,"Botón 2 pulsado");
        Toast.makeText(this, "Se pulsó el botón 2", Toast.LENGTH_LONG).show();
    }

    public void backgroundImageButton(View view){
        Log.wtf(TAG,"Botón 3 pulsado");
        Toast.makeText(this, "Se pulsó el botón 3", Toast.LENGTH_LONG).show();
    }

    public void borderButton(View view){
        Log.wtf(TAG,"Botón 4 pulsado");
        Toast.makeText(this, "Se pulsó el botón 4", Toast.LENGTH_LONG).show();
    }

    public void borderRadiusButton(View view){
        Log.wtf(TAG,"Botón 5 pulsado");
        Toast.makeText(this, "Se pulsó el botón 5", Toast.LENGTH_LONG).show();
    }

    public void roundButton(View view){
        Log.wtf(TAG,"Botón 6 pulsado");
        Toast.makeText(this, "Se pulsó el botón 6", Toast.LENGTH_LONG).show();
    }

}
