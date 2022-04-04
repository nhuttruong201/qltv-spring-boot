package com.example.qlthuvien.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tacgiasach")
@IdClass(TacGiaSachEntityKey.class)
public class TacGiaSachEntity {
    @Id
    private int masach;
    private int matacgia;

    @Override
    public String toString() {
        return "tacgiasach [masach=" + masach + ", matacgia =" + matacgia + "]";
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(int matacgia) {
        this.matacgia = matacgia;
    }

}

class TacGiaSachEntityKey implements Serializable {
    private int masach;
    private int matacgia;
}