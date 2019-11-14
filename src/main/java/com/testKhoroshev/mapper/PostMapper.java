package com.testKhoroshev.mapper;

import com.testKhoroshev.entity.Post;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PostMapper implements RowMapper<Post> {
    @Override
    public Post mapRow(ResultSet resultSet, int i) throws SQLException {
        Post post = new Post();
        post.setId(resultSet.getInt("post_id"));
        post.setTitle(resultSet.getString("title"));
        post.setText(resultSet.getString("text"));
        return post;
    }
}
