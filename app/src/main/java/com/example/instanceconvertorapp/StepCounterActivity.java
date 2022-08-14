package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StepCounterActivity extends AppCompatActivity implements SensorEventListener{
TextView t1,t2;
int stepCount=0;
private SensorManager sensorManager;
//private Sensor sensor;
private boolean isCount=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_counter);
        t1=findViewById(R.id.textView7);
        t2=findViewById(R.id.textView8);
          getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); //to test the functionality we need the screen awake so,
          sensorManager= (SensorManager) this.getSystemService(Context.SENSOR_SERVICE);
//          if (sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!=null){
//              sensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
//              isCount=true;
//          }else {      t1.setText("Counter Sensor is not present");
//          isCount=false; }
    }

    @Override
    protected void onResume() {
        super.onResume();
        isCount=true;
        Sensor countSensor =sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if (countSensor!=null)
            sensorManager.registerListener(this,countSensor,SensorManager.SENSOR_DELAY_UI);
        else
            Toast.makeText(this,"Sensor Not Found",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        isCount=false;
//        Sensor countSensor =sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
//        if (countSensor!=null)
//            sensorManager.unregisterListener(this,sensor);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
//        if (sensorEvent.sensor==sensor){
        if (isCount){
            t1.setText(String.valueOf(sensorEvent.values[0]));

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}