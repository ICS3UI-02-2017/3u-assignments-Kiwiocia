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
public class A7Q7 {
    //method that will tell the user the first digi of a number
    public static void firstDig(double digi) {
        //check if the number if a negtive of not
        if (digi < 0) {
            //if so then multiply the number by -1
            digi = digi * (-1);
        }
        //check for the number to be greater than 10
        while (digi > 10) {
            //if so then divide the number by 10
            digi = digi / 10;
        }
        //check if the number fits the needed praramaters of being one whole number and many decimals
        if (digi < 10 && digi > 0) {
            //round the number up and subtact by 1
            double digi1 = Math.ceil(digi);
            digi1= digi1 - 1;
            //tell the user that number
            System.out.println(digi1);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digi = input.nextInt();
        //send the integer to the firstDig method
        firstDig(digi);
    }
}
