package com.study1.poststudy.service;

import com.study1.poststudy.dto.request.PostRequest;
import com.study1.poststudy.domain.Post;

import java.util.List;

public interface PostService {
    Post savePost(PostRequest dto);

    List<Post> searchByWrtier(String writer);

    List<Post> searchByPostTitle(String title);

    List<Post> searchAll();

    void deletePost(int id);

    Post changePost(int id, PostRequest dto);
}
