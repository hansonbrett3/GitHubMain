/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adumbcalculator;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class ADumbCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your first number?");
        int firstNumber = sc.nextInt();
        System.out.println("What is your second number?");
        int secondNumber = sc.nextInt();
        System.out.println("What is your third number?");
        int thirdNumber = sc.nextInt();
        
        System.out.println( + firstNumber + "+" + secondNumber + "+" + thirdNumber + "divided by 2 is " + ((firstNumber+secondNumber+thirdNumber)/2));
        
        
    }
    
}
