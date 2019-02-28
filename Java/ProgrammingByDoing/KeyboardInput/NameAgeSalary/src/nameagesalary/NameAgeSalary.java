/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameagesalary;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class NameAgeSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        int userAge;
        double userSalary;
        
        System.out.println("Hello. What is your name?");
        userName = sc.next();
        
        System.out.println("Hello, " + userName + "How old are you?");
        userAge = sc.nextInt();
        
        System.out.println("So, you're " + userAge + " , eh. That's not old at all!");
        System.out.println("How much do you make " + userName + "?");
        userSalary = sc.nextDouble();
        
        System.out.println(userSalary + " I hope that's per hour and not per year! LOL!");
        
    }
    
}
