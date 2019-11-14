package com.testKhoroshev.mapper;

import com.testKhoroshev.entity.Comment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper<Comment> {

    @Override
    public Comment mapRow(ResultSet resultSet, int i) throws SQLException {
        Comment comment = new Comment();
        comment.setId(resultSet.getInt("com_id"));
        comment.setPostId(resultSet.getInt("post_id"));
        comment.setText(resultSet.getString("text"));
        comment.setUser(resultSet.getString("user_name"));
        return comment;
    }
}
