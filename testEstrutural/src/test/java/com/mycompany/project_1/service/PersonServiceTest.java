package com.mycompany.project_1.service;

import com.mycompany.project_1.entity.base.Person;
import com.mycompany.project_1.repository.PersonRepository;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.any;
import org.mockito.Mock;
import org.mockito.Mockito;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erik_
 */
public class PersonServiceTest {
    
    private Person person;
    private PersonService  personService = new PersonService();
    @Mock
    private PersonRepository personRepository;
    
    @Before
    public void setUp(){
        this.person = new Person();
        this.person.setId((long)1);
        this.person.setName("Mario");
    }
    
    
    @Test
    public void serviceSaveTest(){
        Mockito.when(personRepository.save(any(Person.class))).thenReturn(this.person);
        Person personTest = new Person();
        personTest = personService.setName("Mario");
        Assert.assertEquals(person.getId(),this.person.getId());
        Assert.assertEquals(person.getName(),this.person.getName());  
    } 
    
    @Test
    public void serviceFindAllNamesTest(){
        ArrayList<String> names = new ArrayList<>(); 
        names.add("Mario");
        names.add("Ana");
        names.add("João");
        Mockito.when(personRepository.findAllNames()).thenReturn(names);
        Assert.assertEquals(personService.getNames(),names);  
    } 
 
  
}
