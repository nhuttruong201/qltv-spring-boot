package com.example.qlthuvien.dto;

public class NhanVienDTO {
    private String email;
    private String matkhau;

    @Override
    public String toString() {
        return "NhanVienDTO [email=" + email + ", matkhau=" + matkhau + "]";
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

}
