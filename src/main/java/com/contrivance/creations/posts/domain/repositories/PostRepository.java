package com.contrivance.creations.posts.domain.repositories;

import com.contrivance.creations.posts.domain.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
