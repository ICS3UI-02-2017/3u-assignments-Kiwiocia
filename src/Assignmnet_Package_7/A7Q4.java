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
public class A7Q4 {

    public static double compInterest(double prinVal, double rate, double years) {
        //this whole method is follow the formula B=P(1+r)^n
        //r is rate
        //P in prinval
        //n is years
        double bal2 = (1 + rate);
        double bal1 = Math.pow(bal2, years);
        double bal = prinVal * bal1;
        //sent "bal" back to main
        return bal;
    }

    public static void main(String[] args) {
        //get the user to input all nessesary calculations for compound interest and store values in variables
        Scanner input = new Scanner(System.in);
        System.out.println("Principal Value");
        double prinVal = input.nextDouble();
        System.out.println("Rate");
        double rate = input.nextDouble();
        System.out.println("Time in Years");
        double years = input.nextDouble();
        //tell the user the result of sending all the gathered variables to the compInterest method
        System.out.println(compInterest(prinVal, rate, years));
    }
}
