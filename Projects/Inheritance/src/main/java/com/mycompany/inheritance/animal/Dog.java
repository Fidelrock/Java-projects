/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance.animal;

/**
 *
 * @author DELL
 */
public class Dog extends Animal {
    
    public Dog(String name, String species) {
        super(name, species);
    }
    void bark(){
        System.out.println(name + " is barking!");
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy","Golden Retriever");
        System.out.println(myDog.name);
        System.out.println(myDog.species);
        myDog.bark();
    }
}
