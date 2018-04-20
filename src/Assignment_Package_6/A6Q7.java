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

        double[] array = new double[999];
        for (int x = 0; x < 999; x++) {
            array[x] = (x + 2);
        }

        for (int a = 0; a < 999; a++) {
            if (array[a] == 0) {
            } else {
                for (int z = 1; z < 999; z++) {
                    if (array[z] % array[a] == 0) {
                        array[z] = array[z] * 0;
                    }
                }
            }
        }
        for (int y = 0; y < 999; y++) {
            if (array[y] != 0) {
                System.out.println(array[y]);
            }
        }


    }
}
