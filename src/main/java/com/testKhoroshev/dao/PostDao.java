package com.testKhoroshev.dao;

import com.testKhoroshev.entity.Post;

import java.util.List;

public interface PostDao {
    void add(Post post);
    Post getById(int id);
    List<Post> findAll();
    void update(Post post);
    void delete(int id);
}
