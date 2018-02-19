package ru.appavlov.food.web.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.appavlov.food.web.service.repository.AuthorRepository;
import ru.appavlov.food.web.service.model.Author;

import java.util.Date;

@Controller
@RequestMapping(path = "/author")
public class MainController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam Date date) {
        Author author = new Author();
        author.setFio(name);
        author.setBirthday(date);
        authorRepository.save(author);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Author> getAllUsers() {
        return authorRepository.findAll();
    }
}