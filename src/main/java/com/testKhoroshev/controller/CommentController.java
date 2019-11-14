package com.testKhoroshev.controller;

import com.testKhoroshev.entity.Comment;
import com.testKhoroshev.service.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CommentController {

    @Autowired
    public CommentServiceImpl commentService;

    @GetMapping("{id}")
    public String getAllComments(@PathVariable("id") int id ,Model model) {
        System.out.println(commentService.findAll(id));
        System.out.println(id);
        model.addAttribute("comments", commentService.findAll(id));
        return "comments";
    }

    @GetMapping("/comments")
    public String getAllComments(Model model) {
        model.addAttribute("comments", commentService.findAllC());
        return "comments";
    }

    @GetMapping("/deleteCom/{id}")
    public String deletePost(@PathVariable("id") int id){
        commentService.delete(id);
        return "redirect:/comments";
    }

    @GetMapping("/addComments")
    public String createPostPage(){
        return "createComment";
    }

    @PostMapping("/addComments")
    public String addPost(@ModelAttribute("comment") Comment comment){
        commentService.add(comment);
        return "redirect:/posts";
    }
}
