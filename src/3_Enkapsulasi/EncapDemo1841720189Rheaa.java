/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jb3enkapsulasi;

/**
 *
 * @author Rhea Ivana
 */
public class EncapDemo1841720189Rhea {
    private String name;
    private int age;
    
    public String getName(){
        return name;
        
    }
    public void setName(String newName){
        name = newName;
    }
    public int getAge(){
        return age;
        
    }
    public void setAge(int newAge){
        if(newAge >= 30){
            age = 30;
        }
        else{
            age = newAge;
        }
    }
}
