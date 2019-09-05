package org.csu.ashirt.domain;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    private int categoryId;

    @Column(name = "name", nullable = false, length = 10)
    private String name;

    @Column(name = "category_picture", nullable = false)
    private String category_picture;

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

    public String getCategory_picture() {
        return category_picture;
    }

    public void setCategory_picture(String category_picture) {
        this.category_picture = category_picture;
    }
}
