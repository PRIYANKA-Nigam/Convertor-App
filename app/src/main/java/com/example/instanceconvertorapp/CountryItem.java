package com.example.instanceconvertorapp;

public class CountryItem {
    private String c_name;
    private int image;

    public CountryItem(String c_name, int image) {
        this.c_name = c_name;
        this.image = image;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
