package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScreenInfoActivity extends AppCompatActivity {
TextView t1,t2,t3;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_info);
        b=findViewById(R.id.button7);
        t1=findViewById(R.id.textView3);
        t2=findViewById(R.id.textView4);
        t3=findViewById(R.id.textView5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(t1.getText().toString().concat(String.valueOf(DisplayMetricHelper.getScreenWidth(ScreenInfoActivity.this))).
                        concat("pixels ="+
                        (DisplayMetricHelper.getScreenWidth(ScreenInfoActivity.this))/100+" cm = inch "+
                                String.format("%.3g%n ",(DisplayMetricHelper.getScreenWidth(ScreenInfoActivity.this))/(100 * 2.54))));
                t2.setText(t2.getText().toString().concat(String.valueOf(DisplayMetricHelper.getScreenHeight(ScreenInfoActivity.this))).
                        concat("pixels ="+
                                (DisplayMetricHelper.getScreenHeight(ScreenInfoActivity.this))/100+" cm = inch "+
                                String.format("%.3g%n ",(DisplayMetricHelper.getScreenHeight(ScreenInfoActivity.this))/(100 * 2.54))));
                t3.setText(t3.getText().toString().concat(String.valueOf(DisplayMetricHelper.getScreenSize(ScreenInfoActivity.this))).
                        concat("cm ="+
                                (DisplayMetricHelper.getScreenSize(ScreenInfoActivity.this))/2+" inches"));

            }
        });
    }
}