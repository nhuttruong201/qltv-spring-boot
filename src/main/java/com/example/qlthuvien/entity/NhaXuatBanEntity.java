package com.example.qlthuvien.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhaxuatban")
public class NhaXuatBanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manxb;
    private String tennxb;

    @OneToMany(mappedBy = "nhaXuatBanEntity", cascade = CascadeType.ALL)
    List<SachEntity> sachEntities;

    @Override
    public String toString() {
        return "NhaXuatBanEntity [manxb=" + manxb + ", tennxb=" + tennxb + "]";
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
