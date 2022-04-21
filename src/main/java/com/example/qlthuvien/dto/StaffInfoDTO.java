package com.example.qlthuvien.dto;

import java.util.List;

public class StaffInfoDTO {
    private List<ChucVuDTO> positions;

    public List<ChucVuDTO> getPositions() {
        return this.positions;
    }

    public void setPositions(List<ChucVuDTO> positions) {
        this.positions = positions;
    }

    public StaffInfoDTO(List<ChucVuDTO> positions) {
        this.positions = positions;
    }

}
