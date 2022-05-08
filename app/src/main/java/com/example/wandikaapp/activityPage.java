package com.example.wandikaapp;

//Tanggal Pengerjaan: 09-05-2022
//NIM: 10119220
//Nama: Moch. Wandika Yusgiar
//Kelas: IF - 6


public class activityPage {

    private String act_name;
    private int img;

    public activityPage() {
    }

    public activityPage(String act_name, int img) {
        this.act_name = act_name;
        this.img = img;
    }

    //Getter

    public String getAct_name() {
        return act_name;
    }

    public int getImg() {
        return img;
    }

    //Setter

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
