/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_Package_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author bosta6892
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City Doggo = new City();           //city         
        RobotSE Doc = new RobotSE(Doggo, 0, 2, Direction.WEST);
        Doc.setLabel("+");
        new Wall(Doggo, 1, 1, Direction.NORTH); //build a square
        new Wall(Doggo, 1, 2, Direction.NORTH);
        new Wall(Doggo, 1, 2, Direction.EAST);
        new Wall(Doggo, 2, 2, Direction.EAST);
        new Wall(Doggo, 1, 1, Direction.WEST);
        new Wall(Doggo, 2, 1, Direction.WEST);
        new Wall(Doggo, 2, 1, Direction.SOUTH);
        new Wall(Doggo, 2, 2, Direction.SOUTH);

        int ouo = 0;
        while (ouo < 2) {
            Doc.move(2);     //i just copy pasted the code from assignemtn 1
            Doc.turnLeft();
            Doc.move(3);
            Doc.turnLeft();
            Doc.move(3);
            Doc.turnLeft();
            Doc.move(3);
            Doc.turnLeft();
            Doc.move();
            ouo = ouo + 1;
        }
    }
}
