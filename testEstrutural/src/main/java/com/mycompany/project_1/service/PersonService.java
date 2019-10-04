/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.service;

import com.mycompany.project_1.business.AddString;
import com.mycompany.project_1.entity.base.Person;
import com.mycompany.project_1.repository.PersonRepository;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mockito.Mock;

/**
 *
 * @author erik_
 */
@AllArgsConstructor
@NoArgsConstructor
@Path("/person")
@RequestScoped
@Data
public class PersonService {
    
    @Mock
    private PersonRepository personRepository;
    private Person person = new Person();
    private AddString addString;
    
  
    public ArrayList<String> getNames() {
       return this.personRepository.findAllNames();
    }
    
    @Path("/add/{name}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Person setName(@PathParam("name") String name) {            
            this.person.setName(addString.addTopicos(name));
            return this.personRepository.save(person);
    }
    
}
