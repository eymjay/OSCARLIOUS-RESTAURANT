/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package oscarliousrestaurant;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new
             Scanner(System.in);
            int choice;
            int num1 = 100;
            int num2 = 50;
            int num3 = 30;
            int num4 = 12;
            int num5 = 10;
            int quantity;
            double yes;
            double totalAmount = 0.0;
            double result;
            double cash =  0.0;

            System.out.println("OSCARLIOUS RESTAURANT");

            do {
                System.out.println("Choose the product you want to purchase, type the number of the product you want to purchase");
                System.out.println("DISCOUNT & VOUCHER");
                System.out.println("1. WHOLE Letchon Baboy ------ $100");
                System.out.println("2. Letchon Manok ---- $50");
                System.out.println("3. Sinigang na Bangus ---------- $30");
                System.out.println("4. Adobong Pusit -- $12");
                System.out.println("5.  ------- $10");

                System.out.println("Enter Item:");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the quantity:");
                        quantity = input.nextInt();
                        result = num1 * quantity;
                        totalAmount += result;
                        System.out.println("Your total for WHOLE Letchon Baboy is: $" + result);
                        break;

                    case 2:
                        System.out.println("Enter the quantity:");
                        quantity = input.nextInt();
                        result = num2 * quantity;
                        totalAmount += result;
                        System.out.println("Your total for Letchong Manok is: $" + result);
                        break;

                    case 3:
                        System.out.println("Enter the quantity:");
                        quantity = input.nextInt();
                        result = num3 * quantity;
                        totalAmount += result;
                        System.out.println("Your total for Sinigang na Bangus is: $" + result);
                        break;

                    case 4:
                        System.out.println("Enter the quantity:");
                        quantity = input.nextInt();
                        result = num4 * quantity;
                        totalAmount += result;
                        System.out.println("Your total for Adobong pusit is: $" + result);
                        break;
                        
                    case 5:
                    System.out.println("Enter the quantity:");
                        quantity = input.nextInt();
                        result = num5 * quantity;
                        totalAmount += result;
                        System.out.println("Your total for Pares is: $" + result);
                        break;
                
                    case 6:
                        System.out.println("No more items to purchase.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a valid item.");
                        break;
                }

                // Ask if they want to buy more
                if (choice != 6) {
                    System.out.println("Do you want to buy more items? (1 for Yes, 0 for No)");
                    choice = input.nextInt();
                }
            } while (choice != 0 && choice != 6); // loop until they choose to stop

            // Show final total
            System.out.println("Your total purchase is: $" + totalAmount);

            // Ask for the amount of cash and ensure it's sufficient
            do {
                System.out.println("Enter the amount of cash:");
                cash = input.nextDouble();

                if (cash < totalAmount) {
                    System.out.println("Insufficient cash. Please enter enough to cover the total amount.");
                }
            } while (cash < totalAmount);

            // If cash is sufficient, calculate change
            double change = cash - totalAmount;
            System.out.println("Your change is: $" + change);

            // Ask if they want a receipt
            System.out.println("Do you want a receipt? (1 for Yes, 0 for No)");
            int receipt = input.nextInt();

            if (receipt == 1) {
                System.out.println("****** RECEIPT ******");
                System.out.println("Total amount: $" + totalAmount);
                System.out.println("Cash provided: $" + cash);
                System.out.println("Change: $" + change);
                System.out.println("************************");
            } else {
                System.out.println("Thank you for shopping! No receipt requested.");
            }

            System.out.println("Thank you for visiting OSCARLIOUS RESTAURANT!");
        }
    }



    


