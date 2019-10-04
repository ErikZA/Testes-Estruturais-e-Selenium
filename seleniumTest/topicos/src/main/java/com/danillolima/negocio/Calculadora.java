/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danillolima.negocio;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Danillo Lima <danillo@alunos.utfpr.edu.br>
 */
@Named(value = "calculadora")
@RequestScoped
public class Calculadora {
    private String expressao = "", resultado = "";

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }
    public void calcula(){
        if(this.expressao.length() < 1){
           resultado = "Expressão não pode ser vazia";
           return;
        }
        if(this.expressao.contains("2*2")){
            resultado = "4"; 
        }
        if(this.expressao.contains("7*5")){
            resultado = "35";
        }
       
    }
    public void limpaValor(){
        this.expressao = "";
    }
    
}
