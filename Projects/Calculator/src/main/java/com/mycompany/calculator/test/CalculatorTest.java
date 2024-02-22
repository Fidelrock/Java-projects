/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.test;

/**
 *
 * @author DELL
 */

import com.mycompany.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(5,3 );
        Assert.assertEquals(8,result );
    }
    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        int result = calc.subtract(5,3 );
        
        Assert.assertEquals(2,result);
    }
}
