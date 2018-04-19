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
        Scanner input = new Scanner(System.in);
        System.out.println("so, tell me 10 numbers my guy,");
        double[] nums = new double[10];
        for (int a = 0; a <nums.length; a ++){
            nums[a] = input.nextDouble();
        }
        for (int x = 0; x < nums.length-1; x++)
            for(int z = x+1; z < nums.length; z++){
                if (nums[x]>nums[z]){
                    double a = nums[x];
                    double b = nums[z];
                    nums[z]= a;
                    nums[x]= b;     
                }
            
        }

        for (int y = 0; y < nums.length; y++) {
            System.out.println(nums[y]);
        }
    }
}
