package com.example.demo.controller;

import com.example.demo.service.insertPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class insertPersonController {
    @Autowired
    private insertPersonService insertpersonservice;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age) {
        insertpersonservice.insertPerson(id, name, age);
        return "insert success";
    }
}
