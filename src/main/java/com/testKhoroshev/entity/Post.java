package com.testKhoroshev.entity;

public class Post {
    private int id;
    private String title;
    private String text;

    public Post(){}
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }

}
