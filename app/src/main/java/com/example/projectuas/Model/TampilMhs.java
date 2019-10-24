package com.example.projectuas.Model;

public class TampilMhs {
    private String nim;
    private String namaMhs;
    private String emailMhs;
    private String alamatMhs;

    public DaftarKelas(String nim, String namaMhs,  String emailMhs, String alamatMhs){

        this.nim= nim;
        this.namaMhs = namaMhs;
        this.emailMhs = emailMhs;
        this.alamatMhs =alamatMhs;

    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }


    public String getNamaMhs() {
        return namaMhs;
    }
    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }


    public String getEmailMhs() {
        return emailMhs;
    }
    public void setEmailMhs(String emailMhs) {
        this.emailMhs = emailMhs;
    }

    public String getAlamatMhs() {
        return alamatMhs;
    }
    public void setAlamatMhs(String alamatMhs) {
        this.alamatMhs = alamatMhs;
    }

}
