package com.example.demo.controller;

import com.example.demo.request.PersonInfo;
import com.example.demo.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonInfoService personInfoService;

    @PostMapping(value = "/insert")
    public ResponseEntity insert(@RequestBody PersonInfo personInfo) {
        personInfoService.insertPersonInfo(personInfo.getName(), personInfo.getAge());
        return new ResponseEntity("操作成功", HttpStatus.OK);
    }
}