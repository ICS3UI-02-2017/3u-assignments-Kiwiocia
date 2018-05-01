/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmnet_Package_7;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A7Q8 {

    //make a method that identifies odd nubmers in numbers
    public static void allOdds(double a) {
        //esnure the number given is greater than 0
        if (a < 0) {
            a = a * (-1);
        }
        while (true) {
            if (a > 1) {
                //create a placeholder for the remainder of a/10, taking the number apart
                double b = a % 10;
                //check if the placeholder is divisible by 2
                if (b % 2 == 0) {
                    System.out.println("This Number has Even integers in it");
                    //break the while true loop
                    break;
                    //if the aforementions placeholder is not divisible by 2
                } else {
                    //then remove it from the original number 
                    //and divide by 10
                    a = a - b;
                    a = a / 10;
                }
                //if a is < 1
            } else {
                //tell the user there are no odd numbers and break the while loop
                System.out.println("This Numver has no even integers");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //le the user create a number
        double a = input.nextDouble();
        //send that number to "allOdds"
        allOdds(a);

    }
}
