package com.example.qlthuvien.entity;

import javax.persistence.*;

@Entity
@Table(name = "theloai")
public class TheLoaiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matheloai;
    private String tentheloai;

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

}
