/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_6;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A6Q6 {

    public static void main(String[] args) {
        //this is bascily a combination of question 1 and 5 so im going to copy paste some properties from them
        //make a scanner 
        Scanner input = new Scanner(System.in);
        System.out.println("how many students");
        //create a value that will store what the user inputs
        int arrayNums = input.nextInt();
        System.out.println("ok, tell me  the marks of " + arrayNums + " students and ill sort them and calculate the calss avg");
        //create an array as large as the number input by the user for the value "arrayNums"
        double[] nums = new double[arrayNums];
        //have the user fill the array with numbers
        for (int a = 0; a < arrayNums; a++) {
            nums[a] = input.nextDouble();
        }
        //create 2 variables that both scan the array at the same time, one ahead of the other
        for (int x = 0; x < arrayNums - 1; x++) {
            for (int z = x + 1; z < arrayNums; z++) {
                //check if the one behind is larger than the one ahead
                if (nums[x] > nums[z]) {
                    //if so then make 2 more variables that hold the values of the selected array numbers
                    double a = nums[x];
                    double b = nums[z];
                    //and swap the positions of the array numbers
                    nums[z] = a;
                    nums[x] = b;
                }

            }
        }
        //tell the user the class lowest and highest mark
        for (int y = 0; y < arrayNums; y++) {
            if (y == 0) {
                System.out.println("The lowest mark in the Class is " + nums[y]);
            }
            if (y == (arrayNums - 1)) {
                System.out.println("The Highest mark in the Class is " + nums[y]);
            }
        }
        //now to calculate the avg
        //create 2 placeholders for the total marks and the avg marks
        double markTot = 0;
        double markAvg = 0;
        //a will scan through the array again
        for (int a = 0; a < arrayNums; a++) {
            //add all the marks into this variable
            markTot = markTot + nums[a];
        }
        //calculate the avg by usig dividing the sum of marks (markTot) by the array length, or the number of students
        markAvg = markTot / arrayNums;
        //tell the user the class avg
        System.out.println("The Class Average is " + markAvg);
    }
}
