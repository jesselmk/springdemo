package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.entityrepository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagePersonInfoService {
    @Autowired
    private PersonRepository personRepository;

    public void insertPersonInfo(String name, Integer age) {
        Person p = new Person();
        p.setAge(age);
        p.setName(name);
        personRepository.save(p);
    }
}
