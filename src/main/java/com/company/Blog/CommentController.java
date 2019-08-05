package com.company.Blog;

import com.company.Blog.model.Comment;
import com.company.Blog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class CommentController {


    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/comments")
    public String create(@ModelAttribute Comment comment){
        commentRepository.save(comment);
        return "redirect:/";}
}
