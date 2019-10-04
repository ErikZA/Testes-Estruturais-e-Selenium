/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.repository;

import com.mycompany.project_1.entity.base.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.any;
import org.mockito.Mockito;

/**
 *
 * @author erik_
 */
public class PersonRepositoryTest {
    
    @EJB
    private Person person, person1;
       
    @Before
    public void setUp(){
        this.person1 = new Person();
        this.person = new Person();
        this.person.setId((long)1);
        this.person.setName("Mario");
    }
    
    
    @Test
    public void repositorySaveTest(){
        PersonRepository personRepository = Mockito.mock(PersonRepository.class);
        Mockito.when(personRepository.save(any(Person.class))).thenReturn(this.person);
        this.person1.setName("Mario");
        this.person1 = personRepository.save(person1);
        Assert.assertEquals(person1.getId(),this.person.getId());
        Assert.assertEquals(person1.getName(),this.person.getName());  
    } 
    
     @Test
    public void repositoryFindAllNamesTest(){
        PersonRepository personRepository = Mockito.mock(PersonRepository.class);
        ArrayList<String> names = new ArrayList<>(); 
        names.add("Mario");
        names.add("Ana");
        names.add("João");
        Mockito.when(personRepository.findAllNames()).thenReturn(names);
        Assert.assertEquals("Mario", personRepository.findAllNames().get(0));  
    } 
    
    
}
