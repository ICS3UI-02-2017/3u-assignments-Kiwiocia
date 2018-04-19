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
public class A6Q4 {

    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        //tell the user what do
        System.out.println("so, tell me 10 numbers my guy,");
        //array that has a length of 10
        double[] nums = new double[10];
        //variable that will fill the array slots
        for (int a = 0; a <nums.length; a ++){
            //get the user to input the number
            nums[a] = input.nextDouble();
        }
        //variables that will move in accordance to each other with one ahead of the other
        for (int x = 0; x < nums.length-1; x++)
            for(int z = x+1; z < nums.length; z++){
                //if the nubmer behind is larger of the number ahead
                if (nums[x]>nums[z]){
                    //then swap the numbers with each other 
                    double a = nums[x];
                    double b = nums[z];
                    nums[z]= a;
                    nums[x]= b;     
                }
            
        }
        //tell the user the sorted numbers
        for (int y = 0; y < nums.length; y++) {
            System.out.println(nums[y]);
        }
    }
}
