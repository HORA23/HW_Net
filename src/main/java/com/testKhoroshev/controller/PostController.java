package com.testKhoroshev.controller;


import com.testKhoroshev.entity.Post;
import com.testKhoroshev.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PostController {
    @Autowired
    public PostService postService;

    @GetMapping("/")
    public String firstPage(){
        return "first";
    }

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        System.out.println(postService.findAll().size());
        model.addAttribute("posts", postService.findAll());
        return "posts";
    }

    @GetMapping("/post/{id}")
    public String getById(@PathVariable("id") int id,Model model){
        model.addAttribute("post",postService.getById(id));
        return"showPost";
    }

    @GetMapping("/addPost")
    public String createPostPage(){
        return "createPost";
    }

    @PostMapping("/addPost")
    public String addPost(@ModelAttribute("post") Post post){
        postService.add(post);
        return "redirect:/posts";
    }

    @PostMapping("/updatePost")
    public String updatePost(@ModelAttribute("post") Post post){
        postService.update(post);
        return "redirect:/posts";
    }
    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable("id") int id){
        postService.delete(id);
        return "redirect:/posts";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("post",postService.getById(id));
        return "editPost";
    }
}
