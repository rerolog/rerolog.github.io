package com.github.cheesecat47.myBlog.blog.service;

import com.github.cheesecat47.myBlog.blog.model.BlogInfoDto;
import com.github.cheesecat47.myBlog.blog.model.request.CreateCategoryRequestDto;
import com.github.cheesecat47.myBlog.blog.model.request.DeleteCategoryRequestDto;
import com.github.cheesecat47.myBlog.blog.model.request.UpdateCategoryRequestDto;
import com.github.cheesecat47.myBlog.blog.model.response.CategoryDto;

import java.util.List;

public interface BlogService {
    BlogInfoDto getBlogInfo(String blogId) throws Exception;

    List<CategoryDto> getCategories(String blogId) throws Exception;

    void createCategory(CreateCategoryRequestDto params) throws Exception;

    void updateCategory(UpdateCategoryRequestDto params) throws Exception;

    void deleteCategory(DeleteCategoryRequestDto params) throws Exception;
}
