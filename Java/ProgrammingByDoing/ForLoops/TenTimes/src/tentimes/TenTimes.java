/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentimes;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class TenTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please type your message");
        Scanner sc = new Scanner(System.in);
        String message = sc.next("");
        for(int i = 1; i<=10; i=i+1); {
           System.out.println(message); 
        }
    }
    
}
