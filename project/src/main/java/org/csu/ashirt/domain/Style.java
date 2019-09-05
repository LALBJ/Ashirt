package org.csu.ashirt.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "style")
public class Style {
    @Id
    private int styleId;

    //describe保留字
    @Column(name = "style_describe", nullable = false, length = 30)
    private String styleDescribe;

    @Column(name = "style_picture")
    private String stylePicture;

    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadTime;

    @Column(name = "price", length = 5)
    private int price;

    @Column(name = "color", length = 10)
    private String color;

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public String getStyleDescribe() {
        return styleDescribe;
    }

    public void setStyleDescribe(String styleDescribe) {
        this.styleDescribe = styleDescribe;
    }

    public String getStylePicture() {
        return stylePicture;
    }

    public void setStylePicture(String stylePicture) {
        this.stylePicture = stylePicture;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
