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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Spooky = new City();
        RobotSE Skeletons = new RobotSE(Spooky, 1, 1, Direction.EAST);

        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);
        new Thing(Spooky, 1, 1);

        int Scary = 0;              //create an integer that starts at 0
        while (Scary < 10) {        //while that integer is less than 10, loop
            Skeletons.pickThing();  //back and forth picking and placing things
            Skeletons.move();
            Skeletons.putThing();
            Skeletons.turnAround();
            Skeletons.move();
            Skeletons.turnAround();
            Scary = Scary + 1;      //Add 1 unit to the integer 
        }
    }
}
