package org.csu.ashirt.domain;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    private int itemId;

    private int categoryId;

    @Column(name = "item_picture", nullable = false)
    private String itemPicture;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemPicture() {
        return itemPicture;
    }

    public void setItemPicture(String itemPicture) {
        this.itemPicture = itemPicture;
    }
}
