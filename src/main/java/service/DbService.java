package service;

import java.util.ArrayList;
import java.util.List;

import entity.Product;

//package WebProjects.Maven project.bmispringweb.src.main.java.entity.Product.java;

//import com.example.project.inventory.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    // Static list for sample products
    private static List<Product> productList = new ArrayList<Product>(Arrays.asList(
            new Product("Shampoo", 10.50),
            new Product("Biscuit", 15.75),
            new Product("Cocomilk", 19.99),
            new Product("Ramen Noodle", 12.99),
            new Product("prod etc", 30.75)
    ));

    public void addProduct(Product product) {
        // Add the product to the static productList
        productList.add(product);
    }

    public List<Product> getAllProducts() {
        // Implement logic to retrieve all products
        return new ArrayList<Product>(productList);
    }

    public Product getProductById(String name) {
        // Implement logic to retrieve a product by ID
        return null; //return the correct product based on name
    }
}
