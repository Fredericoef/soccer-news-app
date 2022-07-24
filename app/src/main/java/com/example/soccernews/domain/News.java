package com.example.soccernews.domain;

public class News {

    private String title;
    private String descripton;

    public News(String title, String descripton) {
        this.title = title;
        this.descripton = descripton;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
