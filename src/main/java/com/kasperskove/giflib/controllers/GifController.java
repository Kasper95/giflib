package com.kasperskove.giflib.controllers;

import com.kasperskove.giflib.entities.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {


    @RequestMapping (value = "/")
    public String listGifs(){

        return "home";
    }

    @RequestMapping(value = "/gif")
    public String gifDetails(ModelMap modelMap) {

        Gif gif = new Gif ("compiler-bot", LocalDate.of(2017,6,23), "Kasper", true);

        modelMap.put("gif", gif);

        return "gif-details";
    }
}
