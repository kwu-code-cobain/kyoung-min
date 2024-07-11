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
    @PostMapping("/create")
    ResponseEntity<Post> createPost(@RequestBody PostRequest dto);

    @GetMapping("/{id}")
    ResponseEntity<Post> getPost(@PathVariable int id);

    @GetMapping(path = "/search", params = "writer")
    ResponseEntity<List<Post>> searchPostByWriter(@RequestParam String writer);

    @GetMapping(path = "/search", params = "title")
    ResponseEntity<List<Post>> searchPostByTitle(@RequestParam String postTitle);

    @GetMapping("/search/all")
    ResponseEntity<List<Post>> searchAll();

    @PutMapping("change/{id}")
    ResponseEntity<Post> changePost(@PathVariable int id, @RequestBody PostRequest dto);

    @DeleteMapping("/delete/{id}")
    void deletePost(@PathVariable int id);
}
