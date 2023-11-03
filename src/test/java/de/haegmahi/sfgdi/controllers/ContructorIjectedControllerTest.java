package de.haegmahi.sfgdi.controllers;

import de.haegmahi.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorIjectedControllerTest {
    ContructorIjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ContructorIjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}