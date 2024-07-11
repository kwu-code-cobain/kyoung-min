package com.study1.poststudy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.study1.poststudy.dto.request.CommentRequest;
import com.study1.poststudy.service.CommentService;
import com.study1.poststudy.domain.Comment;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CommentController implements CommentOperations {
    private final CommentService service;

    @Override
    public ResponseEntity<Comment> createComment(CommentRequest dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveComment(dto));
    }

    @Override
    public ResponseEntity<List<Comment>> searchPostByWriter(int postId) {
        return ResponseEntity.ok(service.searchByPostId(postId));
    }

    @Override
    public void deleteComment(int id) {
        service.deleteComment(id);
    }
}
