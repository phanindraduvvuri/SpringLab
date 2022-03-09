package com.example.lab1.xmlconfig.lab1_2;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private SBU businessUnit;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary, SBU businessUnit) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.businessUnit = businessUnit;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ']';
    }

    public SBU getSBUDetails() {
        return this.businessUnit;
    }
}
