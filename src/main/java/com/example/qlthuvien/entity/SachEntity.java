package com.example.qlthuvien.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sach")
public class SachEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int masach;

    private String tensach;
    private int soluong;
    private int namxuatban;

    @ManyToOne
    @JoinColumn(name = "matacgia")
    private TacGiaEntity tacGiaEntity;

    @ManyToOne
    @JoinColumn(name = "matheloai")
    private TheLoaiEntity theLoaiEntity;

    @ManyToOne
    @JoinColumn(name = "manxb")
    private NhaXuatBanEntity nhaXuatBanEntity;

    public SachEntity() {
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }

    public TheLoaiEntity getTheLoaiEntity() {
        return theLoaiEntity;
    }

    public void setTheLoaiEntity(TheLoaiEntity theLoaiEntity) {
        this.theLoaiEntity = theLoaiEntity;
    }

    public TacGiaEntity getTacGiaEntity() {
        return tacGiaEntity;
    }

    public void setTacGiaEntity(TacGiaEntity tacGiaEntity) {
        this.tacGiaEntity = tacGiaEntity;
    }

    public NhaXuatBanEntity getNhaXuatBanEntity() {
        return nhaXuatBanEntity;
    }

    public void setNhaXuatBanEntity(NhaXuatBanEntity nhaXuatBanEntity) {
        this.nhaXuatBanEntity = nhaXuatBanEntity;
    }

    @Override
    public String toString() {
        return "SachEntity [masach=" + masach + ", namxuatban=" + namxuatban + ", nhaXuatBanEntity=" + nhaXuatBanEntity
                + ", soluong=" + soluong + ", tacGiaEntity=" + tacGiaEntity + ", tensach=" + tensach
                + ", theLoaiEntity=" + theLoaiEntity + "]";
    }

}
