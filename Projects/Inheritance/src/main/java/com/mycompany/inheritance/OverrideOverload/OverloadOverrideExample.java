/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.OverrideOverload;

/**
 *
 * @author DELL
 */
public class OverloadOverrideExample {
    public static void main(String [] args){
        ScientificCalculator myCalc = new ScientificCalculator();
        System.out.println(myCalc.add(4, 5));
        System.out.println(myCalc.add(5,3,2));
    }
}
