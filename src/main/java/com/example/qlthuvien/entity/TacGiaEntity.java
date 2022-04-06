package com.example.qlthuvien.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "tacgia")
public class TacGiaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matacgia;
    private String tentacgia;

    @OneToMany(mappedBy = "tacGiaEntity", cascade = CascadeType.ALL)
    private List<SachEntity> sachEntities;

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

    public List<SachEntity> getSachEntities() {
        return sachEntities;
    }

    public void setSachEntities(List<SachEntity> sachEntities) {
        this.sachEntities = sachEntities;
    }

    @Override
    public String toString() {
        return "TacGiaEntity [matacgia=" + matacgia + ", tentacgia=" + tentacgia + "]";
    }

}
