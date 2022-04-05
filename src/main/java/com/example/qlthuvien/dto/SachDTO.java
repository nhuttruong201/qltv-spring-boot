package com.example.qlthuvien.dto;

public class SachDTO {
    private int masach;
    private String tensach;
    private int soluong;
    private int namxuatban;
    private String tentheloai;
    private int manxb;

    public SachDTO(int masach, String tensach, int soluong, int namxuatban, String tentheloai, int manxb) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.namxuatban = namxuatban;
        this.tentheloai = tentheloai;
        this.manxb = manxb;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

}
