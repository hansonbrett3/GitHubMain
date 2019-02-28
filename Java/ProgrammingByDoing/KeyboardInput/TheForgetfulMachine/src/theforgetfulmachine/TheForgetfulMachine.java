/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theforgetfulmachine;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class TheForgetfulMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputOne;
        String inputTwo;
        
        int integerOne;
        int integerTwo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give me a word");
        inputOne = sc.next();
        System.out.println("Give me a second word");
        inputTwo = sc.next();
        System.out.println("Great, now your favorite number?");
        integerOne = sc.nextInt();
        System.out.println("And your second favorite number");
        integerTwo = sc.nextInt();
    }
    
}
