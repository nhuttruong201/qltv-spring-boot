package com.example.qlthuvien.entity;

import javax.persistence.*;

@Entity
@Table(name = "chucvu")
public class ChucVuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int machucvu;
    private String tenchucvu;

    @Override
    public String toString() {
        return "ChucVu [machucvu=" + machucvu + ", tenchucvu=" + tenchucvu + "]";
    }

    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

}
