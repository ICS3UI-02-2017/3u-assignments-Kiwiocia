/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_4;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A4Q6 {

    public static void main(String[] args) {
        // create a scanner
        Scanner In = new Scanner(System.in);
        System.out.println("what was the speed limit");
        //create a variable that consists of what the user entered
        String speedLimA = In.nextLine();
        System.out.println("and how fast were you going");
        String speedUserA = In.nextLine();
        double speedLim = Integer.parseInt(speedLimA);
        double speedUser = Integer.parseInt(speedUserA);
        double overSpeed = speedUser - speedLim;
        //create cenarios based off of the users input, one for under speedlim,
        if (overSpeed <= 0) {
            System.out.println("understandable, have a nice day");
        }
        //one for over but not over by a facotr of 20
        if (overSpeed > 0 && overSpeed <= 20) {
            System.out.println("You will be fined $100 for going " + overSpeed + " kilometers per hour over the speed limit");
        }
        //one for over but not over by a facotr of 20
        if (overSpeed > 20 && overSpeed <= 30) {
            System.out.println("You will be fined $270 for going " + overSpeed + " kilometers per hour over the speed limit");
        }
        if (overSpeed > 30) {
            System.out.println("You will be fined $500 for going " + overSpeed + " kilometers per hour over the speed limit");
        }
    }
}
