/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
/**
 *
 * @author Kiwiocia
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Step one, create the city of danq
        City danq = new City();           //setup a city          
        RobotSE Doc = new RobotSE(danq, 0, 2, Direction.WEST); //Hello Doc
        Doc.setLabel("+");          //add a cross to doc for medical purposes
        new Wall (danq, 1, 1, Direction.NORTH); //We NEED to build a W A L L
        new Wall (danq, 1, 2, Direction.NORTH);
        new Wall (danq, 1, 2, Direction.EAST);
        new Wall (danq, 2, 2, Direction.EAST);
        new Wall (danq, 1, 1, Direction.WEST);
        new Wall (danq, 2, 1, Direction.WEST);
        new Wall (danq, 2, 1, Direction.SOUTH);
        new Wall (danq, 2, 2, Direction.SOUTH);
        
        Doc.move(2);     //move the doc around the city
        Doc.turnLeft();
        Doc.move(3);
        Doc.turnLeft();
        Doc.move(3);
        Doc.turnLeft();
        Doc.move(3);
        Doc.turnLeft();
        Doc.move();
        
    }
}
