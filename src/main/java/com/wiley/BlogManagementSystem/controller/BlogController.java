package com.wiley.BlogManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class BlogController {

    @GetMapping("index")
    public String getIndex(Model model) {
        model.addAttribute("index");
        return "index";
    }
    @GetMapping("indexLoggedOut")
    public String getIndexLO(Model model) {
        model.addAttribute("indexLoggedOut");
        return "indexLoggedOut";
    }

    @GetMapping("allBlogs")
    public String getAllBlogs(Model model) {
        model.addAttribute("allBlogs");
        return "allBlogs";
    }
    @GetMapping("allBlogsLoggedOut")
    public String getAllBlogsLO(Model model) {
        model.addAttribute("allBlogsLoggedOut");
        return "allBlogsLoggedOut";
    }

    @GetMapping("createBlog")
    public String getCreateBlogs(Model model) {
        model.addAttribute("createBlog");
        return "createBlog";
    }

    @GetMapping("editBlog")
    public String getEditBlog(Model model) {
        model.addAttribute("editBlog");
        return "editBlog";
    }

    @GetMapping("adminDash")
    public String getAdminDash(Model model) {
        model.addAttribute("adminDash");
        return "adminDash";
    }

    @GetMapping("login")
    public String getLogin(Model model) {
        model.addAttribute("login");
        return "login";
    }

    @GetMapping("userDash")
    public String getUserDash(Model model) {
        model.addAttribute("userDash");
        return "userDash";
    }

    @GetMapping("tinyex")
    public String getTinyEx(Model model) {
        //model needs to eventually supply the content from the database to thymeleaf
        model.addAttribute("tinyex");
        return "tinyex";
    }

    @PostMapping("tinyex")
    public String postTinyEx(String content) {
        System.out.println(content);
        return "tinyex";
    }

    @PostMapping("createBlog")
    public String postBlog(String content) {
        System.out.println(content);
        return "createBlog";
    }

    @PostMapping("editBlog")
    public String editBlog(String content) {
        System.out.println(content);
        return "editBlog";
    }

    @GetMapping("editTag")
    public String getEditTag(Model model) {
        model.addAttribute("editTag");
        return "editTag";
    }

}
