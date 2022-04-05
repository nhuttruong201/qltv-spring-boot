package com.example.qlthuvien.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "theloai")
public class TheLoaiEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matheloai;
    private String tentheloai;

    @OneToMany(mappedBy = "theLoaiEntity", cascade = CascadeType.ALL)
    List<SachEntity> sachEntities;

    @Override
    public String toString() {
        return "theloai [matheloai=" + matheloai + ", tentheloai=" + tentheloai + "]";

    }

    public int getMatheloai() {
        return matheloai;
    }

    public void setMatheloai(int matheloai) {
        this.matheloai = matheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public List<SachEntity> getSachEntities() {
        return sachEntities;
    }

    public void setSachEntities(List<SachEntity> sachEntities) {
        this.sachEntities = sachEntities;
    }

}
