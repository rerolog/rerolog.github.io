package com.github.cheesecat47.myBlog.post.service;

import com.github.cheesecat47.myBlog.post.model.CommentDto;
import com.github.cheesecat47.myBlog.post.model.PostDto;
import com.github.cheesecat47.myBlog.post.model.request.*;

import java.util.List;

public interface PostService {
    List<PostDto> getPosts(GetPostsRequest params) throws Exception;

    PostDto getPostByTitle(String postTitle) throws Exception;

    void createPost(CreatePostRequestDto params) throws Exception;

    void updatePost(UpdatePostRequestDto params) throws Exception;

    void deletePost(DeletePostRequestDto params) throws Exception;

    List<CommentDto> getCommentsByPostTitle(String postTitle) throws Exception;

    void createComment(CreateCommentRequestDto params) throws Exception;
}
