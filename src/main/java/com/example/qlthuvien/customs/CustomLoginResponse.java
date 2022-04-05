package com.example.qlthuvien.customs;

import com.example.qlthuvien.dto.NhanVienDTO;
import com.example.qlthuvien.entity.NhanVienEntity;

public class CustomLoginResponse extends CustomRequest {
    private NhanVienDTO body;
    private NhanVienEntity data;

    public CustomLoginResponse(int status, String message, NhanVienDTO body, NhanVienEntity data) {
        super(status, message);
        this.body = body;
        this.data = data;
    }

    public NhanVienDTO getBody() {
        return body;
    }

    public void setBody(NhanVienDTO body) {
        this.body = body;
    }

    public NhanVienEntity getData() {
        return data;
    }

    public void setData(NhanVienEntity data) {
        this.data = data;
    }


}
