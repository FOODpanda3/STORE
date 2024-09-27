import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class JavaApplication14 {

    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int chooce, quantity = 1;
    public static double total = 0, pay;

  
    public static List<String> orderedItems = new ArrayList<>();
    public static List<Double> orderedPrices = new ArrayList<>();

    public static void menu() {
       String menu= "************WELCOME TO MY STORE************\n"
                    + "==========MENU ITEMS BELOW==========\n"
                    + "1. French fries..........40.00\n"
                    + "2. Salad.............70.00\n"
                    + "3. Pizza.............100.00\n"
                    + "4. Coffee.............30.00\n"
                    + "5. Soda.............30.00\n"
                    + "6. EXIT";
         JOptionPane.showMessageDialog(null, menu, "Menu", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void order() {
        menu(); 
        while (true) {
            String inputStr = JOptionPane.showInputDialog("Press the coordinate numbers to select items\nWhat do you want to Buy?");
            chooce = Integer.parseInt(inputStr);

            if (chooce == 1) {
                processOrder(40.00, "French Fries");
            } else if (chooce == 2) {
                processOrder(70.00, "Salad");
            } else if (chooce == 3) {
                processOrder(100.00, "Pizza");
            } else if (chooce == 4) {
                processOrder(30.00, "Coffee");
            } else if (chooce == 5) {
                processOrder(30.00, "Soda");
            } else if (chooce == 6) {
                System.exit(6);
            } else {
                JOptionPane.showMessageDialog(null, "1 to 6 only");
                continue; // Continue to show the menu if invalid choice
            }

            
            reciteOrder();

            again = JOptionPane.showInputDialog("Do you want to buy more? (Y/N)");
            if (!again.equalsIgnoreCase("Y")) {
                processPayment();
                break; 
            }
        }
    }

    public static void processOrder(double price, String itemName) {
        JOptionPane.showMessageDialog(null, "You Choose " + itemName);
        String qtyStr = JOptionPane.showInputDialog("How many do you want?");
        quantity = Integer.parseInt(qtyStr);
        
        double itemTotal = quantity * price;
        total += itemTotal;

        
        orderedItems.add(itemName + " x" + quantity);
        orderedPrices.add(itemTotal);
    }

    public static void processPayment() {
        String payStr = JOptionPane.showInputDialog("Enter Payment");
        pay = Double.parseDouble(payStr);
        
        while (pay < total) {
            JOptionPane.showMessageDialog(null, "Not enough PAYMENT\nBalance: " + (total - pay));
            payStr = JOptionPane.showInputDialog("Enter exact amount");
            pay = Double.parseDouble(payStr);
        }

        double change = pay - total;
        JOptionPane.showMessageDialog(null, "Total Price: " + total + "\nChange: " + change + "\nPayment Successful!");

      
        reciteOrder();
    }

    public static void reciteOrder() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("************ RECEIPT ************\n");
        receipt.append("Items Ordered:\n");
        
        
        for (int i = 0; i < orderedItems.size(); i++) {
            receipt.append(orderedItems.get(i)).append(" - Total: ").append(orderedPrices.get(i)).append("\n");
        }

        receipt.append("Total Amount: ").append(total).append("\n");
        receipt.append("Thank you for your order!");

        JOptionPane.showMessageDialog(null, receipt.toString());
    }

    public static void main(String[] args) {
        do {
            order(); 
        } while (again.equalsIgnoreCase("Y"));
    }
}

