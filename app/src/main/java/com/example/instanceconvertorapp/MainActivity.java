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
                 totalConvertedAmount=amount*170.15;
                 String total=String.format("%.2f",totalConvertedAmount);
                 t.setText(" "+total);
             }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*79.70;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" ruppee");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*23397.00;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" dong");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*6.74;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*22681.00;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total);
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.82;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*1.41;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" dollar");
                }
                if (clickedCountryName.equals("USA") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*3.67;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*2.70;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.0462671;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.013;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.085;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.76;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.018;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.010;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("India") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*293.41;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*31.92;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*11.83;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*9.04;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.15;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.12;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*3470.13;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("China") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.54;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*261.09;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*96.75;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*8.18;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*73.97;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*1.21;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*4.46;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*1.71;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UK") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*28387.70;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*152.56;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*56.52;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*4.78;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*43.23;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.58;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.71;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*2.60;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Australia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*16588.47;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*3.53;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*1.31;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.11;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.014;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.016;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.060;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*383.71;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Russia") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.023;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*58.59;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*21.71;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*1.84;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*16.60;
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
                    totalConvertedAmount=amount*0.38;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("UAE") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*23397.00;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Vietnaam")){
                    totalConvertedAmount=amount*108.72;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dong");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.37;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.031;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.28;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.0038;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Pound");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("USA")){
                    totalConvertedAmount=amount*0.0046;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("UAE")){
                    totalConvertedAmount=amount*0.017;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dirham");
                }
                if (clickedCountryName.equals("Pakistan") && clickedCountryNameTo.equals("Australia")){
                    totalConvertedAmount=amount*0.0066;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Pakistan")){
                    totalConvertedAmount=amount*0.0092;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("India")){
                    totalConvertedAmount=amount*0.0034;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Rupee");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("China")){
                    totalConvertedAmount=amount*0.00029;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Yuan");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("Russia")){
                    totalConvertedAmount=amount*0.0026;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Ruble");
                }
                if (clickedCountryName.equals("Vietnaam") && clickedCountryNameTo.equals("UK")){
                    totalConvertedAmount=amount*0.000035;
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
                    totalConvertedAmount=amount*0.000060;
                    String total=String.format("%.2f",totalConvertedAmount);
                    t.setText(" "+total+" Dollar");
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
        countryItemArrayList.add(new CountryItem("Australia",R.drawable.australia_flag));
        countryItemArrayList.add(new CountryItem("Vietnaam",R.drawable.vietnam_flag));



    }
}