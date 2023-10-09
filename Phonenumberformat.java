/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumberformat;

import java.util.Scanner;


public class Phonenumberformat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a 10-digit number (or '999' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equals("999")) {
                System.out.println("Goodbye!");
                break;
            }
            
            // Remove any non-digit characters from the input
            String digitsOnly = input.replaceAll("[^0-9]", "");
            
            if (digitsOnly.length() == 10) {
                String formattedNumber = "(" + digitsOnly.substring(0, 3) + ") " +
                                         digitsOnly.substring(3, 6) + "-" +
                                         digitsOnly.substring(6, 10);
                System.out.println("Formatted phone number: " + formattedNumber);
            } else {
                System.out.println("Error: Input must have exactly 10 digits.");
            }
        }
        
        scanner.close();
    }
    }
    

