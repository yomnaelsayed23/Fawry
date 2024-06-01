/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taskfawry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yomna Elsayed
 */
public class Taskfawry {

    public static void main(String[] args) {
        int numProcess = 0;
        int productId;
        boolean breakLoop = true;
        ProductManager ProductMehods = new ProductManager();
        CustomerManager CustomerMethods = new CustomerManager();
        OrderManager OrderMethods = new OrderManager();

//        // Create some products
//        Product p1 = new Product(1, "iphone", "mobile", 5000, 6);
//        Product p2 = new Product(2, "samsung", "mobile", 10000, 44);
//        Product p3 = new Product(3, "opp", "mobile", 8000, 60);
//
//        // Add products to the ProductManager Array
//        ProductMehods.addProduct(p1);
//        ProductMehods.addProduct(p2);
//        ProductMehods.addProduct(p3);
        // Display all products
        ProductMehods.viewAllProducts();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Hello, Please Enter the number of process");
            System.out.println("1 : Add a new product");
            System.out.println("2 : Remove a product");
            System.out.println("3 : View all products");
            System.out.println("4 : Add a new customer");
            System.out.println("5 : Remove a customer");
            System.out.println("6 : View all customers");
            System.out.println("7 : Create a new order");
            System.out.println("8 : View all orders");
            numProcess = input.nextInt();

            int id;
            int CustomerId;
            int OrderId;
            String CustomerName;
            switch (numProcess) {
                case 1:

                    System.out.println("Enter id product : ");
                    id = input.nextInt();
                    System.out.println("Enter name product : ");
                    String name = input.next();

                    System.out.println("Enter description product : ");
                    String description = input.next();
                    System.out.println("Enter price product : ");
                    double price = input.nextDouble();
                    System.out.println("Enter stockQuantity product : ");
                    int stockQuantity = input.nextInt();

                    Product ProductCreated = new Product(id, name, description, price, stockQuantity);
                    ProductMehods.addProduct(ProductCreated);
                    System.out.println("Product Added ");

                    break;

                case 2:
                    System.out.println("Enter id product you want to delete it : ");
                    id = input.nextInt();

                    ProductMehods.removeProduct(id);
                    System.out.println("Product removed ");
                    break;
                case 3:
                    ProductMehods.viewAllProducts();

                    break;
                case 4:
                    System.out.println("Enter Customer id : ");
                    CustomerId = input.nextInt();
                    System.out.println("Enter Customer Name : ");
                    CustomerName = input.next();

                    System.out.println("Enter customer email : ");
                    String customerE = input.next();
                    System.out.println("Enter Cusstomer Address : ");
                    String CusstomerAddress = input.next();

                    Customer customerCreated = new Customer(CustomerId, CustomerName, customerE, CusstomerAddress);
                    CustomerMethods.addCustomer(customerCreated);
                    System.out.println("Customer Added ");

                    break;
                case 5:
                    System.out.println("Enter Customer id : ");
                    CustomerId = input.nextInt();
                    CustomerMethods.removeCustomer(CustomerId);
                    System.out.println("Customer removed ");

                    break;
                case 6:
                    CustomerMethods.viewAllCustomers();
                    break;
                case 7:
                    ArrayList cart = new ArrayList();
                    System.out.println("Enter order id : ");
                    OrderId = input.nextInt();
                    System.out.println("Enter Customer Name : ");
                    CustomerName = input.next();
                    Order order = new Order();

                    do {
                        System.out.println("products : " + ProductMehods.productList);

                        System.out.println("Choose your productId : ");
                        productId = input.nextInt();
                        for (int i = 0; i < ProductMehods.productList.size(); i++) {
                            if (productId == ProductMehods.productList.get(i).getId()) {
                                cart.add(ProductMehods.productList.get(i));
                                System.out.println("Product added in your Cart ");
                                break;
                            } else {
                                if (i == ProductMehods.productList.size() - 1) {
                                    System.out.println("Product not found");
                                }
                            }

                        }
                        System.out.println("You want to add new product ? ");
                        System.out.println("1 : countinue ");
                        System.out.println("0 : Exit ");

                        int addMoreProduct = input.nextInt();
                        if (addMoreProduct == 0) {
                            order.productList = cart;
                            breakLoop = false;

                        }
                    } while (breakLoop);
                    order.setId(OrderId);
                    order.setCustomer(CustomerName);
//                order.productList=ProductMehods.productList;
                    order.setTotalAmount(order.getTotalAmount());

                    OrderMethods.addOrder(order);

                    break;
                case 8:
                    OrderMethods.viewAllOrders();
                    break;

                default:
                    break;
            }

        } while (true);

//        
    }
}
