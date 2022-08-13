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

public class TempConvertActivity extends AppCompatActivity {
    Button b; EditText e;
    TextView t; Spinner s1,s2;
    String[] temp={"Celcius","Fahrenheit","Kelvin"};
    String select1,select2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_convert);
        b=findViewById(R.id.button);
        e=findViewById(R.id.edd);
        t=findViewById(R.id.tt);
        s1=findViewById(R.id.c_from);
        s2=findViewById(R.id.c_to);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_spinner_item,temp);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(ad); s2.setAdapter(ad);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // int pickedMonth = position + 1;
                //  select = String.valueOf(pickedMonth);
                select1= (String) parent.getItemAtPosition(position);
                Toast.makeText(TempConvertActivity.this,select1+" Selected",Toast.LENGTH_SHORT).show();

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
                Toast.makeText(TempConvertActivity.this,select2+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double totalConvertedAmount;
                Double amount =Double.parseDouble(e.getText().toString());
                if (select1.equals("Celcius")&&select2.equals("Fahrenheit")){
                   totalConvertedAmount=(9*amount)/5-32;
                   t.setText(totalConvertedAmount+ "F");
                }
                if (select1.equals("Celcius")&&select2.equals("Kelvin")){
                 totalConvertedAmount=amount+273.15;
                 t.setText(totalConvertedAmount+"K");
                }
                if (select1.equals("Fahrenheit")&&select2.equals("Celcius")){
                    totalConvertedAmount=(5*amount)/9-32;
                    t.setText(totalConvertedAmount+"C");
                }
                if (select1.equals("Fahrenheit")&&select2.equals("Kelvin")){
                    totalConvertedAmount=((5*amount)/9-32)+273.15;
                    t.setText(totalConvertedAmount+"K");
                }
                if (select1.equals("Kelvin")&&select2.equals("Celcius")){
                        totalConvertedAmount=amount-273.15;
                        t.setText(totalConvertedAmount+"C");
                }
                if (select1.equals("Kelvin")&&select2.equals("Fahrenheit")){
                          totalConvertedAmount=((amount-273.15)*9)/5+32;
                          t.setText(totalConvertedAmount+"F");
                }
            }
        });
    }
}