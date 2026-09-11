package com.experiment.firstsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class FirstController {
    @GetMapping("/myworld")
    String myWorld(){
        return "This is my dear world";
    }
}
