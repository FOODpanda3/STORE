/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author VILLACORTA_COMP111
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
 public static Scanner input = new Scanner(System.in);
    
 
    public static String again;
    public static int chooce, quantity = 1;
    public static double total = 0, pay;
    /**
     */
    public static void menu() {
       
 
        System.out.println("************WELCOME TO MY STORE************\n");
        System.out.println("==========MENU ITEMS BELOW==========");
        System.out.println("1.frenchfries..........40.00\n"
                + "2.salad.............70.00\n"
                + "3.pizza.............100.00\n"
                + "4.coffe.............30.00\n"
                + "5.soda.............30.00\n"
                + "6. EXIT");
    }

    public static void order() {
        System.out.println("Press the coordinte numbers to select items");
        System.out.println("What do you want to Buy?");
        chooce = input.nextInt();
        if (chooce == 1) {
            System.out.println("You Choose frenchfries");
            System.out.println("How many do you want?");
            quantity = input.nextInt();
            total = total + (quantity * 40.00);
            System.out.println("Total:" + total);
            System.out.println("Do you want to buy more?");
            System.out.println("If Yes select Y and if NO selectt N");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("Do You Want to Proced Payment");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                System.out.println("Enter Payment");
                 pay = input.nextDouble();
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                order();
            } 
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                      System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } else {
                     System.out.println("Total Price:" + total);
                    total = pay-total ;
                    System.out.println("Change:" + total);
                    
                      System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE \n"
                             + "\n"
                             + "\n");
                }
            }
        } else if (chooce == 2) {
            System.out.println("You Choose salad");
            System.out.println("How many do you want?");
            quantity = input.nextInt();
            total = total + (quantity * 70.00);
            System.out.println("Total:" + total);
            System.out.println("Do you want to buy more?");
            System.out.println("If Yes select Y and if NO selectt N");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                System.out.println("Enter Payment");
                pay = input.nextDouble();
                 System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                order();
            }
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                      System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } else {
                     System.out.println("Total Price:" + total);
                    total = pay - total;
                    System.out.println("Total CHANGE:" + total);
                    
                      System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE\n"
                             + "\n"
                             + "\n");
                }
            }
        } else if (chooce == 3) {
            System.out.println("You Choose pizza");
            System.out.println("How many do you want?");
            quantity = input.nextInt();
            total = total + (quantity * 100.00);
            System.out.println("Total" + total);
            System.out.println("Do you want to buy more?");
            System.out.println("If Yes select Y and if NO selectt N");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                System.out.println("Enter Payment");
                pay = input.nextDouble();
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                order();
            }
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                      System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } else {
                     System.out.println("Total Price:" + total);
                    total = pay-total;
                    System.out.println("Total CHANGE:" + total);
                    
                      System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE\n"
                             + "\n"
                             + "\n");
                }
            }
        } else if (chooce == 4) {
            System.out.println("You Choose coffe");
            System.out.println("How many do you want?");
            quantity = input.nextInt();
            total = total + (quantity * 30.00);
            System.out.println("Total:" + total);
            System.out.println("Do you want to buy more?");
            System.out.println("If Yes select Y and if NO selectt N");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                System.out.println("Enter Payment");
                pay = input.nextDouble();
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                order();
            }
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                      System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } else {
                     System.out.println("Total Price:" + total);
                    total = pay - total;
                    System.out.println("Total CHANGE:" + total);
                    
                      System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE\n"
                             + "\n"
                             + "\n");
                }
            }
        } else if (chooce == 5) {
            System.out.println("You Choose soda");
            System.out.println("How many do you want?");
            quantity = input.nextInt();
            total = total + (quantity * 30.00);
            System.out.println("Total:" + total);
            System.out.println("Do you want to buy more?");
            System.out.println("If Yes select Y and if NO selectt N");
            again = input.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else {
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                System.out.println("Enter Payment");
                pay = input.nextDouble();
                System.out.println("DO you Want to Buy More?");
                System.out.println("If Yes select Y and if NO selectt N");
                again = input.next();
                if (again.equalsIgnoreCase("Y")) {
                order();
            }
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                      System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } else {
                     System.out.println("Total Price:" + total);
                    total = pay-total;
                    System.out.println("CHANGE:" + total);
                    
                      System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE\n"
                             + "\n"
                             + "'\n");
                }
            }
        }
        else if (chooce == 6) {
           System.exit(6);}
        else{
            System.out.println("1 to 6 only");
            order();
                System.out.println("Enter Payment");
                pay = input.nextDouble();
                if (pay <= total) {
                    System.out.println("Not enought PAYMENT");
                    System.out.println("Total Price:" + total);
                    System.out.println("ENTER EXACT AMOUNT");
                    pay=input.nextDouble();
                } 
                else {
                     System.out.println("Total Price:" + total);
                    total = pay-total;
                    System.out.println("CHANGE:" + total);
                    
                    System.out.println("Payment Sucessful");
                     System.out.println("THANK YOU FOR BUYING TO MY STORE\n"
                             + "\n"
                             + "\n");
                    
                }
        }
     }
        
        
        
    

    public static void main(String[] args) {
        do{
        menu();
        order();
        }
        while(again.equalsIgnoreCase("n")) ;
 
             
        
    }

}


