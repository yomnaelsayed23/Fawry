/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskfawry;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yomna Elsayed
 */
public class ProductManager {
    ArrayList <Product> productList;

    public ProductManager() {
        productList = new  ArrayList <Product>();
    }
    
    
    
    public void addProduct(Product product){
    productList.add(product);
    }
    public void removeProduct(int productId){
    productList.remove(productId);
    }
    
    public void viewAllProducts(){

      for (Product product : productList) {
//            System.out.println(product.);
System.out.println(product.toString());

        }
    }
//    public int updateStock(int productId, int newStock){
//    
//    }
}
