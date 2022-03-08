package com.taipham.demoadapter;

public class EmployeeFullTime extends Employee {


    public EmployeeFullTime(String id, String name) {

        super(id, name);
    }

    @Override
    public double TinhLuong() {
        return 500  ;
    }

    @Override
    public String toString() {
        return super.toString()+"-->Full time="+TinhLuong();
    }
}
