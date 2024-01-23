package com.github.cheesecat47.myBlog.post.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreatePostRequestDto {
    @Schema(description = "액세스 토큰", hidden = true)
    String accessToken;

    @Schema(description = "유저 아이디. DB의 `id_str` 값")
    String userId;

    @Schema(description = "게시판 아이디", hidden = true)
    String categoryId;

    @Schema(description = "게시판 이름")
    String categoryName;

    @Schema(description = "글 제목")
    String title;

    @Schema(description = "글 요약. 최대 200자")
    String excerpt;

    @Schema(description = "글 본문. 최대 2000자")
    String content;
}
