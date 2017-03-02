package com.myoa.controller;

import com.myoa.service.PostService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PostController {

    @Resource(name = "postService")
    private PostService postService;


}
