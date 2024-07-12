package com.study1.poststudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study1.poststudy.domain.Post;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllByPostTitle(String PostTitle);

    List<Post> findAllByWriter(String writer);
}
