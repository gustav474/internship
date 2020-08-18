package com.internship.internship.controllers;

import com.internship.internship.models.entity.Test;
import com.internship.internship.models.TestRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
    Start controller
 */
@Controller
public class StartController {
    @Autowired
    private TestRepository repository;
    private static Logger log = LoggerFactory.getLogger(StartController.class);

    @RequestMapping("/start")
    public String start(Model model) {
        log.info("/start");
        model.addAttribute("all", repository.findAll());

        return "start";
    }

    @PostMapping("/save")
    public String save(@RequestParam(name = "saveString") String saveString) {
        log.info("/save" + "?saveString=" + saveString);
        repository.save(new Test(saveString));

        return "redirect:/start";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(name = "id") String id, Model model) {
        log.info("/delete" + "?id=" + id);
        repository.deleteById(Long.valueOf(id));

        return "redirect:/start";
    }

    @PostMapping("/delete-all")
    public String deleteAll() {
        log.info("/delete-all");
        repository.deleteAll();

        return "redirect:/start";
    }
}
