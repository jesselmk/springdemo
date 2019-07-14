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

import static org.mockito.ArgumentMatchers.any;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class PersonInfoServiceTest extends BDDMockito {
    @InjectMocks
    private PersonInfoService personInfoService;

    @Mock
    private PersonRepository personRepository;


    @Test
    public void should_InsertPersonInfo() {
        // given
        String name = "Alice";
        Integer age = 23;
        Person person = new Person(name, age);
        Person personSaved = new Person(name, age);
        when(personRepository.save(person)).thenReturn(personSaved);
        // when
        personInfoService.insertPersonInfo("Alice", 23);
        // then
        assertThat(personSaved).isEqualToComparingFieldByField(person);
    }
}