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
public class A6Q3 {

    public static void main(String[] args) {
        //make a scanner and ask the user what 2 numbers the will input
        Scanner input = new Scanner(System.in);
        System.out.println("ok, tell me 2 numbers and i will sort them ");
        //make an array that has a length of 2 
        double[] nums = new double[2];
        //x scans the array
        for (int x = 0; x < nums.length; x++) {
            nums[x] = input.nextDouble();
            // the user fills in the array
            if (x - 1 >= 0) {
                // check if the number taht x is scanning is at position 0, if so, skip
                if (nums[x - 1] > nums[x]) {
                    //check the number previous to the currently scanned number if it is larger than the current number
                    //if so then make variables that are placeholders for the numers in the array the that specific player
                    double a = nums[x - 1];
                    double b = nums[x];
                    //swap the positions of the array numbers
                    nums[x] = a;
                    nums[x - 1] = b;

                }
            }
        }
        //tell the user the numbers
        for (int y = 0; y < nums.length; y++) {
            System.out.println(nums[y]);
        }
    }
}
