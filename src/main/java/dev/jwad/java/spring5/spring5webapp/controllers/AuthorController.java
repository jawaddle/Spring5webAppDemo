package dev.jwad.java.spring5.spring5webapp.controllers;

import dev.jwad.java.spring5.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model) {

        model.addAttribute("authors",authorRepository.findAll());
        return "authors/list";
    }
}
