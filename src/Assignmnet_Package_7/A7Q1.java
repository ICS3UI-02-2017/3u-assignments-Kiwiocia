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
public class A7Q1 {
    
    //make a method that calculates the area of the circle
    public static double areaCirc(double a) {
        double areaCircl = Math.pow(a, 2) * Math.PI;
        //give the method a value that can be extracted
        return areaCircl;
    }

    public static void main(String[] args) {
        //get a scanner
        Scanner input = new Scanner(System.in);
        //get the unit of measurement
        System.out.println("What unit of measurement");
        String measure = input.nextLine();
        //get the radius
        System.out.println("What is the radius of the circle");
        double a = input.nextDouble();
        //get the vaule from the area method
        double area = areaCirc(a);
        //print the method and measurement 
        System.out.println(area + " " + measure);
    }
}
