package Assignment_Package_1;

import becker.robots.City;          //import all the shi- ... stuff ... i need
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;


/**
 *
 * @author Kiwiocia
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City england = new City(); //create the city of england
        
        RobotSE Nick_C = new RobotSE(england, 1, 2, Direction.SOUTH); //put nick crompton in it
        Nick_C.setColor(Color.cyan); //I like cyan
        new Thing(england, 2, 2);    //create a thing
            
            new Wall (england, 1, 2, Direction.NORTH); //set some walls
            new Wall (england, 1, 2, Direction.SOUTH); 
            new Wall (england, 1, 2, Direction.EAST); 
            new Wall (england, 1, 1, Direction.NORTH);
            new Wall (england, 1, 1, Direction.WEST); 
            new Wall (england, 2, 1, Direction.WEST); 
            new Wall (england, 2, 1, Direction.SOUTH); 
            
            Nick_C.turnRight();  //move nick around
            Nick_C.move();
            Nick_C.turnLeft();
            Nick_C.move();
            Nick_C.turnLeft();
            Nick_C.move();
            Nick_C.pickThing();     //Pick up the thing
            Nick_C.turnAround();
            Nick_C.move();
            Nick_C.turnRight();
            Nick_C.move();
            Nick_C.turnRight();
            Nick_C.move();
            Nick_C.turnRight();
        }
    
}
