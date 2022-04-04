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
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int maphieumuon;
    private String lydophat;
    private float sotienphat;
    private float sotiendadong;
    private boolean danopphat;

    @Override
    public String toString() {
        return "{" +
                " maphieumuon='" + getMaphieumuon() + "'" +
                ", lydophat='" + getLydophat() + "'" +
                ", sotienphat='" + getSotienphat() + "'" +
                ", sotiendadong='" + getSotiendadong() + "'" +
                ", danopphat='" + isDanopphat() + "'" +
                "}";
    }

    public int getMaphieumuon() {
        return this.maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getLydophat() {
        return this.lydophat;
    }

    public void setLydophat(String lydophat) {
        this.lydophat = lydophat;
    }

    public float getSotienphat() {
        return this.sotienphat;
    }

    public void setSotienphat(float sotienphat) {
        this.sotienphat = sotienphat;
    }

    public float getSotiendadong() {
        return this.sotiendadong;
    }

    public void setSotiendadong(float sotiendadong) {
        this.sotiendadong = sotiendadong;
    }

    public boolean isDanopphat() {
        return this.danopphat;
    }

    public boolean getDanopphat() {
        return this.danopphat;
    }

    public void setDanopphat(boolean danopphat) {
        this.danopphat = danopphat;
    }

}
