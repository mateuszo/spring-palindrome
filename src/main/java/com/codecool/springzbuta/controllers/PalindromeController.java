package com.codecool.springzbuta.controllers;

import com.codecool.springzbuta.models.Palindrome;
import com.codecool.springzbuta.repositories.PalindromeRepository;
import com.codecool.springzbuta.services.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PalindromeController {

    @Autowired
    private PalindromeService ps;

    @Autowired
    private PalindromeRepository pr;

    @GetMapping(path ="/hello", params = "text")
    String home(@RequestParam("text") String text, Model model){
        Palindrome p = new Palindrome(text);
        pr.save(p);
        model.addAttribute("result", ps.getResult(text));
        return "palindrome";
    }

    @GetMapping("/list/{start}")
    String list(@PathVariable String start, Model model){
        model.addAttribute("list", pr.findAllByTextStartingWith(start));
        return "list";
    }

}
