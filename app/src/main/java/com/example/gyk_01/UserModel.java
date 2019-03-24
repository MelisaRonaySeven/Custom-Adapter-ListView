package com.example.gyk_01;

public class UserModel {

    private String name, friendshipTime;
    private int imgId;

    public UserModel(String name, String friendshipTime, int imgId) {
        this.name = name;
        this.friendshipTime = friendshipTime;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendshipTime() {
        return friendshipTime;
    }

    public void setFriendshipTime(String friendshipTime) {
        this.friendshipTime = friendshipTime;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
