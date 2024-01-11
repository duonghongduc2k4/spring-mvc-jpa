package com.codegym.testbktra.controller;

import com.codegym.testbktra.service.ITownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/town")
public class TownController {
    @Autowired
    private ITownService iTownService;
    @RequestMapping()
    public String getAllTowns(Model model){
        iTownService.findAll();
        return "index";
    }
}
