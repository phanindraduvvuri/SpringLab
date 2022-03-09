package com.example.lab1.xmlconfig.lab1_2;

public class SBU {
    private int sbuId;
    private String sbuName;
    private String sbuCode;
    private String sbuHead;

    public SBU() {
    }

    public SBU(int sbuId, String sbuName, String sbuCode, String sbuHead) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.sbuCode = sbuCode;
        this.sbuHead = sbuHead;
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

    public String getSbuCode() {
        return sbuCode;
    }

    public void setSbuCode(String sbuCode) {
        this.sbuCode = sbuCode;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    @Override
    public String toString() {
        return "SBU{" +
                "sbuId=" + sbuId +
                ", sbuName='" + sbuName + '\'' +
                ", sbuCode='" + sbuCode + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                '}';
    }
}
