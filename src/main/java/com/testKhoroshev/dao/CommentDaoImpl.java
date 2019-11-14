package com.testKhoroshev.dao;

import com.testKhoroshev.entity.Comment;
import com.testKhoroshev.mapper.CommentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentDaoImpl implements CommentDao {

    public final JdbcTemplate jdbcTemplate;

    public CommentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(Comment comment) {
        String sql = "INSERT INTO COMMENTS (COM_ID, USER_NAME, TEXT, POST_ID) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,comment.getId(),comment.getUser(),comment.getText(),comment.getPostId());
    }

    @Override
    public List<Comment> findAll(int id) {
        String sql ="SELECT * FROM COMMENTS WHERE POST_ID = ?";
        return jdbcTemplate.query(sql, new CommentMapper(),id);
    }

    @Override
    public List<Comment> findAll() {
        String sql ="SELECT * FROM COMMENTS";
        return jdbcTemplate.query(sql, new CommentMapper());
    }

    @Override
    public void update(Comment post) {

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM COMMENTS WHERE COM_ID =?";
        jdbcTemplate.update(sql,id);
    }
}
