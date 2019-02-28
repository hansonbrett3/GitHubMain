/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreuserinputofdata;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class MoreUserInputOfData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the following information so I can sell it for a profit");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First Name:");
        String firstName = sc.next();
        System.out.println("Last Name");
        String lastName = sc.next();
        System.out.println("Grade");
        int grade = sc.nextInt();
        System.out.println("Student ID");
        int studentId = sc.nextInt();
        System.out.println("Login");
        String login = sc.next();
        System.out.println("GPA");
        double gpa = sc.nextDouble();
        
        System.out.println("Your Information");
        System.out.println("     Login: " + login);
        System.out.println("     Id: " + studentId);
        System.out.println("     Name: " + lastName + "," + firstName);
        System.out.println("     GPA: " + gpa);
        System.out.println("     Grade: " + grade);
    }
    
}
