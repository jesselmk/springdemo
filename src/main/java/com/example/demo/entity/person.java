package com.example.demo.entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.persistence.*;

@Entity
public class person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
