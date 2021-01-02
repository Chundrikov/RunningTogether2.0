package com.run.baby.run.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String loginName;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column
    private boolean active;

    @Column
    private boolean removed;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String city;

    @Column
    private String district;

    @Column
    private String level;

    @Column
    private Date registered;

    @Column
    @JsonIgnore
    private String password;

    public User(Integer id, String name, String loginName, UserType userType, boolean active, boolean removed, String email, String phone, String city, String district, String level, Date registered, String password) {
        this.id = id;
        this.name = name;
        this.loginName = loginName;
        this.userType = userType;
        this.active = active;
        this.removed = removed;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.district = district;
        this.level = level;
        this.registered = registered;
        this.password = password;
    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Boolean getRemoved() {
        return removed;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {}

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public enum UserType {
        USER("Пользователь"), ADMIN("Администратор");
        private final String title;

        UserType(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "loginName='" + loginName + '\'' +
                ", name='" + name + '\'' +
                ", userType=" + userType +
                ", active=" + active +
                ", removed=" + removed +
                ", name=" + name +
                ", email=" + email +
                ", phone=" + phone +
                ", city=" + city +
                ", district=" + district +
                ", level=" + level +
                '}';
    }
}

