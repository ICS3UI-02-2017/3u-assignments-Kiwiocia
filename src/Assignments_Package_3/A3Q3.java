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
        RobotSE Pupper = new RobotSE(England, 1, 1, Direction.EAST);
    }
}
