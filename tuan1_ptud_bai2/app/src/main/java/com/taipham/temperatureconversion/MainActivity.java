package com.taipham.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt_f=findViewById(R.id.edt_f);
        EditText edt_c=findViewById(R.id.edt_c);
        Button btn_ctof=findViewById(R.id.btn_f);
        Button btn_ftoc=findViewById(R.id.btn_c);
        Button btn_clear=findViewById(R.id.btn_clear);

        btn_ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  double a=Double.parseDouble(edt_f.getText().toString());
                  double c=(a-32)*5/9;
                  edt_c.setText(String.valueOf(c));
            }
        });

        btn_ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(edt_c.getText().toString());
                double c=a*9/5+32;
                edt_f.setText(String.valueOf(c));
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_c.getText().clear();
                edt_f.getText().clear();
            }
        });
    }
}