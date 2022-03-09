package com.example.lab1.xmlconfig.lab1_1;

public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private String businessUnit;
    private int age;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary, String businessUnit, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.businessUnit = businessUnit;
        this.age = age;
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

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName='" + empName + '\'' + ", salary=" + salary + ", businessUnit='" + businessUnit + '\'' + ", age=" + age + '}';
    }
}
