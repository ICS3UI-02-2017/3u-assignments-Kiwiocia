/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;
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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     City meme = new City(); //I EXIST
     RobotSE AB = new RobotSE(meme, 0, 0, Direction.EAST);
     
     new Wall (meme, 1, 1, Direction.NORTH); //C A S T L E
     new Wall (meme, 1, 1, Direction.SOUTH);
     new Wall (meme, 1, 1, Direction.EAST);
      new Wall (meme, 1, 1, Direction.WEST);
     new Wall (meme, 2, 2, Direction.WEST);
     new Wall (meme, 2, 2, Direction.NORTH);
     new Wall (meme, 2, 3, Direction.EAST);
     new Wall (meme, 2, 3, Direction.NORTH);
     new Wall (meme, 1, 4, Direction.NORTH);
     new Wall (meme, 1, 4, Direction.SOUTH);
     new Wall (meme, 1, 4, Direction.EAST);
     new Wall (meme, 1, 4, Direction.WEST);
     new Wall (meme, 3, 2, Direction.WEST);
     new Wall (meme, 3, 2, Direction.SOUTH);
     new Wall (meme, 3, 3, Direction.EAST);
     new Wall (meme, 3, 3, Direction.SOUTH);
     new Wall (meme, 4, 4, Direction.NORTH);
     new Wall (meme, 4, 4, Direction.SOUTH);
     new Wall (meme, 4, 4, Direction.EAST);
     new Wall (meme, 4, 4, Direction.WEST);
     new Wall (meme, 4, 1, Direction.SOUTH);
     new Wall (meme, 4, 1, Direction.EAST);
     new Wall (meme, 4, 1, Direction.WEST);
     new Wall (meme, 4, 1, Direction.NORTH);
        
     while(AB.frontIsClear()){
         AB.move();
         AB.turnRight();
         if(!AB.frontIsClear()){ //if the front is not clear then turn left
             AB.turnLeft();
             if(!AB.frontIsClear()){
                AB.turnLeft();
             }
         }      
    }
   }
  }

