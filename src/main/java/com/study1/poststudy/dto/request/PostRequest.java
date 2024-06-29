package com.study1.poststudy.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
    private String writer;
    private String postTitle;
    private String postContent;
}
