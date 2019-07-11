package com.example.demo.controller;

import com.example.demo.service.ManagePersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertPersonInfoController {
    @Autowired
    private ManagePersonInfoService managePersonInfoService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        try {
            managePersonInfoService.insertPersonInfo(name, age);
        } catch (RuntimeException e) {
            return "insert failed";
        }
        return "insert success";
    }
}
