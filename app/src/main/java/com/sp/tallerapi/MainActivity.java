package com.sp.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgWhiskey;
    private ImageView imgDestileria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgWhiskey = findViewById(R.id.imgWhiskey);
        imgDestileria = findViewById(R.id.imgDestileria);
        imgWhiskey.setOnClickListener(this);
        imgDestileria.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgWhiskey) {
            Intent intent= new Intent(this,list_Whiskey.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imgDestileria) {
            Intent intent= new Intent(this,list_Distilleri.class);
            startActivity(intent);
        }

    }
}
