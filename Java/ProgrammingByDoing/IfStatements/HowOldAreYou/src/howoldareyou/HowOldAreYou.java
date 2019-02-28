/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howoldareyou;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class HowOldAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, what's your name?");
        String name = sc.next();

        System.out.println("Ok, " + name + " how old are you?");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("You can't drive");
        }
        if (age < 18) {
            System.out.println("You can't vote");
        }
        if (age < 25) {
            System.out.println("You can't rent a car");
        }
        if (age > 25) {
            System.out.println("You can do anything thats legal");
        }

    }

}
