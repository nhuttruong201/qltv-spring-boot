package com.example.qlthuvien.dto;

import java.sql.Date;

public class PhieuMuonDTO {
    private int maphieumuon;
    private Date ngaymuon;
    private Date ngaytra;
    private Date hantra;
    private boolean dathanhtoan;
    private int mathe;
    private int manhanvien;
    private String billInfo;

    public PhieuMuonDTO() {
    }

    public String getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(String billInfo) {
        this.billInfo = billInfo;
    }

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public Date getHantra() {
        return hantra;
    }

    public void setHantra(Date hantra) {
        this.hantra = hantra;
    }

    public boolean isDathanhtoan() {
        return dathanhtoan;
    }

    public void setDathanhtoan(boolean dathanhtoan) {
        this.dathanhtoan = dathanhtoan;
    }

    public int getMathe() {
        return mathe;
    }

    public void setMathe(int mathe) {
        this.mathe = mathe;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

}
