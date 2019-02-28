/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adder;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class Adder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare sum and initialize to 0
        
        int sum = 0;
        int operand1 = 3;
        int operand2 = 2;
        
        // declare and initialize a Scanner object - the Scanner reads input
        // from the console
        
        Scanner sc = new Scanner(System.in);
        
        // declare and initialize String (text) variables to hold the values
        // that the user types in - The console only knows about text
        // it knows nothing about numbers
        
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        // ask the user to input the first operand:
        System.out.println("Please enter the first number to be added:");
        // now wait until the user types something in - put the value in 
        // stringOperand2
        stringOperand1 = sc.nextLine();
        
        System.out.println("Please enter the seconf number to be added:");
        stringOperand2 = sc.nextLine();
        
        // in order to add the values input by the user we must convert the 
        // String balues into int values. We use the parseInt method for this:
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        // assign the sum of operand1 and operand2 to sum
        sum = operand1 + operand2;
        
        // print the sum to the console
        System.out.println("Sum is: " + sum);
    }
    
}
