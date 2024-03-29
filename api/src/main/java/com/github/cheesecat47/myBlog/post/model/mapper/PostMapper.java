package com.github.cheesecat47.myBlog.post.model.mapper;

import com.github.cheesecat47.myBlog.post.model.CommentDto;
import com.github.cheesecat47.myBlog.post.model.PostDto;
import com.github.cheesecat47.myBlog.post.model.request.*;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface PostMapper {
    List<PostDto> getPosts(GetPostsRequest params) throws SQLException;

    PostDto getPostByTitle(String postTitle) throws SQLException;

    int createPost(CreatePostRequestDto params) throws SQLException;

    int updatePost(UpdatePostRequestDto params) throws SQLException;

    int deletePost(DeletePostRequestDto params) throws SQLException;

    List<CommentDto> getCommentsByPostTitle(String postTitle) throws SQLException;

    int createComment(CreateCommentRequestDto params) throws SQLException;
}
