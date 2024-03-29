package com.github.cheesecat47.myBlog.user.model.mapper;

import com.github.cheesecat47.myBlog.user.model.UserInfoDto;
import com.github.cheesecat47.myBlog.user.model.request.LoginRequestDto;
import com.github.cheesecat47.myBlog.user.model.request.LogoutRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface UserMapper {
    UserInfoDto getUserInfo(String userId) throws SQLException;

    int login(LoginRequestDto params) throws SQLException;

    void logout(LogoutRequestDto params) throws SQLException;

    int updateRefreshToken(String userId, String refreshToken) throws SQLException;

    String getRefreshToken(String userId) throws SQLException;
}
