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
public class A7Q2 {
    //assign the values of a to different grades
    public static void grade(double a) {
        if (a < 50) {
            System.out.println("You get an F");
        }
        if (a >= 50 && a < 60) {
            System.out.println("You get a D");
        }
        if (a >= 60 && a < 70) {
            System.out.println("You get a C");
        }
        if (a >= 70 && a < 80) {
            System.out.println("You get a B");
        }
        if (a >= 80 && a <= 100) {
            System.out.println("You get an A");
        }
        if (a > 100) {
            System.out.println("Yeah no");
        }

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //make a value that is input by the user
        double a = input.nextDouble();
        //give the grade method the A value
        grade(a);
    }
}
