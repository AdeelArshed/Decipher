package com.decipherllc.decipher.Models;

public class Users {


    String mail , password , userID, lastMessage, profilePic, userName;

    public Users(String mail, String password, String userID, String lastMessage, String profilePic, String userName) {
        this.mail = mail;
        this.password = password;
        this.userID = userID;
        this.lastMessage = lastMessage;
        this.profilePic = profilePic;
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Users(){}

    // SignUp Constructor
    public Users(String userName, String mail, String password) {
        this.mail = mail;
        this.userName = userName;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    }
