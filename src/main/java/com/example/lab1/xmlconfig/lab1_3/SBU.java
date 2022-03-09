package com.example.lab1.xmlconfig.lab1_3;

import java.util.List;

public class SBU {
    private int sbuId;
    private String sbuCode;
    private String sbuName;
    private String sbuHead;
    private List<Employee> empList;

    public SBU(String sbuCode) {
    }

    public SBU(int sbuId, String sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
        this.sbuId = sbuId;
        this.sbuCode = sbuCode;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
        this.empList = empList;
    }

    public int getSbuId() {
        return sbuId;
    }

    public void setSbuId(int sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "SBU{" +
                "sbuId=" + sbuId +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                ", empList=" + empList +
                '}';
    }

    public String getSbuCode() {
        return sbuCode;
    }

    public void setSbuCode(String sbuCode) {
        this.sbuCode = sbuCode;
    }
}
