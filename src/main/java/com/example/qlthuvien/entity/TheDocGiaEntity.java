package com.example.qlthuvien.entity;

import java.sql.Date;

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
        return mathe;
    }

    public void setMathe(int mathe) {
        this.mathe = mathe;
    }

    public boolean isDabikhoa() {
        return dabikhoa;
    }

    public void setDabikhoa(boolean dabikhoa) {
        this.dabikhoa = dabikhoa;
    }

    public Date getNgaylamthe() {
        return ngaylamthe;
    }

    public void setNgaylamthe(Date ngaylamthe) {
        this.ngaylamthe = ngaylamthe;
    }

    public Date getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(Date ngayhethan) {
        this.ngayhethan = ngayhethan;
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

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

}
