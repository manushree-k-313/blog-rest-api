package com.manushree.blog_rest_api.service;

import com.manushree.blog_rest_api.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long postId, Comment newComment);
    List<Comment> getCommentByPostId(Long postId);
    Comment getCommentById(Long postId, Long commentId);
    Comment updateComment(Long postId, Long commentId, Comment updateComment);
    void deleteComment(Long postId, Long commentId);
}
