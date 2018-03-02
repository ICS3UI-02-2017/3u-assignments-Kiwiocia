/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NORMIES_GET_OUT;

import becker.robots.City;          //COPY PASTA IMPORTS
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author bosta6892
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City meme = new City(); //I EXIST
        RobotSE AB = new RobotSE(meme, 0, 0, Direction.EAST);

        // counted while loop
        int reee = 5;
        while (reee > 0) {
            AB.move();
            reee = reee - 1;
        }
        AB.turnAround();

        reee = 0;
        while (reee < 5) {
            AB.move();
            reee = reee + 1;
        }
        for (int count = 0; count < 5; count++) {
        }
    }
}
