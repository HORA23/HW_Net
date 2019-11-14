package com.testKhoroshev.dao;

import com.testKhoroshev.entity.Comment;

import java.util.List;

public interface CommentDao {
    void add(Comment comment);
    List<Comment> findAll(int id);
    List<Comment> findAll();
    void update(Comment post);
    void delete(int id);
}
