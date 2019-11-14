package com.testKhoroshev.entity;

public class Comment {
    private int id;
    private int post_id;
    private String text;
    private String user;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){return this.id;}

    public void setPostId(int post_id){
        this.post_id = post_id;
    }
    public int getPostId(){return this.post_id;}

    public void setText(String text){
        this.text = text;
    }
    public String getText(){return this.text;}

    public void setUser(String user){
        this.user = user;
    }
    public String getUser(){return this.user;}
}
