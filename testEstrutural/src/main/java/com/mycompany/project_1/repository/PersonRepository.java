/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.repository;

import com.mycompany.project_1.entity.base.Person;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author erik_
 */
public interface PersonRepository {
    Person save(Person p);
    ArrayList<String> findAllNames();
}
