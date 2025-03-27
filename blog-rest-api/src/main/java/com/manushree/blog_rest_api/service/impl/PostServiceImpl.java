package com.manushree.blog_rest_api.service.impl;

import com.manushree.blog_rest_api.entity.Post;
import com.manushree.blog_rest_api.exception.ResourceNotFoundException;
import com.manushree.blog_rest_api.repository.PostRepository;
import com.manushree.blog_rest_api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Post savePost = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        savePost.setTitle(post.getTitle());
        savePost.setDescription(post.getDescription());
        savePost.setContent(post.getContent());
        return postRepository.save(savePost);
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        postRepository.delete(post);
    }
}
