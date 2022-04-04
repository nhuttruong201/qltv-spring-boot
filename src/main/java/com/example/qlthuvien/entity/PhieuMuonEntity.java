package com.example.qlthuvien.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phieumuon")
public class PhieuMuonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maphieumuon;
    private Date ngaymuon;
    private Date ngaytra;
    private Date hantra;
    private boolean dathanhtoan;
    private int mathe;
    private int manhanvien;

    @Override
    public String toString() {
        return "PhieuMuonEntity [dathanhtoan=" + dathanhtoan + ", hantra=" + hantra + ", manhanvien=" + manhanvien
                + ", maphieumuon=" + maphieumuon + ", mathe=" + mathe + ", ngaymuon=" + ngaymuon + ", ngaytra="
                + ngaytra + "]";
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
