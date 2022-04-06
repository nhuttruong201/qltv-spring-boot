package com.example.qlthuvien.customs;

import java.util.List;

import com.example.qlthuvien.entity.NhaXuatBanEntity;
import com.example.qlthuvien.entity.TacGiaEntity;
import com.example.qlthuvien.entity.TheLoaiEntity;

public class CustomBookInfoResponse {
    private List<TacGiaEntity> authors;
    private List<TheLoaiEntity> categories;
    private List<NhaXuatBanEntity> publishers;

    public CustomBookInfoResponse(List<TacGiaEntity> authors, List<TheLoaiEntity> categories,
            List<NhaXuatBanEntity> publishers) {
        this.authors = authors;
        this.categories = categories;
        this.publishers = publishers;
    }

    public List<TacGiaEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<TacGiaEntity> authors) {
        this.authors = authors;
    }

    public List<TheLoaiEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<TheLoaiEntity> categories) {
        this.categories = categories;
    }

    public List<NhaXuatBanEntity> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<NhaXuatBanEntity> publishers) {
        this.publishers = publishers;
    }

}
