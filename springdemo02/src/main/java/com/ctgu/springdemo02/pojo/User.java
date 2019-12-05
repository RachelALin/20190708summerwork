package com.ctgu.springdemo02.pojo;



public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realidentity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealidentity() {
        return realidentity;
    }

    public void setRealidentity(String realidentity) {
        this.realidentity = realidentity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realidentity='" + realidentity + '\'' +
                '}';
    }
}
