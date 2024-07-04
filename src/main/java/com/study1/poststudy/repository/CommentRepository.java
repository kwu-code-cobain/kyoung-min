package com.study1.poststudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study1.poststudy.domain.Comment;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer>{
    List<Comment> findAllByPostId(int postId);
    
}
