package com.joke.jokegenerator.controllers;

import com.joke.jokegenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyJokesController {
    private final JokeService jokeService;

    @Autowired
    public MyJokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("myjoke",jokeService.getJoke());
        return "myjokes";
    }
}
