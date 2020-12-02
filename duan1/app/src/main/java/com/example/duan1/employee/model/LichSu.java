package com.example.duan1.employee.model;

public class LichSu {
    private int somon,tongtien;
    private  String MSlichsu,ma,tenKH,tgnhan,tggiao,date;

    public LichSu() {
    }

    public LichSu(int somon, int tongtien, String MSlichsu, String ma, String tenKH, String tgnhan, String tggiao, String date) {
        this.somon = somon;
        this.tongtien = tongtien;
        this.MSlichsu = MSlichsu;
        this.ma = ma;
        this.tenKH = tenKH;
        this.tgnhan = tgnhan;
        this.tggiao = tggiao;
        this.date = date;
    }

    public int getSomon() {
        return somon;
    }

    public void setSomon(int somon) {
        this.somon = somon;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public String getMSlichsu() {
        return MSlichsu;
    }

    public void setMSlichsu(String MSlichsu) {
        this.MSlichsu = MSlichsu;
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

    public String getTgnhan() {
        return tgnhan;
    }

    public void setTgnhan(String tgnhan) {
        this.tgnhan = tgnhan;
    }

    public String getTggiao() {
        return tggiao;
    }

    public void setTggiao(String tggiao) {
        this.tggiao = tggiao;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
