package com.example.qlthuvien.dto;

import java.util.Date;

public class TheDocGiaDTO {
    private int mathe;
    private boolean dabikhoa;
    private Date ngaylamthe;
    private Date ngayhethan;
    private String hoten;
    private boolean gioitinh;
    private String sdt;
    private String diachi;
    private String cccd;

    public TheDocGiaDTO(int mathe, boolean dabikhoa, Date ngaylamthe, Date ngayhethan, String hoten, boolean gioitinh,
            String sdt, String diachi, String cccd) {
        this.mathe = mathe;
        this.dabikhoa = dabikhoa;
        this.ngaylamthe = ngaylamthe;
        this.ngayhethan = ngayhethan;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.cccd = cccd;
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
