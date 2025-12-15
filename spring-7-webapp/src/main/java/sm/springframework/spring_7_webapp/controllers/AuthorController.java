package sm.springframework.spring_7_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sm.springframework.spring_7_webapp.services.AuthorService;


@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String requestMethodName(Model model) {
        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }

}
