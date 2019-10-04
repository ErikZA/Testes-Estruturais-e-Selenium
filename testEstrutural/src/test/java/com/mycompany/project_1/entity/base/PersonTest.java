/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.entity.base;

import javax.ejb.EJB;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author erik_
 */
public class PersonTest {
    
    private Person person, personTest;
       
    @Before
    public void setUp(){
        this.personTest = new Person();
        this.person = new Person();
        this.person.setId((long)1);
        this.person.setName("Mario");
    }
    
    @Test
    public void getAndSetIdPersonTest(){
        this.personTest.setId((long)1);
        assertEquals(this.person.getId(),personTest.getId());
    }
    
    @Test
    public void getAndSetNameNormalizeCasePersonTest(){
        this.personTest.setName("MARIO");
        assertEquals(this.person.getName(),personTest.getName());
    }
    
}
