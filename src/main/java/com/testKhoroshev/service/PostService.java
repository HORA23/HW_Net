package com.testKhoroshev.service;

import com.testKhoroshev.entity.Post;

import java.util.List;

public interface PostService {
    void add(Post post);
    Post getById(int id);
    List<Post> findAll();
    void update(Post post);
    void delete(int id);
}
