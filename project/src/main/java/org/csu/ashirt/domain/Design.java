package org.csu.ashirt.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "design")
public class Design {
    @Id
    private int userId;

    private int productId;

    private int styleId;

    private char publish;

    @Column(name = "design_picture", nullable = false)
    private String designPicture;

    @Temporal(TemporalType.TIMESTAMP)
    private Date designTime;

    @Column(name = "size", nullable = false, length = 6)
    private String size;

    @Column(name = "material", nullable = false, length = 10)
    private String material;

    @Column(name = "thought")
    private String thought;

    @Column(name = "price", nullable = false, length = 5)
    private int price;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public char getPublish() {
        return publish;
    }

    public void setPublish(char publish) {
        this.publish = publish;
    }

    public String getDesignPicture() {
        return designPicture;
    }

    public void setDesignPicture(String designPicture) {
        this.designPicture = designPicture;
    }

    public Date getDesignTime() {
        return designTime;
    }

    public void setDesignTime(Date designTime) {
        this.designTime = designTime;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
