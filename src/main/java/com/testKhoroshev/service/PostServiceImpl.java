package com.testKhoroshev.service;

import com.testKhoroshev.dao.PostDao;
import com.testKhoroshev.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    public PostDao postDao;

    @Override
    public void add(Post post) {
        postDao.add(post);
    }

    @Override
    public Post getById(int id) {
        return postDao.getById(id);
    }

    @Override
    public List<Post> findAll() {
        return postDao.findAll();
    }

    @Override
    public void update(Post post) {
        postDao.update(post);
    }

    @Override
    public void delete(int id) {
        postDao.delete(id);
    }
}
