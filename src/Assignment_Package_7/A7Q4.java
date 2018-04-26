/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_7;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A7Q4 {

    public static double compInterest(double prinVal, double rate, double years) {
        double bal2 = (1 + rate);
        double bal1 = Math.pow(bal2, years);
        double bal = prinVal * bal1;
        return bal;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Principal Value");
        double prinVal = input.nextDouble();
        System.out.println("Rate");
        double rate = input.nextDouble();
        System.out.println("Time in Years");
        double years = input.nextDouble();
        System.out.println(compInterest(prinVal, rate, years));
    }
}
