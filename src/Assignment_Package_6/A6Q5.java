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
public class A6Q5 {

    public static void main(String[] args) {
        //i accidentally made assignment 5 when i made assignment 4, so i need to change all the previous ones to what was asked
        //make a scanner 
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers");
        //create a value that will store what the user inputs
        int arrayNums = input.nextInt();
        System.out.println("ok, tell me " + arrayNums + " numbers and i will sort them number we are working with");
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
        //
        for (int y = 0; y < arrayNums; y++) {
            System.out.println(nums[y]);
        }
    }
}
