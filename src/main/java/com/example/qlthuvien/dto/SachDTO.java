package com.example.qlthuvien.dto;

public class SachDTO {
    private int masach;
    private String tensach;
    private int soluong;
    private int namxuatban;
    private TacGiaDTO tacgia;
    private TheLoaiDTO theloai;
    private NhaXuatBanDTO nhaxuatban;

    public SachDTO(int masach, String tensach, int soluong, int namxuatban, TacGiaDTO tacgia, TheLoaiDTO theloai,
            NhaXuatBanDTO nhaxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.namxuatban = namxuatban;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.nhaxuatban = nhaxuatban;
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

    public TacGiaDTO getTacgia() {
        return tacgia;
    }

    public void setTacgia(TacGiaDTO tacgia) {
        this.tacgia = tacgia;
    }

    public TheLoaiDTO getTheloai() {
        return theloai;
    }

    public void setTheloai(TheLoaiDTO theloai) {
        this.theloai = theloai;
    }

    public NhaXuatBanDTO getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(NhaXuatBanDTO nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

}
