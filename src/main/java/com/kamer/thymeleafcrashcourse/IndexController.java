package com.kamer.thymeleafcrashcourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on February, 2020
 *
 * @author kamer
 */
@Controller
@RequestMapping("/")
class IndexController {

    @GetMapping("")
    String index(Model model) {

        final String username = "kamer";
        model.addAttribute("username", username);

        final Post post = new Post("Thymeleaf Crash Course", "In this article we will cover Thymeleaf...");
        model.addAttribute("post", post);

        model.addAttribute("userId", 5);

        model.addAttribute("pageNumber", 2);

        model.addAttribute("perPrice", 10);
        model.addAttribute("totalCount", "100");
        model.addAttribute("currentProfile", "DEV");

        final List<Post> postList = Arrays.asList(new Post[]{
                new Post("Custom Javax Annotation Error Handling in Spring",
                        "Hello! In this article, I’m gonna cover how to override default exception handler method for MethodArgumentNotValidException which is thrown when Java Bean Validation Annotations are violated."),
                new Post("Validations in Spring Boot",
                        "Hello! In this article, I`m gonna cover validations in a Spring Boot app. The only requirement for you to understand this topic is to be able to create controllers in Spring Boot and of course, be comfortable with Java."),
                post

        });
        model.addAttribute("posts", postList);

        final boolean isUserActive = true;
        model.addAttribute("isUserActive", isUserActive);

        final String message = "Let's go out then!";
        final boolean isMessageNew = true;
        model.addAttribute("message", message);
        model.addAttribute("isMessageNew", isMessageNew);

        model.addAttribute("draftPosts", new ArrayList<Post>());

        return "index";
    }

}
