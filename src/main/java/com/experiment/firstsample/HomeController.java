package com.experiment.firstsample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/home1")
    public String homePage(Model model) {
        model.addAttribute("name", "Lee"); // dynamic value
        return "home"; // loads home.html
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // loads about.html
    }
}