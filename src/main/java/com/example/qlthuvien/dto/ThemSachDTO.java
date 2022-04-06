package com.example.qlthuvien.dto;

public class ThemSachDTO {
    private int masach;
    private String tensach;
    private int soluong;
    private int namxuatban;
    private int matheloai;
    private int manxb;

    @Override
    public String toString() {
        return "ThemSachDTO [manxb=" + manxb + ", masach=" + masach + ", matheloai=" + matheloai + ", namxuatban="
                + namxuatban + ", soluong=" + soluong + ", tensach=" + tensach + "]";
    }

    public ThemSachDTO(int masach, String tensach, int soluong, int namxuatban, int matheloai, int manxb) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.namxuatban = namxuatban;
        this.matheloai = matheloai;
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

    public int getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

}
