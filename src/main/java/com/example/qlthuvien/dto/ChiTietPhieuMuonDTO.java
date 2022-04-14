package com.example.qlthuvien.dto;

import java.sql.Date;

public class ChiTietPhieuMuonDTO {
    private int maphieumuon;
    private String tensach;
    private int soluong;
    private Date ngaymuon;
    private Date hantra;
    private Date ngaytra;
    private boolean dathanhtoan;

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public boolean isDathanhtoan() {
        return dathanhtoan;
    }

    public void setDathanhtoan(boolean dathanhtoan) {
        this.dathanhtoan = dathanhtoan;
    }

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
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

    public Date getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(Date ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public Date getHantra() {
        return hantra;
    }

    public void setHantra(Date hantra) {
        this.hantra = hantra;
    }

}
