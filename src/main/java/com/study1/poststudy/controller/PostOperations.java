package com.study1.poststudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;

import com.study1.poststudy.dto.request.PostRequest;
import com.study1.poststudy.domain.Post;

import java.util.List;

@RequestMapping("/post")
public interface PostOperations {
    @PostMapping
    ResponseEntity<Post> createPost(@RequestBody PostRequest dto);

    @GetMapping("/{id}")
    ResponseEntity<Post> getPost(@PathVariable int id);

    @GetMapping(params = "writer")
    ResponseEntity<List<Post>> searchPostByWriter(@RequestParam String writer);

    @GetMapping(params = "title")
    ResponseEntity<List<Post>> searchPostByTitle(@RequestParam String postTitle);

    @GetMapping
    ResponseEntity<List<Post>> searchAll();

    @PutMapping("/{id}")
    ResponseEntity<Post> changePost(@PathVariable int id, @RequestBody PostRequest dto);

    @DeleteMapping("/{id}")
    void deletePost(@PathVariable int id);
}
