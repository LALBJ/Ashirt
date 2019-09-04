package org.csu.ashirt.domain;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    private int categoryId;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "picture", nullable = false, length = 25)
    private String picture;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
