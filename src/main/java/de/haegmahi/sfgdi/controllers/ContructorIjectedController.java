package de.haegmahi.sfgdi.controllers;

import de.haegmahi.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorIjectedController {
    private final GreetingService greetingService;

    public ContructorIjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
