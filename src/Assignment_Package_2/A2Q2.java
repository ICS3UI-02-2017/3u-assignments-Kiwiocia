/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_2;

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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     City meme = new City(); //I EXIST
     RobotSE AB = new RobotSE(meme, 2, 2, Direction.EAST);
     
     new Wall (meme, 2, 2, Direction.SOUTH); //it's wall time
     new Wall (meme, 2, 3, Direction.SOUTH);
     new Wall (meme, 2, 4, Direction.SOUTH);
     new Wall (meme, 2, 5, Direction.SOUTH);
     new Wall (meme, 2, 6, Direction.SOUTH);
     new Wall (meme, 2, 7, Direction.SOUTH);
     new Wall (meme, 2, 8, Direction.SOUTH);
     new Wall (meme, 2, 9, Direction.SOUTH);
     new Wall (meme, 2, 10, Direction.SOUTH);
     new Wall (meme, 2, 11, Direction.SOUTH);
     new Wall (meme, 2, 2, Direction.EAST);
     new Wall (meme, 2, 5, Direction.EAST);
     new Wall (meme, 2, 6, Direction.EAST);
     new Wall (meme, 2, 8, Direction.EAST);
     new Wall (meme, 2, 10, Direction.EAST);
     new Thing(meme, 2, 12);
     
     while(!AB.canPickThing()){ //check to see if there is a not thing that you can pick up
         if(AB.frontIsClear()){ //if there is not a thing to pick up then you check if the front is clear
             AB.move();         //is so then move
         }
             if(!AB.frontIsClear()){ //if the front is not clear then stop turn and move around it
              AB.turnLeft();
              AB.move();
              AB.turnRight();
              AB.move();
              AB.turnRight();
              AB.move();
              AB.turnLeft();
         }
    } //REPEAT
  }
}   
