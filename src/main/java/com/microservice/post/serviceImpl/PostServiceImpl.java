package com.microservice.post.serviceImpl;

import com.microservice.post.entity.Post;
import com.microservice.post.repository.PostRepository;
import com.microservice.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;


    @Override
    public Post savePost(Post post) {
        String postId = UUID.randomUUID().toString();
        post.setId(postId);
        Post savedpost = postRepository.save(post);
        return savedpost;
    }

    @Override
    public Post findPostById(String postId) {
        Post post = postRepository.findById(postId).get();
        return post;
    }

}
