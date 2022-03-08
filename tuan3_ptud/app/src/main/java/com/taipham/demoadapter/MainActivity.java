package com.taipham.demoadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editId,editName;
    Button btnNhap;
    RadioGroup radGroup;
    ListView lvDanhSach;
    ArrayList<Employee> arrEmployee= new ArrayList<Employee>();
    ArrayAdapter<Employee> arrAdapter=null;
    Employee employee=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editId = (EditText) findViewById(R.id.edt_manv);
        editName = (EditText) findViewById(R.id.edt_tennv);
        btnNhap = (Button) findViewById(R.id.btn_nhap);
        radGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        lvDanhSach = (ListView) findViewById(R.id.lvNhanVien);

        arrAdapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, arrEmployee);
        lvDanhSach.setAdapter(arrAdapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nhap();
            }
        });
    }

    public void nhap()
    {
        int radId=radGroup.getCheckedRadioButtonId();
        String id=editId.getText()+"";
        String name=editName.getText()+"";
        if(radId == R.id.rdchinhthuc)
        {
            employee=new EmployeeFullTime(id,name);
        }
        else
        {
            employee=new EmployeePartTime(id,name);
        }
        employee.setId(id);
        employee.setId(name);
        arrEmployee.add(employee);
        arrAdapter.notifyDataSetChanged();

    }

}
