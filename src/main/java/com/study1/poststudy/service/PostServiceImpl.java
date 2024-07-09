package com.study1.poststudy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study1.poststudy.domain.Post;
import com.study1.poststudy.dto.request.PostRequest;
import com.study1.poststudy.repository.PostRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository repository;

    @Override
    public Post savePost(PostRequest dto) {
        return repository.save(
                Post.builder()
                        .writer(dto.getWriter())
                        .postTitle(dto.getPostTitle())
                        .postContent(dto.getPostContent())
                        .build());
    }
    
    @Override
    public Post searchById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Post> searchByWrtier(String writer) {
        return repository.findAllByWriter(writer);
    }

    @Override
    public List<Post> searchByPostTitle(String postTitle) {
        return repository.findAllByPostTitle(postTitle);
    }

    @Override
    public List<Post> searchAll() {
        return repository.findAll();
    }

    @Override
    public void deletePost(int id) {
        repository.deleteById(id);
    }

    @Override
    public Post changePost(int id, PostRequest dto) {
        Post result = repository.findById(id).get();
        result.setPostTitle(dto.getPostTitle());
        result.setPostContent(dto.getPostContent());
        result.setWriter(dto.getWriter());
        return result;
    }
}
