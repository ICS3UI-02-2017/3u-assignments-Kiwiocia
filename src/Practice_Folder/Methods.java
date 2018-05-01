/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Folder;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class Methods {

    //calculates the addition of root of quad formula
    public static double[] posQuadFormula(double a, double b, double c) {
        double[] roots = new double[2];
        double discrim = (b * b) - (4 * a * c);
        roots[1] = (-b + Math.sqrt(discrim)) / (2 * a);
        roots[0] = (-b - Math.sqrt(discrim)) / (2 * a);
        return roots;

    }

    public static void main(String[] args) {
        //get the ey bause method
        
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] posRoot = posQuadFormula(a, b, c);
        System.out.println(posRoot[1]);
        System.out.println(posRoot[0]);
    }
}
