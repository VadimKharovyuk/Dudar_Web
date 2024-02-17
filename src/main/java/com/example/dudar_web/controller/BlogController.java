package com.example.dudar_web.controller;

import com.example.dudar_web.model.Post;
import com.example.dudar_web.repositoty.PostRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor

public class BlogController {
    private final PostRepository postRepository ;
    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts =postRepository.findAll();
        model.addAttribute("post",posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model){
        return "blog-add";
    }
    @PostMapping("/blog/add")
    public String addBlog(@RequestParam String title,
                          @RequestParam String anons,
                          @RequestParam String full_text){
        Post post =new Post(title,anons,full_text);
        postRepository.save(post);
        return "redirect:/blog";

    }

}
