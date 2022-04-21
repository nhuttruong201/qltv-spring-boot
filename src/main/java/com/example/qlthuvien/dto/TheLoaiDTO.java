package com.example.qlthuvien.dto;

public class TheLoaiDTO {
    private int matheloai;
    private String tentheloai;

    public TheLoaiDTO(int matheloai, String tentheloai) {
        this.matheloai = matheloai;
        this.tentheloai = tentheloai;
    }

    @Override
    public String toString() {
        return "TheLoaiDTO [matheloai=" + matheloai + ", tentheloai=" + tentheloai + "]";
    }

    public int getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

}
