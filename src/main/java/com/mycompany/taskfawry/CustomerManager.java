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
public class CustomerManager {
   private ArrayList <Customer> customerList ;

    public CustomerManager() {
        this.customerList = new ArrayList <Customer>();
    }
    
    
    
    public void addCustomer(Customer customer){
    this.customerList.add(customer);
    }
//    
    public void removeCustomer(int customerId){
        this.customerList.remove(customerId);
    }
    
    public void viewAllCustomers(){
    for(Customer customer :customerList)
        System.out.println(customer);
    }
    
}
