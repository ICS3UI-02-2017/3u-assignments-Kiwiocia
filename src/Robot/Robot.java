/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the ROBOTs
 * @author bosta6892 (Kiwiocia)
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City england = new City();
       
        // add robot to the city of england
        
        RobotSE marx = new RobotSE(england, 2, 3, Direction.SOUTH);
        
        new Thing (england, 2, 3);
        marx.setColor(Color.cyan);
    
        //Moves the robot 2 units forward
        marx.move(2);
        // lemme see if i can use turn or something
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        

        marx.pickThing();
      
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.putThing();
        
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
        marx.turnLeft();
        marx.move(2);
    }
}
