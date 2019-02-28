/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatements;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class IfStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int day;
        String dayName = "";
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number for the day of the week");
        day = sc.nextInt();
        
        
        
        if(day == 1){
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        }else if (day == 4) {
            dayName = "Thursday";
        }else if (day == 5) {
            dayName = "Friday";
        }else if (day == 6) {
            dayName = "Saturday";
        }else if (day == 7) {
            dayName = "Sunday";
        }
        
        System.out.println(dayName);
    }
    
}
