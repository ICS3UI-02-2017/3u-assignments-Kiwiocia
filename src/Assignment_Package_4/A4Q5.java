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
public class A4Q5 {

    public static void main(String[] args) {
        // create a scanner
        Scanner In = new Scanner(System.in);
        // copy paste a bunch of things from question 4 and alter them 
        System.out.println("Enter your name");
        String name = In.nextLine();

        System.out.println("Test 1 was out of?");
        //create a string that the user enters
        String test1A = In.nextLine();
        //make a double out of that stringe
        double test1 = Double.parseDouble(test1A);
        System.out.println("And you got?");
        String result1a = In.nextLine();
        //create a "percetage" of the number, a percent sign will not be shown though
        double result1 = Double.parseDouble(result1a);
        double total1 = result1 / test1 * 100;

        System.out.println("Test 2 was out of?");
        String test2A = In.nextLine();
        double test2 = Double.parseDouble(test2A);
        System.out.println("And you got?");
        String result2a = In.nextLine();
        double result2 = Double.parseDouble(result2a);
        double total2 = result2 / test2 * 100;

        System.out.println("Test 3 was out of?");
        String test3A = In.nextLine();
        double test3 = Integer.parseInt(test3A);
        System.out.println("And you got?");
        String result3a = In.nextLine();
        double result3 = Integer.parseInt(result3a);
        double total3 = result3 / test3 * 100;

        System.out.println("Test 4 was out of?");
        String test4A = In.nextLine();
        double test4 = Integer.parseInt(test4A);
        System.out.println("And you got?");
        String result4a = In.nextLine();
        double result4 = Integer.parseInt(result4a);
        double total4 = result4 / test4 * 100;

        System.out.println("Test 5 was out of?");
        String test5A = In.nextLine();
        double test5 = Double.parseDouble(test5A);
        System.out.println("And you got?");
        String result5a = In.nextLine();
        double result5 = Double.parseDouble(result5a);
        double total5 = result5 / test5 * 100;
        
        
        System.out.println("Well, " + name + " these are your test results");
        System.out.println("Test 1: " + total1 + " percent");
        System.out.println("Test 2: " + total2 + " percent");
        System.out.println("Test 3: " + total3 + " percent");
        System.out.println("Test 4: " + total4 + " percent");
        System.out.println("Test 5: " + total5 + " percent");
        //calculate an average
        double avg1 = total1 + total2 + total3 + total4 + total5;
        double avg = avg1 / 5;

        System.out.println(" your average is " + avg + " percent");
    }
}