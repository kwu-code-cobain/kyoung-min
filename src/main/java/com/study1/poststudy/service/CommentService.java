package com.study1.poststudy.service;

import com.study1.poststudy.dto.request.CommentRequest;
import com.study1.poststudy.domain.Comment;
import java.util.List;

public interface CommentService {
    Comment saveComment(CommentRequest dto);

    List<Comment> searchByPostId(int postId);

    void deleteComment(int id);
}
