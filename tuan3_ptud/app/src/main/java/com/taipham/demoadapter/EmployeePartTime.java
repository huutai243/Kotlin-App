package com.taipham.demoadapter;

public class EmployeePartTime extends Employee {
    public EmployeePartTime(String id, String name) {
        super(id, name);
    }

    @Override
    public double TinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"-->Part time="+TinhLuong();
    }
}
