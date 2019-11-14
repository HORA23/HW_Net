package com.testKhoroshev.service;

import com.testKhoroshev.dao.CommentDao;
import com.testKhoroshev.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    public CommentDao commentDao;

    @Override
    public void add(Comment comment) {
        commentDao.add(comment);
    }

    @Override
    public Comment getById(int id) {
        return null;
    }

    @Override
    public List<Comment> findAll(int id) {
         return commentDao.findAll(id);
    }

    @Override
    public List<Comment> findAllC() {
        return commentDao.findAll();
    }

    @Override
    public void delete(int id) {
        commentDao.delete(id);
    }
}
