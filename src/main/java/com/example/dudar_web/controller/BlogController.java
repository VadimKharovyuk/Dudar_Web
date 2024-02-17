package com.example.dudar_web.controller;

import com.example.dudar_web.model.Post;
import com.example.dudar_web.repositoty.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
