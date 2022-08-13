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

public class WeightConvertActivity extends AppCompatActivity {
    Button b; EditText e;
    TextView t; Spinner s1,s2;
    String[] weight={"Gram","Ton","Quintal","Pound","Kilogram","Hectogram","Dekagram","Decigram","Centigram"};
    String select1,select2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_convert);
        b=findViewById(R.id.button);
        e=findViewById(R.id.edd);
        t=findViewById(R.id.tt);
        s1=findViewById(R.id.c_from);
        s2=findViewById(R.id.c_to);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_spinner_item,weight);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(ad); s2.setAdapter(ad);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select1= (String) parent.getItemAtPosition(position);
                Toast.makeText(WeightConvertActivity.this,select1+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select2= (String) parent.getItemAtPosition(position);
                Toast.makeText(WeightConvertActivity.this,select2+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double totalConvertedAmount;
                Double amount =Double.parseDouble(e.getText().toString());
                if (select1.equals("Ton")&&select2.equals("Pound")){
                    totalConvertedAmount=amount*2000;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Ton")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Ton")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*1000000;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Ton")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*100000000;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Ton")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*10000000;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Ton")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount*100000;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Ton")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*10000;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Ton")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Kilogram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount*2.205;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Kilogram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Kilogram")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Kilogram")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*100000;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Kilogram")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*10000;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Kilogram")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Kilogram")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Kilogram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount*0.01;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Pound")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/2000;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Pound")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/2.205;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Pound")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*453.6;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Pound")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*45359.237;
                    t.setText(totalConvertedAmount+" centigram");
                }
                if (select1.equals("Pound")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*4535.9237;
                    t.setText(totalConvertedAmount+" decigram");
                }
                if (select1.equals("Pound")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount*45.3592;
                    t.setText(totalConvertedAmount+" dekagram");
                }
                if (select1.equals("Pound")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*453.6;
                    t.setText(totalConvertedAmount+" hectogram");
                }
                if (select1.equals("Pound")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/220.5;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Quintal")&&select2.equals("Pound")){
                    totalConvertedAmount=amount*220.5;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Quintal")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Quintal")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*100000;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Quintal")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*10000000;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Quintal")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*1000000;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Quintal")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount*10000;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Quintal")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*100000;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Quintal")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/9.072;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Gram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/453.6;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Gram")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Gram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/100000;
                    t.setText(totalConvertedAmount+" quintal");
                }
                if (select1.equals("Gram")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Gram")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Gram")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Gram")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*1;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Gram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/9.072;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Hectogram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/453.6;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Hectogram")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Hectogram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/100000;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Hectogram")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Hectogram")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Hectogram")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Hectogram")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*1;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Hectogram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/9.072;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Centigram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/45359.237;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Centigram")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/100000;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Centigram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/10000000;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Centigram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/10000000;
                    t.setText(totalConvertedAmount+" pound");
                }
                if (select1.equals("Centigram")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Centigram")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Centigram")&&select2.equals("Gram")){
                    totalConvertedAmount=amount/100;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Centigram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/100000000;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Decigram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/4535.9237;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Decigram")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/10000;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Decigram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/1000000;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Decigram")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Decigram")&&select2.equals("Gram")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Decigram")&&select2.equals("Dekagram")){
                    totalConvertedAmount=amount/100;
                    t.setText(totalConvertedAmount+" dag");
                }
                if (select1.equals("Decigram")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Decigram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/10000000;
                    t.setText(totalConvertedAmount+" ton");
                }
                if (select1.equals("Dekagram")&&select2.equals("Pound")){
                    totalConvertedAmount=amount/45.3592;
                    t.setText(totalConvertedAmount+" Pounds");
                }
                if (select1.equals("Dekagram")&&select2.equals("Kilogram")){
                    totalConvertedAmount=amount/100;
                    t.setText(totalConvertedAmount+" kg");
                }
                if (select1.equals("Dekagram")&&select2.equals("Quintal")){
                    totalConvertedAmount=amount/10000;
                    t.setText(totalConvertedAmount+" Quintal");
                }
                if (select1.equals("Dekagram")&&select2.equals("Centigram")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" cg");
                }
                if (select1.equals("Dekagram")&&select2.equals("Decigram")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" dg");
                }
                if (select1.equals("Dekagram")&&select2.equals("Hectogram")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" hg");
                }
                if (select1.equals("Dekagram")&&select2.equals("Gram")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" gm");
                }
                if (select1.equals("Dekagram")&&select2.equals("Ton")){
                    totalConvertedAmount=amount/100000;
                    t.setText(totalConvertedAmount+" ton");
                }
            }
        });
    }
}