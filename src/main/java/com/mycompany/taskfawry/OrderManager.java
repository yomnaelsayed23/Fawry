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
public class OrderManager {
    private ArrayList <Order> orderList ;

    public void initializedOrderList() {
        orderList = new ArrayList <Order>();
    }
    
    
    public void addOrder(Order order){
        if (this.orderList==null){
            initializedOrderList();
        }
    this.orderList.add(order);
    }
    
    public void removeOrder(int orderId){
    this.orderList.remove(orderId);
    }
    
    public void viewAllOrders(){
    for(Order order:orderList )
        System.out.println(order);
    };
}
