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
public class A7Q6 {

    //make a method that takes the last digit of a number selected by the user
    public static void lastDig(int digi) {
        //find the remainer if you divide by 10
        double finDigi = digi % 10;
        //tll the user that number
        System.out.println(finDigi);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digi = input.nextInt();
        //sent digi to lastDig method
        lastDig(digi);
    }
}
