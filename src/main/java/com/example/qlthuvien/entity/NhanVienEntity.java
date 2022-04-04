package com.example.qlthuvien.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manhanvien;
    private String email;
    private String matkhau;
    private String hoten;
    private boolean gioitinh;
    private int namsinh;
    private String sdt;
    private String diachi;
    private boolean dabikhoa;
    private Date ngaytao;
    private Date ngaysua;
    private int machucvu;

    @Override
    public String toString() {
        return "NhanVienEntity [dabikhoa=" + dabikhoa + ", diachi=" + diachi + ", email=" + email + ", gioitinh="
                + gioitinh + ", hoten=" + hoten + ", machucvu=" + machucvu + ", manhanvien=" + manhanvien + ", matkhau="
                + matkhau + ", namsinh=" + namsinh + ", ngaysua=" + ngaysua + ", ngaytao=" + ngaytao + ", sdt=" + sdt
                + "]";
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isDabikhoa() {
        return dabikhoa;
    }

    public void setDabikhoa(boolean dabikhoa) {
        this.dabikhoa = dabikhoa;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaysua() {
        return ngaysua;
    }

    public void setNgaysua(Date ngaysua) {
        this.ngaysua = ngaysua;
    }

    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

}
