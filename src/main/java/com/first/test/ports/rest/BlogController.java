package com.first.test.ports.rest;

import com.first.test.models.Blog;
import com.first.test.ports.BlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    BlogRespository blogRespository;

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRespository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogRespository.findById(blogId);
    }
///*
//    @PostMapping("/blog/search")
//    public List<Blog> search(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("text");
//        return blogRespository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
//    }
//
    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        System.out.println(new Blog(title, content).toString());
        return blogRespository.save(new Blog(title, content));
    }

    @PutMapping("/blog/{id}")
    public Blog update(@PathVariable String id, @RequestBody Map<String, String> body){
        int blogId = Integer.parseInt(id);
        // getting blog
        Optional<Blog> blog = blogRespository.findById(blogId);
        Blog blog1 = blog.get();
        System.out.println("Blog is =======+>"+blog1);
        blog1.setTitle(body.get("title"));
        blog1.setContent(body.get("content"));
        return blogRespository.save(blog1);
    }

    @DeleteMapping("blog/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        blogRespository.deleteById(blogId);
        return true;
    }
}
