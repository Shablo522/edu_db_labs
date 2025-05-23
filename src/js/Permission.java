package com.example.model;

public class Permission {
    private int id;
    private String name;

    public Permission() { }

    public Permission(String name) {
        this.name = name;
    }

    public Permission(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Permission{id=" + id + ", name='" + name + "'}";
    }
}
