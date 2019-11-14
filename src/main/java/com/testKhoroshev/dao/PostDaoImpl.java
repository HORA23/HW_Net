package com.testKhoroshev.dao;

import com.testKhoroshev.entity.Post;
import com.testKhoroshev.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDaoImpl implements PostDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(Post post) {
        String sql = "INSERT INTO MY_POST (post_id, title, text) VALUES(?,?,?)";
        jdbcTemplate.update(sql,post.getId(),post.getTitle(),post.getText());
    }

    @Override
    public Post getById(int id) {
        String sql = "SELECT * FROM MY_POST WHERE POST_ID =?";
        return jdbcTemplate.queryForObject(sql, new PostMapper(),id);
    }

    @Override
    public List<Post> findAll() {
        String sql ="SELECT * FROM MY_POST";
        return jdbcTemplate.query(sql, new PostMapper());
    }

    @Override
    public void update(Post post) {
        String sql = "UPDATE MY_POST SET TITLE=?,TEXT=? WHERE POST_ID=?";
        jdbcTemplate.update(sql,post.getTitle(),post.getText(),post.getId());

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM MY_POST WHERE POST_ID=?";
        jdbcTemplate.update(sql,id);
    }
}
