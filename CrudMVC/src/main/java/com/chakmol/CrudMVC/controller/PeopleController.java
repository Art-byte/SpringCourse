package com.chakmol.CrudMVC.controller;

import com.chakmol.CrudMVC.model.People;
import com.chakmol.CrudMVC.service.PeopleServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PeopleController {

    @Autowired
    private PeopleServiceApi peopleServiceApi;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("list", peopleServiceApi.getAll());
        return "index";
    }

    /*
    * Capturamos los datos a guardar
    * */
    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") Long id, Model model){
        if(id != null && id !=0){
            model.addAttribute("people", peopleServiceApi.get(id));
        }else{
            model.addAttribute("people", new People());
        }
        return "save";
    }

    /*
    * Aqui comenzamos a guardar directamente los datos
    * */
    @PostMapping("/save")
    public String save(People people, Model model){
        peopleServiceApi.save(people);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model){
        peopleServiceApi.delete(id);
        return "redirect:/";
    }


}
