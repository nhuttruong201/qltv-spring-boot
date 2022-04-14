package com.example.qlthuvien.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "thedocgia")
public class TheDocGiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mathe;
    private boolean dabikhoa;
    private Date ngaylamthe;
    private Date ngayhethan;
    private String hoten;
    private boolean gioitinh;
    private String sdt;
    private String diachi;
    private String cccd;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "thedocgia[mathe=" + mathe + ", dabikhoa =" + dabikhoa + ", ngaylamthe =" + ngaylamthe
                + " , ngayhethan =" + ngayhethan + ", hoten =" + hoten + ", gioitinh =" + gioitinh + " , sdt =" + sdt
                + ", diachi =" + diachi + ", cccd =" + cccd + "]";
    }

    public int getMathe() {
        return this.mathe;
    }

    public void setMathe(int mathe) {
        this.mathe = mathe;
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

    public Date getNgaylamthe() {
        return this.ngaylamthe;
    }

    public void setNgaylamthe(Date ngaylamthe) {
        this.ngaylamthe = ngaylamthe;
    }

    public Date getNgayhethan() {
        return this.ngayhethan;
    }

    public void setNgayhethan(Date ngayhethan) {
        this.ngayhethan = ngayhethan;
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

    public String getCccd() {
        return this.cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

}
