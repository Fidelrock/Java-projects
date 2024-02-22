package com.example.unitTestingTutorial;

import java.util.Arrays;



public class ProductSorter {

    // This static method sorts an array of Product objects by their prices in ascending order.

    public static void sortByPrice(Product[]products){
        //use Arrays.sort method with a lamda expression to define the sorting criteria
        Arrays.sort( products,(p1,p2)-> Double.compare(p1.getPrice(),p2.getPrice()));

        //The lamda expression compares two product objects based on their price
        //The sort method modifies the 'products' array in place, Sorting the product objects by their price.
        //p1.getPrice() and p2.getPrice() fetch the prices of two products objects for comparison.
        //Double.compare()' compares two double values and returns an integer to determine the order.
    }
}
