package com.example.duan1.employee.model;

public class DanhGia {
    private int image;
    private String ma, tenMon;

    public DanhGia() {
    }

    public DanhGia(int image, String ma, String tenMon) {
        this.image = image;
        this.ma = ma;
        this.tenMon = tenMon;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
}
