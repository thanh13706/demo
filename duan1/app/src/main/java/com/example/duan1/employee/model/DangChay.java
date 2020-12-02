package com.example.duan1.employee.model;

public class DangChay {
    private int image;
    private String tenKM,mota,ngaybatdau,ngayketthuc;

    public DangChay() {
    }

    public DangChay(int image, String tenKM, String mota, String ngaybatdau, String ngayketthuc) {
        this.image = image;
        this.tenKM = tenKM;
        this.mota = mota;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(String ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
}
