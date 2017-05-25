package com.kasperskove.giflib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    @RequestMapping (value = "/")
    public String listGifs(ModelMap modelMap){

        return "home";
    }

    @RequestMapping(value = "/gif/{name}")
    public String gifDetails(ModelMap modelMap, @PathVariable String name) {

        return "gif-details";
    }
}
