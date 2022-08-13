package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConvertMainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_main_page);
    }

    public void currency(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    public void scale(View view) {
        startActivity(new Intent(getApplicationContext(),ScaleConvertActivity.class));
    }

    public void weight(View view) {
        startActivity(new Intent(getApplicationContext(),WeightConvertActivity.class));
    }

    public void temperature(View view) {
        startActivity(new Intent(getApplicationContext(),TempConvertActivity.class));

    }

    public void liquid(View view) {
        startActivity(new Intent(getApplicationContext(),LiquidConvertActivity.class));
    }
}