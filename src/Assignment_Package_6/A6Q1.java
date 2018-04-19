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
public class A6Q1 {

    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Student marks and stuff, tell me, how many students are in this class");
        //make an array that stores the student marks
        double[] classavg = new double[3];
        //integer x will "scan" through the array
        for (int x = 0; x < classavg.length; x++) {
            //ask the used what a student's mark is, the # has to be +1 because arrays start at 0 and studen 0 makes no sense
            System.out.println("what is student " + (x + 1) + "'s mark ");
            classavg[x] = input.nextDouble();
        }
        //create a double that is empty
        double sum = 0;
        for (int a = 0; a < classavg.length; a++) {
            //add all the marks and store them in the sum double
            double A = classavg[a];
            sum = sum + A;
        }
        //divide that sum by the number of students
        sum = sum / classavg.length;
        //tell the used the sum value
        System.out.println("The class avg, is");
        System.out.println(sum);
    }
}
