/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City meme = new City(); //SetupKiwiocia
        
        RobotSE Snoop = new RobotSE(meme, 0, 0, Direction.SOUTH); 
        RobotSE Dogg = new RobotSE (meme, 0, 1, Direction.SOUTH);
        Snoop.setColor(Color.GREEN);
        Dogg.setColor(Color.GREEN); //(2, 1);
        
        new Wall (meme, 0, 1, Direction.WEST);
        new Wall (meme, 1, 1, Direction.WEST);
        new Wall (meme, 1, 1, Direction.SOUTH);
        
        Dogg.move();
        Snoop.move();
        Dogg.turnLeft();
        Dogg.move();
        Dogg.turnRight();
        Snoop.move();
        Dogg.move();
        Snoop.turnLeft();
        Dogg.turnRight();
        Dogg.move();
        Snoop.move();
        
    }
    
}
