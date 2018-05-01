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
public class A7Q5 {

    //a method that will make "lines" ammount of asterisks with random numbers of asterisks in each line
    public static void ranDots(int lines) {
        //create a loop that decides how many lines there will be
        for (int x = 0; x < lines; x++) {
            //make a random number genorator that will dicides from 1 to 5
            int ranNum = (int) (Math.random() * (5 - 1 + 1) + 1);
            //create an empty string called aster
            String aster = "";
            //loop that will add the random number of asterisks decided by the number gen
            for (int y = 0; y < ranNum; y++) {
                //add the asterisk
                aster = aster + "*";
            }
            //tell the user the line of asterisks
            System.out.println(aster);
        }

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("How many lines of asterisks will there be");
        //placeholder for lines
        int lines = input.nextInt();
        //sent the integer to ranDots method
        ranDots(lines);
    }
}
