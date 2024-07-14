package com.study1.poststudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study1.poststudy.domain.Comment;
import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
    Optional<List<Comment>> findAllByPostId(int postId);
    
}
