package com.example.duan1.model;

public class SanPhamAn {
    private int image,plus;
    private String title,price;

    public SanPhamAn(int image, int plus, String title, String price) {
        this.image = image;
        this.plus = plus;
        this.title = title;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
