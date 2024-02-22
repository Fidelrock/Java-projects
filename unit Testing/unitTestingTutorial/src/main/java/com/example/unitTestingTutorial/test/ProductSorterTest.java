
package com.example.unitTestingTutorial.test;
import com.example.unitTestingTutorial.Product;
import com.example.unitTestingTutorial.ProductSorter;
import org.junit.Assert;
import org.junit.Test;
public class ProductSorterTest {
@Test
    public void testSortByPrice(){
    // create an array of Product objects with names and price

    Product[] products = new Product[]{
            new Product("Laptop",1200.00),
            new Product("Phone",800.00),
            new Product("Watch",300.00)
    };

    ProductSorter.sortByPrice(products);

    Assert.assertEquals("watch",products[0].getName());
    Assert.assertEquals("Phone",products[1].getName());
    Assert.assertEquals("Laptop",products[2].getName());
}
}
