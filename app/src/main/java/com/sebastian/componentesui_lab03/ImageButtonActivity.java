package com.sebastian.componentesui_lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class ImageButtonActivity extends AppCompatActivity {

    private final String TAG = ImageButtonActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
    }

    public void firstImageButton(View view){
        Log.wtf(TAG,"Botón 1 pulsado");
        Toast.makeText(this, "Se pulsó el botón 1", Toast.LENGTH_LONG).show();
    }

    public void secondImageButton(View view){
        Log.wtf(TAG,"Botón 2 pulsado");
        Toast.makeText(this, "Se pulsó el botón 2", Toast.LENGTH_LONG).show();
    }
}
