/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.business;

import javax.ejb.EJB;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author erik_
 */
public class AddStringTest {
    
    private AddString addString;
    
    @Before
    public void setUp() {
        this.addString = new AddString();
    }
   
    @Test
    public void addStrigTest(){
        String name = "Test Topicos em Computacao";
        Assert.assertEquals(addString.addTopicos("Test"),name);
    }
}
