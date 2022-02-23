package de.hhu.thymeleafsqlseq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("")
    String getIndex(){
        return "index";
    }
}
