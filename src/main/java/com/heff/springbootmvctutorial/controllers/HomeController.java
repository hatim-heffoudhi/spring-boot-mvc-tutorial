package com.heff.springbootmvctutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller
 *
 */
@RestController
public class HomeController {

    @RequestMapping("/home")
    public String home(){

        return "Bienvenue dans le tutorial Spring boot MVC";
    }
}
