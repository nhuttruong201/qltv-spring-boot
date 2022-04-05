package com.example.qlthuvien.customs;

import java.util.List;

import com.example.qlthuvien.entity.SachEntity;

public class CustomBookResponse extends CustomRequest {
    List<SachEntity> data;

    public CustomBookResponse(int status, String message, List<SachEntity> data) {
        super(status, message);
        this.data = data;
    }

    public List<SachEntity> getData() {
        return data;
    }

    public void setData(List<SachEntity> data) {
        this.data = data;
    }
}
