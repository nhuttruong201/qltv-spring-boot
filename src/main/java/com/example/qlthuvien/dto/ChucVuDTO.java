package com.example.qlthuvien.dto;

public class ChucVuDTO {
    private int machucvu;
    private String tenchucvu;

    public ChucVuDTO(int machucvu, String tenchucvu) {
        this.machucvu = machucvu;
        this.tenchucvu = tenchucvu;
    }

    public int getMachucvu() {
        return this.machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return this.tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

}
