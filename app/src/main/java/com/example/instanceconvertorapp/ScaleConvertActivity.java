package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ScaleConvertActivity extends AppCompatActivity {
    Button b; EditText e;
    TextView t; Spinner s1,s2;
    String[] scale={"Centimeter","Inches","Millimeter","Foot","Yard","Kilometer","Miles","Meter"};
    String select1,select2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_convert);
        b=findViewById(R.id.button);
        e=findViewById(R.id.edd);
        t=findViewById(R.id.tt);
        s1=findViewById(R.id.c_from);
        s2=findViewById(R.id.c_to);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_spinner_item,scale);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(ad); s2.setAdapter(ad);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // int pickedMonth = position + 1;
              //  select = String.valueOf(pickedMonth);
               select1= (String) parent.getItemAtPosition(position);
                Toast.makeText(ScaleConvertActivity.this,select1+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
                                     });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // int pickedMonth = position + 1;
              //  select = String.valueOf(pickedMonth);
               select2= (String) parent.getItemAtPosition(position);
                Toast.makeText(ScaleConvertActivity.this,select2+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double converted;
               Double val=Double.parseDouble(e.getText().toString());
                if (select1.equals("Centimeter")&& select2.equals("Inches")){
                    converted= (int) (val*0.3937);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Centimeter")&& select2.equals("Millimeter")){
                    converted= (int) (val*10);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Centimeter")&& select2.equals("Foot")){
                    converted= (int) (val*0.3937)/12;
                    t.setText(""+converted+" Foot");
                }
                if (select1.equals("Centimeter")&& select2.equals("Yard")){
                    converted= (int) (val*91.44);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Centimeter")&& select2.equals("Kilometer")){
                    converted= (int) (val/100000);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Centimeter")&& select2.equals("Miles")){
                    converted= (int) (val/160900);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Centimeter")&& select2.equals("Meter")){
                    converted= (int) (val/100);
                    t.setText(""+converted+" meters");
                }
                if (select1.equals("Millimeter")&& select2.equals("Inches")){
                    converted= (int) (val*0.03937);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Millimeter")&& select2.equals("Foot")){
                    converted= (int) (val*0.03937)/12;
                    t.setText(""+converted+" Foot");
                }
                if (select1.equals("Millimeter")&& select2.equals("Centimeter")){
                    converted= (int) (val/10);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Millimeter")&& select2.equals("yard")){
                    converted= (int) (val/914.4);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Millimeter")&& select2.equals("Kilometer")){
                    converted= (int) (val/1000000);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Millimeter")&& select2.equals("Miles")){
                    converted= (int) (val*6.214/10000000);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Millimeter")&& select2.equals("Meter")){
                    converted= (int) (val*0.001);
                    t.setText(""+converted+" meter");
                }
                if (select1.equals("Inches")&& select2.equals("Foot")){
                    converted= (int) (val/12);
                    t.setText(""+converted+" Foot");
                }
                if (select1.equals("Inches")&& select2.equals("Millimeter")){
                    converted= (int) (val/0.03937);   //val*25.4
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Inches")&& select2.equals("Centimeter")){
                    converted= (int) (val*2.54);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Inches")&& select2.equals("Yard")){
                    converted= (int) (val/36);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Inches")&& select2.equals("Kilometer")){
                    converted= (int) (val*2.54/100000);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Inches")&& select2.equals("Miles")){
                    converted= (int) (val*1.578/100000);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Inches")&& select2.equals("Meter")){
                    converted= (int) (val*0.0254);
                    t.setText(""+converted+" meter");
                }
                if (select1.equals("Foot")&& select2.equals("Inches")){
                    converted= (int) (val*12);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Foot")&& select2.equals("Millimeter")){
                    converted= (int) (val*30.48*10);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Foot")&& select2.equals("Centimeter")){
                    converted= (int) (val*30.48);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Foot")&& select2.equals("Yard")){
                    converted= (int) (val/3);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Foot")&& select2.equals("Kilometer")){
                    converted= (int) (val*0.000305);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Foot")&& select2.equals("Miles")){
                    converted= (int) (val*0.000189);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Foot")&& select2.equals("Meter")){
                    converted= (int) (val*0.305);
                    t.setText(""+converted+" meter");
                }
                if (select1.equals("Yard")&& select2.equals("Inches")){
                    converted= (int) (val*36);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Yard")&& select2.equals("Millimeter")){
                    converted= (int) (val*914.4);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Yard")&& select2.equals("Centimeter")){
                    converted= (int) (val*91.44);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Yard")&& select2.equals("Foot")){
                    converted= (int) (val*3);
                    t.setText(""+converted+" feet");
                }
                if (select1.equals("Yard")&& select2.equals("Kilometer")){
                    converted= (int) (val*0.000914);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Yard")&& select2.equals("Miles")){
                    converted= (int) (val*0.000568);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Yard")&& select2.equals("Meter")){
                    converted= (int) (val*0.914);
                    t.setText(""+converted+" meter");
                }
                if (select1.equals("Kilometer")&& select2.equals("Inches")){
                    converted= (int) (val*39370.079);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Kilometer")&& select2.equals("Millimeter")){
                    converted= (int) (val*1000000);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Kilometer")&& select2.equals("Centimeter")){
                    converted= (int) (val*100000);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Kilometer")&& select2.equals("Foot")){
                    converted= (int) (val*3281);
                    t.setText(""+converted+" feet");
                }
                if (select1.equals("Kilometer")&& select2.equals("Yard")){
                    converted= (int) (val*1093.613);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Kilometer")&& select2.equals("Miles")){
                    converted= (int) (val/1.609);
                    t.setText(""+converted+" miles");
                }
                if (select1.equals("Kilometer")&& select2.equals("Meter")){
                    converted= (int) (val*1000);
                    t.setText(""+converted+" meter");
                }
                if (select1.equals("Miles")&& select2.equals("Inches")){
                    converted= (int) (val*63360);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Miles")&& select2.equals("Millimeter")){
                    converted= (int) (val*1609344);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Miles")&& select2.equals("Centimeter")){
                    converted= (int) (val*160900);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Miles")&& select2.equals("Foot")){
                    converted= (int) (val*5280);
                    t.setText(""+converted+" feet");
                }
                if (select1.equals("Miles")&& select2.equals("Yard")){
                    converted= (int) (val*1760);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Miles")&& select2.equals("Kilometer")){
                    converted= (int) (val*1.609);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Miles")&& select2.equals("Meter")){
                    converted= (int) (val*1609.344);
                    t.setText(""+converted+" meters");
                }
                if (select1.equals("Meter")&& select2.equals("Inches")){
                    converted= (int) (val*39.37);
                    t.setText(""+converted+" inch");
                }
                if (select1.equals("Meter")&& select2.equals("Millimeter")){
                    converted= (int) (val*1000);
                    t.setText(""+converted+" mm");
                }
                if (select1.equals("Meter")&& select2.equals("Centimeter")){
                    converted= (int) (val*100);
                    t.setText(""+converted+" cm");
                }
                if (select1.equals("Meter")&& select2.equals("Foot")){
                    converted= (int) (val*3.281);
                    t.setText(""+converted+" feet");
                }
                if (select1.equals("Meter")&& select2.equals("Yard")){
                    converted= (int) (val*1.094);
                    t.setText(""+converted+" yard");
                }
                if (select1.equals("Meter")&& select2.equals("Kilometer")){
                    converted= (int) (val/1000);
                    t.setText(""+converted+" km");
                }
                if (select1.equals("Meter")&& select2.equals("Miles")){
                    converted= (int) (val/1609);
                    t.setText(""+converted+" miles");
                }
            }
        });
    }
}