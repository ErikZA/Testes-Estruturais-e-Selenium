/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_1.business;

import javax.ejb.Stateless;
import lombok.Data;

/**
 *
 * @author erik_
 */

@Data
public class AddString {
      public String addTopicos(String text) {
        return text + " Topicos em Computacao";
      }
}
