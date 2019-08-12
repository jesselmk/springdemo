package com.example.demo.controller;

import com.example.demo.request.PersonRequest;
import com.example.demo.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "person")
public class PersonController {
    @Autowired
    private PersonInfoService personInfoService;

    @PostMapping()
    public ResponseEntity insertPerson(@RequestBody PersonRequest personRequest) {
        personInfoService.insertPerson(personRequest.getName(), personRequest.getAge());
        return new ResponseEntity("操作成功", HttpStatus.OK);
    }
}
