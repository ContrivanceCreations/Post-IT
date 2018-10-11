package com.contrivance.creations.posts.domain.repositories;

import com.contrivance.creations.posts.domain.models.PostComment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostCommentRepository extends MongoRepository<PostComment, String> {

}
