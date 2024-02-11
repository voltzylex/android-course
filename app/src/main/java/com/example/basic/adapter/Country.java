package com.example.basic.adapter;

public class Country {
    private int id;
    private String name,about;

    public Country(int id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }

    public Country() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }
}
