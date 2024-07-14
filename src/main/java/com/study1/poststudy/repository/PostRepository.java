package com.study1.poststudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study1.poststudy.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<List<Post>> findAllByPostTitle(String PostTitle);

    Optional<List<Post>> findAllByWriter(String writer);
}
