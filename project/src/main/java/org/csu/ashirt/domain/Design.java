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

    @Column(name = "design_pic", nullable = false, length = 25)
    private String design_pic;

    @Temporal(TemporalType.TIMESTAMP)
    private Date designtime;

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

    public String getDesign_pic() {
        return design_pic;
    }

    public void setDesign_pic(String design_pic) {
        this.design_pic = design_pic;
    }

    public Date getDesigntime() {
        return designtime;
    }

    public void setDesigntime(Date designtime) {
        this.designtime = designtime;
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
