package com.study1.poststudy.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentRequest {
    private int postId;
    private String writer;
    private String content;
}
