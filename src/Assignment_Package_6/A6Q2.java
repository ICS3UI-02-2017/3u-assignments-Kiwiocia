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
public class A6Q2 {
    
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        //get the user to input how many peoplea re taking the "survey"
        System.out.println("Ok first off, how many people are taking the avg height survey");
        //and store that number in an integer call numP
        int numP = input.nextInt();
        System.out.println("Right so we have " + numP + " people here, cool");
        System.out.println("Just FYI everything here is done in centimeters because the imperial system sucks");
        //new array taht stores the hights and is as long as the number the user stated
        double[] peopleH = new double[numP];
        //x will "scan' through the array
        for (int x = 0; x < numP; x++) {
            System.out.println("Ok person number " + (x + 1) + ", how tall are you? again, in centimeters");
            //store the vaules in the array according what the x value is
            peopleH[x] = input.nextDouble();
        }
        //create 2 variables that will store the total height and average height
        double totH = 0;
        double avgA = 0;
        //varaible a will "scan" through the array and make the values add up in the variable avgH
        for (int a = 0; a < numP; a++) {
            double z = peopleH[a];
            totH = totH + z;
            System.out.println(" so the total height is " + totH + " centimeters");
        }
        //give the variable avgA values that will be the total height divided by the number of people
        avgA = totH / numP;
        System.out.println(" and the average hight is " + avgA);
        //add a little extra to make this better, this will tell how many people are above avg height, below avg height, and equal to the avg height
        for (int y = 0; y < numP; y++) {
            //the value y will scan the array
            //the variable pplH is a placeholder for what the person's height is compated to the avg
            double pplH = 0;
            double z = peopleH[y];
            //find the difference between the avg height
            pplH = z - avgA;
            // tell the "person" what the person height is compared to the avg 
            if (pplH < 0.0) {
                System.out.println("Well, person " + (y + 1) + ", you are under the average high for this survey");
            }
            if (pplH > 0.0) {
                System.out.println("Well, person " + (y + 1) + ", you are above the average high for this survey");

            }
            if (pplH == 0.0) {
                System.out.println("WeLp, person " + (y + 1) + " you seem to be at the exact avg height for this survey");
            }

        }

    }
}
