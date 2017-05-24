package com.kasperskove.giflib.controllers;

import com.kasperskove.giflib.models.Gif;
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
    public String gifDetails(ModelMap modelMap){

        Gif gif = new Gif ("ben-and-mike", LocalDate.of(2017,06,23), "Kasper", true);

        modelMap.put("gif", gif);

        return "gif-details";
    }
}
