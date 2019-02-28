/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysoftheweek_switchstatements;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class DaysofTheWeek_SwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day;
        String dayName = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number for the day of the week");
        day = sc.nextInt();
        
        switch(day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;   
        }
        System.out.println(dayName);
    }
}
