package com.example.qlthuvien.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "quyenhannhanvien")
@IdClass(CompositeKey.class)
public class QuyenHanNhanVienEntity {

    @Id
    private int maquyenhan;
    @Id
    private int manhanvien;

    @Override
    public String toString() {
        return "{" +
                " maquyenhan='" + getMaquyenhan() + "'" +
                ", manhanvien='" + getManhanvien() + "'" +
                "}";
    }

    public int getMaquyenhan() {
        return this.maquyenhan;
    }

    public void setMaquyenhan(int maquyenhan) {
        this.maquyenhan = maquyenhan;
    }

    public int getManhanvien() {
        return this.manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }
}

class CompositeKey implements Serializable {
    private int maquyenhan;
    private int manhanvien;
}