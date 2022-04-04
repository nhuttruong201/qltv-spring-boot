package com.example.qlthuvien.entity;

import javax.persistence.*;

@Entity
@Table(name = "tacgia")
public class TacGiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matacgia;
    private String tentacgia;

    @Override
    public String toString() {
        return "tacgia [matacgia=" + matacgia + ", tentacgia=" + tentacgia + "]";
    }

    public int getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(int matacgia) {
        this.matacgia = matacgia;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

}
