package com.study1.poststudy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study1.poststudy.repository.CommentRepository;
import com.study1.poststudy.dto.request.CommentRequest;
import com.study1.poststudy.domain.Comment;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository repository;

    @Override
    public Comment saveComment(CommentRequest dto) {
        return repository.save(
                Comment.builder()
                        .postId(dto.getPostId())
                        .writer(dto.getWriter())
                        .content(dto.getContent())
                        .build());
    }

    @Override
    public List<Comment> searchByPostId(int postId) {
        return repository.findAllByPostId(postId)
                .orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public void deleteComment(int id) {
        repository.deleteById(id);
    }
}
