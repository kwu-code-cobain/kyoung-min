package com.study1.poststudy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.study1.poststudy.dto.request.PostRequest;
import com.study1.poststudy.service.PostService;
import com.study1.poststudy.domain.Post;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController implements PostOperations {
    private final PostService service;

    @Override
    public ResponseEntity<Post> createPost(PostRequest dto) {
        return ResponseEntity.ok(service.savePost(dto));
    }

    @Override
    public ResponseEntity<List<Post>> searchPostByWriter(String writer) {
        return ResponseEntity.ok(service.searchByWrtier(writer));
    }

    @Override
    public ResponseEntity<List<Post>> searchPostByTitle(String title) {
        return ResponseEntity.ok(service.searchByPostTitle(title));
    }

    @Override
    public ResponseEntity<List<Post>> searchAll() {
        return ResponseEntity.ok(service.searchAll());
    }

    @Override
    public void deletePost(int id) {
        service.deletePost(id);
    }

    @Override
    public ResponseEntity<Post> changePost(int id, PostRequest dto) {
        return ResponseEntity.ok(service.changePost(id, dto));
    }
}
