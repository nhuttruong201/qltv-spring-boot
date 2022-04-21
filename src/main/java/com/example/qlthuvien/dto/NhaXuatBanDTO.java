package com.example.qlthuvien.dto;

public class NhaXuatBanDTO {
    private int manxb;
    private String tennxb;

    public NhaXuatBanDTO(int manxb, String tennxb) {
        this.manxb = manxb;
        this.tennxb = tennxb;
    }

    @Override
    public String toString() {
        return "NhaXuatBanDTO [manxb=" + manxb + ", tennxb=" + tennxb + "]";
    }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

}
