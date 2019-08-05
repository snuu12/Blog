package com.company.Blog.repository;

import com.company.Blog.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
}
