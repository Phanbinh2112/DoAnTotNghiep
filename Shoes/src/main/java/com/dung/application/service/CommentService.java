package com.dung.application.service;

import com.dung.application.entity.Comment;
import com.dung.application.model.request.CreateCommentPostRequest;
import com.dung.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest, long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
