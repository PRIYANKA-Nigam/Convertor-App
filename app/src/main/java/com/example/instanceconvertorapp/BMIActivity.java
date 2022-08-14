package com.example.instanceconvertorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1,t2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i);
        e1=findViewById(R.id.editTextTextPersonName3);
        e2=findViewById(R.id.editTextTextPersonName4);
        b1=findViewById(R.id.button10);
        b2=findViewById(R.id.button11);
        t1=findViewById(R.id.textView13);
        t2=findViewById(R.id.textView14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if (s1.equals("")){
                    e1.setError("Please Enter your Weight");
                    e1.requestFocus();
                    return;
                }
                if (s2.equals("")){
                    e2.setError("Please Enter your Height");
                    e2.requestFocus();
                    return;
                }
                float weight =Float.parseFloat(s1);
                float height =Float.parseFloat(s2)/100;
                float bmiValue =BMICal(weight,height);
                t1.setText(interpretBMI(bmiValue));
                t2.setText("BMI= "+bmiValue);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");e2.setText("");
                t1.setText("");t2.setText("");
            }
        });

    }
    public float BMICal(float weight,float height){
        return weight/(height*height);
    }
    public String interpretBMI(float bmiVal){
        if (bmiVal <16)
            return "Severely UnderWeight";
        else if (bmiVal<=18.5 && bmiVal>16)
            return "Underweight";
        else if (bmiVal<25 && bmiVal>18.5)
            return "Normal";
        else if (bmiVal<=30 && bmiVal>=25)
            return "Overweight";
        else
            return "Obese";
    }
}