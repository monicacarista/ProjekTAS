package com.example.projectuas.Model;

public class CRUDDosen {
    private String gelar;
    private String email;
    private String alamat;
    private int imgdos;

    public CRUDDosen(String gelar, String email,  String alamat, int imgdos){

        this.gelar = gelar;
        this.email = email;
        this.alamat =alamat;
        this.imgdos = imgdos;

    }
    public String getGelar() {
        return gelar;
    }
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public int getImgdos(){
        return imgdos;
    }
    public void setImgdos(int imageResource) {
        this.imgdos = imgdos;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }



}
