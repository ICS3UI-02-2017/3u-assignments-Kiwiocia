/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_1;
import becker.robots.City;          //COPY PASTA AYYYY
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
/**
 *
 * @author Kiwiocia
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        City england = new City(); //More copy pasta from previous assignments because i already know this and why waste time rewriting code when i already know it
        
        RobotSE Nick_C = new RobotSE(england, 3, 0, Direction.EAST); //put nick crompton in it
        Nick_C.setColor(Color.cyan); //I like cyan
        new Thing(england, 3, 1);    //I'll just call this "SetupKiwiocia" from here on
            
        new Wall (england, 3, 2, Direction.WEST);  //plenty of walls
        new Wall (england, 3, 2, Direction.NORTH);
        new Wall (england, 2, 3, Direction.WEST);
        new Wall (england, 1, 3, Direction.WEST);
        new Wall (england, 1, 3, Direction.NORTH);
        new Wall (england, 1, 3, Direction.EAST);
        new Wall (england, 2, 4, Direction.NORTH);
        new Wall (england, 2, 4, Direction.EAST);
        new Wall (england, 3, 4, Direction.EAST);
        
            Nick_C.move();
            Nick_C.pickThing(); //gotta get the thing
            Nick_C.turnLeft();
            Nick_C.move();
            Nick_C.turnRight();
            Nick_C.move();
            Nick_C.turnLeft();
            Nick_C.move(2);
            Nick_C.turnRight();
            Nick_C.move();
            Nick_C.putThing();  //gotta leave the thing
            Nick_C.move();
            Nick_C.turnRight();
            Nick_C.move();
            Nick_C.turnLeft();
            Nick_C.move();
            Nick_C.turnRight();
            Nick_C.move(2);
            Nick_C.turnLeft();
            
    }
    
}
