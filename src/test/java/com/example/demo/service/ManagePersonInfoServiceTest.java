package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.entityrepository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.ArgumentMatchers.any;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ManagePersonInfoServiceTest extends BDDMockito {
    @InjectMocks
    private ManagePersonInfoService managePersonInfoService;

    @Mock
    private PersonRepository personRepository;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void should_InsertPersonInfo() {
        // given
         String name = "Alice";
         Integer age = 23;
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        Person personSaved = new Person();
        personSaved.setName(name);
        personSaved.setAge(age);
        personRepository = mock(PersonRepository.class);
        when(personRepository.save(person)).thenReturn(personSaved);
        // when
         managePersonInfoService.insertPersonInfo("Alice",23);
        // then
        assertThat(personSaved).isEqualToComparingFieldByField(person);
    }
}