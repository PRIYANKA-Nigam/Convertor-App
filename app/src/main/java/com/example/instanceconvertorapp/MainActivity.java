package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button b; EditText e;
    TextView t; Spinner s1,s2;
    CountryItem countryItem,countryItemTo;
    String clickedCountryName,clickedCountryNameTo;
    private ArrayList<CountryItem> countryItemArrayList;
    private CountryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        e=findViewById(R.id.edd);
        t=findViewById(R.id.tt);
        s1=findViewById(R.id.c_from);
        s2=findViewById(R.id.c_to);
        listCountry();
        adapter =new CountryAdapter(this,countryItemArrayList);
        s1.setAdapter(adapter);s2.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                countryItem=(CountryItem)adapterView.getItemAtPosition(i);
                clickedCountryName=countryItem.getC_name();
                Toast.makeText(MainActivity.this,clickedCountryName+" Selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                countryItemTo=(CountryItem)adapterView.getItemAtPosition(i);
                clickedCountryNameTo=countryItemTo.getC_name();
                Toast.makeText(MainActivity.this,clickedCountryNameTo+" Selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Double totalConvertedAmount;
             Double amount =Double.parseDouble(e.getText().toString());
             if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Pakistan")){
                 totalConvertedAmount=amount*282.77;
                 String total=String.format("%.2f",totalConvertedAmount);
                 t.setText(" "+total);
             }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*82.05;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" ruppee");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*23397.00;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" dong");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*6.90;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*81.51;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total);
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.81;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*1.50;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" dollar");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*3.67;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*3.75;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*1316.49;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*1.34;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*7.85;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*14963.35;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*1335.62;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*36.84;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*134.61;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*45.15;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*3.45;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.0462671;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.012;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.084;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.99;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.018;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0098;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*286.18;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.046;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*16.04;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.096;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*182.31;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*16.28;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.45;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*1.64;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.55;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*40.98;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*11.89;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*11.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.14;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.12;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.22;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*3402.67;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.53;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.54;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*190.85;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*1.1365;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*2169.31;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*193.56;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*5.34;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*19.52;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*6.55;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*351.32;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*101.91;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*8.57;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*101.22;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*1.24;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*4.56;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*1.86;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*29159.26;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*4.67;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*1637.63;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*1.66;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*9.76;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*18609.70;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*1659.94;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*45.80;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*167.46;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*56.18;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*188.54;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*54.71;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*4.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*54.35;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.54;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.67;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*2.45;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*15660.44;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*2.51;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*879.55;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.89;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*5.24;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*9994.48;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*891.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*24.61;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*90;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*30.16;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*3.47;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*1.01;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.085;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0099;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.012;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.045;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*288.07;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.018;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.046;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*16.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.097;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*183.99;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*16.42;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.45;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*1.66;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.56;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*77.00;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*22.34;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*1.88;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*22.20;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.22;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.27;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.41;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*6394.30;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*1.02;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*358.50;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.36;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*2.14;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*4073.61;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*363.40;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*10.03;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*37;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*12.29;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*83.04;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.29;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.024;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.29;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.0035;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.013;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.0053;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.00016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*0.056;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.000057;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.00033;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*0.64;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*0.057;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.0016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*0.48;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.16;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*0.012;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.0035;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.00029;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.0035;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.000034;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.000043;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.00016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.000064;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.00016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*0.056;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.000057;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.00033;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*0.64;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*0.057;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.0016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*0.0057;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.0019;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*75.39;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*21.84;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*1.84;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*21.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.27;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.98;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.40;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*6263.79;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Saudi Riyal");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*350.97;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.36;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*2.09;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*3987.93;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*355.76;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*9.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*36;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Saudi Arabia") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*12.03;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*0.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.062;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.0052;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.062;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.00061;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.00076;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.0028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.0011;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*17.85;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*16.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Iraqi Dinar");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.0029;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.0060;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*11.37;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*1.01;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*0.10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Iraq") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.034;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*211.89;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*61.38;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*5.17;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*60.85;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.75;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*2.75;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*1.12;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*17607.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*2.81;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*987;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*5.88;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*11208.63;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*1000.48;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*27.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*100.85;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Singapore") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*33.83;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*36.03;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*10.44;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.88;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*10.35;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.13;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.47;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*2994;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.48;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*168;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.17;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*1905.98;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Indonesian Rupiah");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*170.13;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*4.69;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*17.15;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Hong Kong") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*5.75;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*0.019;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.0055;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.00046;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.0054;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.000054;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.000067;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.000025;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.00010;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*1.57;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.00025;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*0.088;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.000089;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.00053;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*0.089;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.0025;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*0.0090;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Indonesia") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.0030;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*0.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.061;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.0052;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.061;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0000060;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.00075;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.0028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.0011;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*17.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.0028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*0.99;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.00100;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.0059;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*11.20;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupiah");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*0.10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Korea") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.034;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*7.70;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*2.22;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*2.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.022;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.027;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.100;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.041;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*638;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*36;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.036;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*406.14;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupiah");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*36.25;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*4;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
                if (clickedCountryName.equals("Ukraine") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*1.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*2.10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.61;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.051;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0060;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.0074;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.027;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.011;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*175;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.028;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*9.78;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.0099;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.058;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*111.19;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupiah");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*10;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.27;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Japan") && clickedCountryNameTo.equals("Mauritius")){
                    totalConvertedAmount=amount*0.34;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*6.27;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*1.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.15;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*1.80;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.018;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.022;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.081;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.033;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*521;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Saudi Arabia")){
                    totalConvertedAmount=amount*0.083;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Riyal");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Iraq")){
                    totalConvertedAmount=amount*29.18;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dinar");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Singapore")){
                    totalConvertedAmount=amount*0.030;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Hong Kong")){
                    totalConvertedAmount=amount*0.17;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Indonesia")){
                    totalConvertedAmount=amount*331.47;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupiah");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Korea")){
                    totalConvertedAmount=amount*29.58;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Won");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Ukraine")){
                    totalConvertedAmount=amount*0.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ukrainian Hryvnia");
                }
                if (clickedCountryName.equals("Mauritius") && clickedCountryNameTo.equals("Japan")){
                    totalConvertedAmount=amount*2.98;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yen");
                }
            }
        });
    }

    private void listCountry() {
        countryItemArrayList=new ArrayList<>();
        countryItemArrayList.add(new CountryItem("India",R.drawable.india_flag));
        countryItemArrayList.add(new CountryItem("China",R.drawable.china_flag));
        countryItemArrayList.add(new CountryItem("Pakistan",R.drawable.pak_flag));
        countryItemArrayList.add(new CountryItem("USA",R.drawable.us_flag));
        countryItemArrayList.add(new CountryItem("Russia",R.drawable.russia_flag));
        countryItemArrayList.add(new CountryItem("UK",R.drawable.uk_flag));
        countryItemArrayList.add(new CountryItem("UAE",R.drawable.uae_flag));
        countryItemArrayList.add(new CountryItem("Japan",R.drawable.japan));
        countryItemArrayList.add(new CountryItem("Australia",R.drawable.australia_flag));
        countryItemArrayList.add(new CountryItem("Vietnaam",R.drawable.vietnam_flag));
        countryItemArrayList.add(new CountryItem("Saudi Arabia",R.drawable.saudi));
        countryItemArrayList.add(new CountryItem("Iraq",R.drawable.iraq));
        countryItemArrayList.add(new CountryItem("Singapore",R.drawable.singapore));
        countryItemArrayList.add(new CountryItem("Hong Kong",R.drawable.hong_kong));
        countryItemArrayList.add(new CountryItem("Indonesia",R.drawable.indonesia));
        countryItemArrayList.add(new CountryItem("Korea",R.drawable.korea));
        countryItemArrayList.add(new CountryItem("Ukraine",R.drawable.ukraine));
        countryItemArrayList.add(new CountryItem("Mauritius",R.drawable.mauritius));




    }
}