package com.example.Vloger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


/**
 *  Слушает запросы от пользователя и возвращает файл шаблона
 */


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

}