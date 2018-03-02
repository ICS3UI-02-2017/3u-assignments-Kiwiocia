/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_Package_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import becker.robots.Thing;

/**
 *
 * @author bosta6892
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City England = new City();
        //create a robot that starts with 20 things already in backpack
        RobotSE Pupper = new RobotSE(England, 1, 1, Direction.EAST, 20);

        int pepe = 0;               //new integer called pepe
        while (pepe < 20) {         //while pepe is less then 20, loop
            Pupper.putThing();      //put a thing and move
            Pupper.move();
            if (Pupper.getAvenue() >= 6) { //if x location is greater than 6
                Pupper.turnRight();        //move down once and turn right
                Pupper.move();             //which creates a zig zag motion
                Pupper.turnRight();
                Pupper.move();
            }
            if (Pupper.getAvenue() <= 0) { //same thing as previous 
                Pupper.turnLeft();         //but for a x location that is less
                Pupper.move();             //than or equal to 0
                Pupper.turnLeft();
                Pupper.move();
            }
            pepe = pepe + 1;               //add 1 to pepe
        }
    }
}
