package com.example.summitclasses.helperclasses;

public class userhelper {

    String fullname, username, email, mobileno , password;



    String subscribepack12;
    String mobilenoo;
    String name;
    String image;




    public userhelper(String subscribepack12, String mobileno, String name, String image) {
        this.subscribepack12 = subscribepack12;
        this.mobileno = mobileno;
        this.name=name;
        this.image=image;

    }




    public userhelper(String fullname, String username, String email, String mobileno, String password) {
        this.fullname = fullname;
        this.username = username;
        this.email = email;
        this.mobileno = mobileno;
        this.password = password;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSubscribepack12() {
        return subscribepack12;
    }

    public void setSubscribepack12(String subscribepack12) {
        this.subscribepack12 = subscribepack12;
    }

    public String getMobilenoo() {
        return mobilenoo;
    }

    public void setMobilenoo(String mobilenoo) {
        this.mobilenoo = mobilenoo;
    }
}
