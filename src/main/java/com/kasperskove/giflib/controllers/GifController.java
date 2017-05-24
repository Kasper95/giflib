package com.kasperskove.giflib.controllers;

import com.kasperskove.giflib.entities.Gif;
import com.kasperskove.giflib.utilities.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping (value = "/")
    public String listGifs(){

        return "home";
    }

    @RequestMapping(value = "/gif/{name}")
    public String gifDetails(ModelMap modelMap, @PathVariable String name) {

        Gif gif = gifRepository.findByName(name);

        modelMap.put("gif", gif);

        return "gif-details";
    }
}
