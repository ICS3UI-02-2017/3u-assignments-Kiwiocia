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
public class A2QCHALLENGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     City meme = new City(); //I EXIST
     RobotSE AB = new RobotSE(meme, 1, 3, Direction.SOUTH);
     //ok so step on for this is to make a lot of walls to make the "sidewalk and driveway"
     //i need fourty fokin five.
     //Why
     //OH AND DONT FORGET THAT I ALSO NEED SIXTEEN DAMM "THINGS" 
     //THANKS
     
     new Wall (meme, 1, 3, Direction.WEST); 
     new Wall (meme, 2, 3, Direction.WEST);
     new Wall (meme, 3, 3, Direction.WEST);
     new Wall (meme, 4, 3, Direction.WEST);
     new Wall (meme, 5, 3, Direction.WEST);
     new Wall (meme, 6, 3, Direction.WEST);
     new Wall (meme, 7, 3, Direction.WEST);
     new Wall (meme, 8, 3, Direction.WEST);
     new Wall (meme, 9, 3, Direction.WEST);
     new Wall (meme, 10, 3, Direction.WEST);//10
     new Wall (meme, 1, 3, Direction.EAST); 
     new Wall (meme, 4, 3, Direction.EAST);
     new Wall (meme, 6, 3, Direction.EAST);
     new Wall (meme, 7, 3, Direction.EAST);
     new Wall (meme, 10, 3, Direction.EAST);
     new Wall (meme, 10, 3, Direction.SOUTH);//16
     new Wall (meme, 2, 4, Direction.NORTH);
     new Wall (meme, 3, 4, Direction.SOUTH);
     new Wall (meme, 5, 4, Direction.NORTH);
     new Wall (meme, 5, 4, Direction.SOUTH);//20
     new Wall (meme, 8, 4, Direction.NORTH);
     new Wall (meme, 9, 4, Direction.SOUTH);//22
     new Wall (meme, 2, 5, Direction.NORTH);
     new Wall (meme, 3, 5, Direction.SOUTH);
     new Wall (meme, 5, 5, Direction.NORTH);
     new Wall (meme, 5, 5, Direction.SOUTH);
     new Wall (meme, 8, 5, Direction.NORTH);
     new Wall (meme, 9, 5, Direction.SOUTH);//28
     new Wall (meme, 2, 6, Direction.NORTH);
     new Wall (meme, 3, 6, Direction.SOUTH);//30
     new Wall (meme, 5, 6, Direction.NORTH);
     new Wall (meme, 5, 6, Direction.SOUTH);
     new Wall (meme, 8, 6, Direction.NORTH);
     new Wall (meme, 9, 6, Direction.SOUTH);//34
     new Wall (meme, 2, 7, Direction.NORTH);
     new Wall (meme, 2, 7, Direction.EAST);
     new Wall (meme, 3, 7, Direction.EAST);
     new Wall (meme, 3, 7, Direction.SOUTH);
     new Wall (meme, 8, 7, Direction.EAST);
     new Wall (meme, 8, 7, Direction.NORTH);//40
     new Wall (meme, 9, 7, Direction.SOUTH);
     new Wall (meme, 9, 7, Direction.EAST);
     new Wall (meme, 4, 8, Direction.WEST);
     new Wall (meme, 4, 8, Direction.NORTH);
     new Wall (meme, 4, 1, Direction.NORTH); //45...
     
     
    }
}
