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

public class LiquidConvertActivity extends AppCompatActivity {
    Button b; EditText e;
    TextView t; Spinner s1,s2;
    String[] liquid={"Gallon","Kiloliter","Liter","Deciliter","Centiliter","Milliliter"};
    String select1,select2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquid_convert);
        b=findViewById(R.id.button);
        e=findViewById(R.id.edd);
        t=findViewById(R.id.tt);
        s1=findViewById(R.id.c_from);
        s2=findViewById(R.id.c_to);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_spinner_item,liquid);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(ad); s2.setAdapter(ad);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select1= (String) parent.getItemAtPosition(position);
                Toast.makeText(LiquidConvertActivity.this,select1+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                select2= (String) parent.getItemAtPosition(position);
                Toast.makeText(LiquidConvertActivity.this,select2+" Selected",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double totalConvertedAmount;
                Double amount =Double.parseDouble(e.getText().toString());
                if (select1.equals("Gallon")&& select2.equals("Kiloliter")){
                    totalConvertedAmount=amount/264.172;
                    t.setText(totalConvertedAmount+" kl");
                }
                if (select1.equals("Gallon")&& select2.equals("Liter")){
                    totalConvertedAmount=amount*4;
                    t.setText(totalConvertedAmount+" l");
                }
                if (select1.equals("Gallon")&& select2.equals("Deciliter")){
                    totalConvertedAmount=amount*40;
                    t.setText(totalConvertedAmount+" dl");
                }
                if (select1.equals("Gallon")&& select2.equals("Centiliter")){
                    totalConvertedAmount=amount*400;
                    t.setText(totalConvertedAmount+" cl");
                }
                if (select1.equals("Gallon")&& select2.equals("Milliliter")){
                    totalConvertedAmount=amount*4000;
                    t.setText(totalConvertedAmount+" ml");
                }
                if (select1.equals("Kiloliter")&& select2.equals("Milliliter")){
                    totalConvertedAmount=amount*1000000;
                    t.setText(totalConvertedAmount+" ml");
                }
                if (select1.equals("Kiloliter")&& select2.equals("Centiliter")){
                    totalConvertedAmount=amount*100000;
                    t.setText(totalConvertedAmount+" cl");
                }
                if (select1.equals("Kiloliter")&& select2.equals("Deciliter")){
                    totalConvertedAmount=amount*10000;
                    t.setText(totalConvertedAmount+" dl");
                }
                if (select1.equals("Kiloliter")&& select2.equals("Liter")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" l");
                }
                if (select1.equals("Kiloliter")&& select2.equals("Gallon")){
                    totalConvertedAmount=amount*264.172;
                    t.setText(totalConvertedAmount+" gallon");
                }
                if (select1.equals("Liter")&& select2.equals("Gallon")){
                    totalConvertedAmount=amount/4;
                    t.setText(totalConvertedAmount+" gallon");
                }
                if (select1.equals("Liter")&& select2.equals("Kiloliter")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" kl");
                }
                if (select1.equals("Liter")&& select2.equals("Centiliter")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" cl");
                }
                if (select1.equals("Liter")&& select2.equals("Milliliter")){
                    totalConvertedAmount=amount*1000;
                    t.setText(totalConvertedAmount+" ml");
                }
                if (select1.equals("Liter")&& select2.equals("Deciliter")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" dl");
                }
                if (select1.equals("Deciliter")&& select2.equals("Gallon")){
                    totalConvertedAmount=amount/40;
                    t.setText(totalConvertedAmount+" gallon");
                }
                if (select1.equals("Deciliter")&& select2.equals("Kiloliter")){
                    totalConvertedAmount=amount*10000;
                    t.setText(totalConvertedAmount+" kl");
                }
                if (select1.equals("Deciliter")&& select2.equals("Centiliter")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" cl");
                }
                if (select1.equals("Deciliter")&& select2.equals("Liter")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" l");
                }
                if (select1.equals("Deciliter")&& select2.equals("Milliliter")){
                    totalConvertedAmount=amount*100;
                    t.setText(totalConvertedAmount+" ml");
                }
                if (select1.equals("Centiliter")&& select2.equals("Gallon")){
                    totalConvertedAmount=amount/400;
                    t.setText(totalConvertedAmount+" gallon");
                }
                if (select1.equals("Centiliter")&& select2.equals("Liter")){
                    totalConvertedAmount=amount/100;
                    t.setText(totalConvertedAmount+" l");
                }
                if (select1.equals("Centiliter")&& select2.equals("Kiloliter")){
                    totalConvertedAmount=amount/1000000;
                    t.setText(totalConvertedAmount+" kl");
                }
                if (select1.equals("Centiliter")&& select2.equals("Deciliter")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" dl");
                }
                if (select1.equals("Centiliter")&& select2.equals("Milliliter")){
                    totalConvertedAmount=amount*10;
                    t.setText(totalConvertedAmount+" ml");
                }
                if (select1.equals("Milliliter")&& select2.equals("Gallon")){
                    totalConvertedAmount=amount/4000;
                    t.setText(totalConvertedAmount+" gallon");
                }
                if (select1.equals("Milliliter")&& select2.equals("Kiloliter")){
                    totalConvertedAmount=amount/1000000;
                    t.setText(totalConvertedAmount+" kl");
                }
                if (select1.equals("Milliliter")&& select2.equals("Liter")){
                    totalConvertedAmount=amount/1000;
                    t.setText(totalConvertedAmount+" l");
                }
                if (select1.equals("Milliliter")&& select2.equals("Centiliter")){
                    totalConvertedAmount=amount/10;
                    t.setText(totalConvertedAmount+" cl");
                }
                if (select1.equals("Milliliter")&& select2.equals("Deciliter")){
                    totalConvertedAmount=amount/100;
                    t.setText(totalConvertedAmount+" dl");
                }
            }
        });
    }
}