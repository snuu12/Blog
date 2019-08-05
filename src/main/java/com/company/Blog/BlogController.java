package com.company.Blog;

import com.company.Blog.model.Blog;
import com.company.Blog.model.Comment;
import com.company.Blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    @Autowired
    BlogRepository blogRepository;

@GetMapping("/")
public String home (ModelMap map ){
    map.put("blogs",blogRepository.findAll());
    map.put("blog",new Blog());
    return "01-homepage";
}

    @PostMapping("/add")
    public String create(@ModelAttribute Blog blog){
       blogRepository.save(blog);

        return "redirect:/";}


    @GetMapping("/blog/{id}")
    public String show(@PathVariable Integer id, ModelMap map){
        Blog blog=blogRepository.findById(id).get();
        map.put("blog",blog);
        Comment comment=new Comment();
        comment.setBlog(blog);
        map.put("comment",comment);
        return "02-Single-post";
    }


}
