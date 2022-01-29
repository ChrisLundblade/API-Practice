package com.example.practiceapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class RecipeController {
    @GetMapping("/recipes")
    @ResponseBody
    public List<Recipe> allRecipes(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return ;
    }
}
