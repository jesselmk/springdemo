package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.entityrepository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class PersonRequestServiceTest extends BDDMockito {
    @InjectMocks
    private PersonInfoService personInfoService;

    @Mock
    private PersonRepository personRepository;


    @Test
    public void should_InsertPersonInfo() {
        // given
        String name = "Alice";
        Integer age = 23;
        // when
        personInfoService.insertPerson(name, age);
        // then
        verify(personRepository).save(any());
    }
}