package com.example.qlthuvien.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhaxuatban")
public class NhaXuatBan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String manhaxuatban;
    private String tennhaxuatban;

    @Override
    public String toString() {
        return "NhaXuatBanEntity{" +
                "manhaxuatban='" + manhaxuatban + '\'' +
                ", tennhaxuatban='" + tennhaxuatban + '\'' +
                '}';
    }

    public String getManhaxuatban() {
        return manhaxuatban;
    }

    public void setManhaxuatban(String manhaxuatban) {
        this.manhaxuatban = manhaxuatban;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }
}
