package com.study1.poststudy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import com.study1.poststudy.dto.request.CommentRequest;
import com.study1.poststudy.domain.Comment;

@RequestMapping("/comment")
public interface CommentOperations {
    @PostMapping
    ResponseEntity<Comment> createComment(@RequestBody CommentRequest dto);

    @GetMapping("/{postId}")
    ResponseEntity<List<Comment>> searchPostByWriter(@PathVariable int postId);

    @DeleteMapping("/{id}")
    void deleteComment(@PathVariable int id);
}
