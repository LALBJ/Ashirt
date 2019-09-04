package org.csu.ashirt.domain;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    //一定得用userId,数据库中虽然为user_id,但可以不用管
    @Id
    private int userId;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "nickname", nullable = false, length = 20)
    private String nickname;

    @Column(name = "email", nullable = false, length = 20)
    private String email;

    @Column(name = "phone_num", nullable = false, length = 15)
    private int phone_num;

    @Column(name = "head_picture", length = 25)
    private String head_picture;

    @Column(name = "city", length = 10)
    private String city;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public String getHead_picture() {
        return head_picture;
    }

    public void setHead_picture(String head_picture) {
        this.head_picture = head_picture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
