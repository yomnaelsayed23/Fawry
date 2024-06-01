/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskfawry;
import java.util.ArrayList;
/**
 *
 * @author Yomna Elsayed
 */
public class Order extends Product  {
    private int id;
    private String customer;
    ArrayList <Product> productList;
    private double totalAmount=0;
    
//    constractors

    public Order() {
    }

    public Order(int id, String customer,    ArrayList <Product> productList, double totalAmount) {
        this.id = id;
        this.customer = customer;
        productList = new ArrayList();
        this.totalAmount = totalAmount;
    }
//    setters Methods

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setProductList( ArrayList <Product> productList) {
        this.productList = productList;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
//    Getters Methods

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public ArrayList <Product> getProductList() {
        return productList;
    }

    public double getTotalAmount() {
        for(Product product : productList)
           totalAmount += product.price ;
        return totalAmount;
    }
    
//    calculate Total Amount Method
//    public double calculateTotalAmount(){}
    
//    tostring Method

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customer=" + customer + ", productList=" + productList + ", totalAmount=" + totalAmount + '}';
    }
    
    
    
    
}
