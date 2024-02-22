/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance;

import com.mycompany.inheritance.animal.Dog;

/**
 *
 * @author DELL
 */
public class Inheritance {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy","Golden Retriever");
        System.out.println(myDog.name);
        System.out.println(myDog.species);
        myDog.bark();
    }
}
