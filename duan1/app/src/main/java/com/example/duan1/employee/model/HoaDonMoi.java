package com.example.duan1.employee.model;

public class HoaDonMoi {
    private String ma,tenKH,datehdmoi;

    public HoaDonMoi() {
    }

    public HoaDonMoi(String ma, String tenKH, String datehdmoi) {
        this.ma = ma;
        this.tenKH = tenKH;
        this.datehdmoi = datehdmoi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDatehdmoi() {
        return datehdmoi;
    }

    public void setDatehdmoi(String datehdmoi) {
        this.datehdmoi = datehdmoi;
    }
}
