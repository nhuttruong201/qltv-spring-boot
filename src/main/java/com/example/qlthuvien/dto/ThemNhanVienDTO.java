package com.example.qlthuvien.dto;

import java.util.Date;

public class ThemNhanVienDTO {
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

    public ThemNhanVienDTO(int manhanvien, String email, String matkhau, String hoten, boolean gioitinh, int namsinh,
            String sdt, String diachi, boolean dabikhoa, Date ngaytao, Date ngaysua, int machucvu) {
        this.manhanvien = manhanvien;
        this.email = email;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.dabikhoa = dabikhoa;
        this.ngaytao = ngaytao;
        this.ngaysua = ngaysua;
        this.machucvu = machucvu;
    }

    public int getManhanvien() {
        return this.manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkhau() {
        return this.matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioitinh() {
        return this.gioitinh;
    }

    public boolean getGioitinh() {
        return this.gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return this.namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isDabikhoa() {
        return this.dabikhoa;
    }

    public boolean getDabikhoa() {
        return this.dabikhoa;
    }

    public void setDabikhoa(boolean dabikhoa) {
        this.dabikhoa = dabikhoa;
    }

    public Date getNgaytao() {
        return this.ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaysua() {
        return this.ngaysua;
    }

    public void setNgaysua(Date ngaysua) {
        this.ngaysua = ngaysua;
    }

    public int getMachucvu() {
        return this.machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    @Override
    public String toString() {
        return "{" +
                " manhanvien='" + getManhanvien() + "'" +
                ", email='" + getEmail() + "'" +
                ", matkhau='" + getMatkhau() + "'" +
                ", hoten='" + getHoten() + "'" +
                ", gioitinh='" + isGioitinh() + "'" +
                ", namsinh='" + getNamsinh() + "'" +
                ", sdt='" + getSdt() + "'" +
                ", diachi='" + getDiachi() + "'" +
                ", dabikhoa='" + isDabikhoa() + "'" +
                ", ngaytao='" + getNgaytao() + "'" +
                ", ngaysua='" + getNgaysua() + "'" +
                ", machucvu='" + getMachucvu() + "'" +
                "}";
    }

}
