/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_6;

/**
 *
 * @author Kiwiocia
 */
public class A6Q7 {

    public static void main(String[] args) {
        //create an array with a length of 999
        double[] array = new double[999];
        //fill the array with all the numbers from 2 to 1000
        for (int x = 0; x < 999; x++) {
            array[x] = (x + 2);
        }
        //the variable a scans through the array
        for (int a = 0; a < 999; a++) {
            //if the array at a is not 0
            if (array[a] != 0) {
                //create another variable that scans ahead of A 
                for (int z = a+1; z < 999; z++) {
                    //if the array number at z can be divided by array number at a and not have a remainder
                    if (array[z] % array[a] == 0) {
                        //set the array number at z to 0
                        array[z] = array[z] * 0;
                    }
                }
            }
        }
        //variable y scans the array
        for (int y = 0; y < 999; y++) {
            //if array at y does not = 0 
            if (array[y] != 0) {
                //tell the user that number
                System.out.println(array[y]);
            }
        }


    }
}
