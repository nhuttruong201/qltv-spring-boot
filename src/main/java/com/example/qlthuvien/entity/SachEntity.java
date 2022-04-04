package com.example.qlthuvien.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sach")

public class SachEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int masach;
    private String tensach;
    private int soluong;
    private int namxuatban;
    private int matheloai;
    private int manxb;

    @Override
    public String toString() {
        return "{" +
                " masach='" + getMasach() + "'" +
                ", tensach='" + getTensach() + "'" +
                ", soluong='" + getSoluong() + "'" +
                ", namxuatban='" + getNamxuatban() + "'" +
                ", matheloai='" + getMatheloai() + "'" +
                ", manxb='" + getManxb() + "'" +
                "}";
    }

    public int getMasach() {
        return this.masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return this.tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getNamxuatban() {
        return this.namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public int getMatheloai() {
        return this.matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public int getManxb() {
        return this.manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

}
