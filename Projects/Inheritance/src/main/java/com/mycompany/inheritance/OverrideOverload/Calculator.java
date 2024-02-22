/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.OverrideOverload;

/**
 *
 * @author DELL
 */
public class Calculator {
    // Method overloading - Same method name with different parameters
    int add(int a, int b){
        return a+b;
    }
    
    int add(int a , int b, int c){
        return a + b + c ;
    }
}
