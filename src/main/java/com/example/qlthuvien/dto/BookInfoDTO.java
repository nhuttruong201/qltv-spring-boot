package com.example.qlthuvien.dto;

import java.util.List;

public class BookInfoDTO {
    private List<TacGiaDTO> authors;
    private List<TheLoaiDTO> categories;
    private List<NhaXuatBanDTO> publishers;

    public BookInfoDTO(List<TacGiaDTO> authors, List<TheLoaiDTO> categories, List<NhaXuatBanDTO> publishers) {
        this.authors = authors;
        this.categories = categories;
        this.publishers = publishers;
    }

    public List<TacGiaDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<TacGiaDTO> authors) {
        this.authors = authors;
    }

    public List<TheLoaiDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<TheLoaiDTO> categories) {
        this.categories = categories;
    }

    public List<NhaXuatBanDTO> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<NhaXuatBanDTO> publishers) {
        this.publishers = publishers;
    }

}
