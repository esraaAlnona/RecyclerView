package com.example.recyclerview;

public class Item {
    private int mimageView;
    private String mtxtView1;
    private String mtxtView2;

    public Item(int imageView,String txt1, String txt2){
         mimageView=imageView;
         mtxtView1=txt1;
         mtxtView2=txt2;
    }

    public int getMimageView() {
        return mimageView;
    }

    public String getMtxtView1() {
        return mtxtView1;
    }

    public String getMtxtView2() {
        return mtxtView2;
    }
}
