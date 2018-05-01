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
public class A7Q3 {

    //make a method that will calculate the factors of a number
    public static void factors(int a) {
        //make an array that is every integer from 1 to a
        int[] factor = new int[a];
        //populate the array
        for (int y = 0; y < a; y++) {
            factor[y] = y+1;
        }
        //decide what the factors of a are with the array
        for (int x = 0; x < a; x++) {
            if (a % factor[x] == 0) {
                //tell the user that number
                System.out.println(factor[x]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //make a value that is input by the user
        int a = input.nextInt();
        //give the factors method the a value
        factors(a);
    }
}
