package com.example.qlthuvien.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sach")

public class SachEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int masach;
    private String tensach;
    private int soluong;
    private int namxuatban;
    // private int matheloai;
    private int manxb;

    @ManyToOne
    @JoinColumn(name = "matheloai")
    private TheLoaiEntity theLoaiEntity;

    public SachEntity() {
    }

    public SachEntity(int masach, String tensach, int soluong, int namxuatban, int manxb, TheLoaiEntity theLoaiEntity) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.namxuatban = namxuatban;
        this.manxb = manxb;
        this.theLoaiEntity = theLoaiEntity;
    }

    @Override
    public String toString() {
        return "SachEntity [manxb=" + manxb + ", masach=" + masach + ", namxuatban=" + namxuatban + ", soluong="
                + soluong + ", tensach=" + tensach + ", theLoaiEntity=" + theLoaiEntity + "]";
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

    // public int getMatheloai() {
    // return matheloai;
    // }

    // public void setMatheloai(int matheloai) {
    // this.matheloai = matheloai;
    // }

    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

    public TheLoaiEntity getTheLoaiEntity() {
        return theLoaiEntity;
    }

    public void setTheLoaiEntity(TheLoaiEntity theLoaiEntity) {
        this.theLoaiEntity = theLoaiEntity;
    }

}
