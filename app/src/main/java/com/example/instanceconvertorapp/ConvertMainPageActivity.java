package com.example.instanceconvertorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    public void ScreenInfo(View view) {
        startActivity(new Intent(getApplicationContext(),ScreenInfoActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.step_counter_pedometer,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.step) {
            startActivity(new Intent(getApplicationContext(), StepCounterActivity.class));
            return true;
        }
        if (item.getItemId()==R.id.bmi) {
            startActivity(new Intent(getApplicationContext(), BMIActivity.class));
            return true;
        }
        return true;
    }


}