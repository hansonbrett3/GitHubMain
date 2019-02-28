/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morevariablesandprinting;

/**
 *
 * @author bretthanson
 */
public class MoreVariablesAndPrinting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;
        
        myName = "Brett Hanson";
        myAge = 27; //no lie
        myHeight = 72; // in inches
        myWeight = 156; // lbs
        myEyes = "Blue";
        myTeeth = "white";
        myHair = "Blonde";
        
        System.out.println("Lets talk about" + myName);
        System.out.println("He's " + myHeight + " inches tall");
        System.out.println("He's " + myWeight + " pounds heavy");
        System.out.println("Actually thats not too heavy");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
        System.out.println("His teeth are usually " + myTeeth + " depending on the coffee");
        
        //this line is tricky; try to get it exactly right
        System.out.println("If I add " + myAge + ", " + myHeight+ ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");
    }
    
}
