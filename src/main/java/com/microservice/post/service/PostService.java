package com.microservice.post.service;

import com.microservice.post.entity.Post;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    public Post savePost(Post post);

    public Post findPostById(String postId);


}
