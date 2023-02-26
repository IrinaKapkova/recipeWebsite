package me.ikapkova.recipewebsite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
public class FirstController {
    @GetMapping
    public String applicationLaunched() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String info() {
        return "Информация: " + "<br>" +
                " имя ученика: Ирина" + "<br>" +
                " название проекта:  Веб приложение" + "<br>" +
                " дата создания проекта: 26.02.2023. " + "<br>" +
                " Веб сайт рецептов";
    }

    @GetMapping("/info/datainput")
    public String dataInput(@RequestParam String name, @RequestParam String project) {
        return "Информация: " + "<br>" +
                " имя ученика: " + name + "<br>" +
                " название проекта:  " + project + "<br>" +
                " дата создания проекта: 26.02.2023. " + "<br>" +
                " Веб приложение. ";
        //  Пример в браузере: http://localhost:8080/info/datainput?name=Ira&project=RecipeWebsite
    }
}