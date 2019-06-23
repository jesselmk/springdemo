package com.example.demo.service;

import com.example.demo.entity.person;
import com.example.demo.entityRepository.personInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class insertPersonService {
    @Autowired
    private personInterface personinterface;

    public void insertPerson(Integer id, String name, Integer age) {
        person p = new person();
        p.setId(id);
        p.setAge(age);
        p.setName(name);
        personinterface.save(p);
    }
}
