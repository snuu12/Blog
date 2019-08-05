package com.company.Blog.repository;

import com.company.Blog.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog,Integer> {
}
