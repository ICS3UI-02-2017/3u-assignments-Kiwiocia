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
        Dogg.setColor(Color.GREEN);
        
        new Wall (meme, 0, 1, Direction.WEST);
        //to the future Kiwiocia, Dont forget about the damm walls, and also they have to meet at the same place at the same time (at {2,1} or if you use normal math, (1,2)
    }
    
}
