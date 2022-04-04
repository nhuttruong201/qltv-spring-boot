package com.example.qlthuvien.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ctphieumuon")
@IdClass(CTPhieuMuonEntityKey.class)
public class CTPhieuMuonEntity {

    @Id
    private int maphieumuon;
    @Id
    private int masach;

    private int soluong;

    @Override
    public String toString() {
        return "CTPhieuMuonEntity [maphieumuon=" + maphieumuon + ", masach=" + masach + ", soluong=" + soluong + "]";
    }

    public int getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(int maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

}

class CTPhieuMuonEntityKey implements Serializable {
    private int maphieumuon;
    private int masach;
}