package com.testKhoroshev.service;

import com.testKhoroshev.entity.Comment;

import java.util.List;

public interface CommentService {
    void add(Comment comment);
    Comment getById(int id);
    List<Comment> findAll(int id);
    List<Comment> findAllC();
    void delete(int id);
}
