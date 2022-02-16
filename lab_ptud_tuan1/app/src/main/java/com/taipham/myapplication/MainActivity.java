package com.taipham.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt_soa = findViewById(R.id.edt_soa);
        EditText edt_sob = findViewById(R.id.edt_sob);
        Button btn_tong = findViewById(R.id.btn_tong);
        Button btn_hieu = findViewById(R.id.btn_hieu);
        Button btn_tich = findViewById(R.id.btn_tich);
        Button btn_thuong = findViewById(R.id.btn_thuong);
        Button btn_usc = findViewById(R.id.btn_usc);
        Button btn_thoat = findViewById(R.id.btn_thoat);
        TextView ket_qua = findViewById(R.id.ket_qua);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_soa.getText().toString());
                int b = Integer.parseInt(edt_sob.getText().toString());
                int c = a + b;
                ket_qua.setText(String.valueOf(c));
            }
        });

        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edt_soa.getText().toString());
                int b = Integer.parseInt(edt_sob.getText().toString());
                int c = a - b;
                ket_qua.setText(String.valueOf(c));
            }
        });

        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edt_soa.getText().toString());
                int b = Integer.parseInt(edt_sob.getText().toString());
                int c = a * b;
                ket_qua.setText(String.valueOf(c));
            }
        });
        btn_thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_soa.getText().toString());
                int b = Integer.parseInt(edt_sob.getText().toString());
                int c = a / b;
                ket_qua.setText(String.valueOf(c));
            }
        });

        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }}



