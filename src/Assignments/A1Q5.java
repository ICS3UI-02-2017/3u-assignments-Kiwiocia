/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import becker.robots.City;          //COPY PASTA
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author bosta6892
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        City Tatooine = new City(); //SetupKiwiocia
        
        RobotSE Obiwan = new RobotSE(Tatooine, 0, 1, Direction.WEST); 
        RobotSE Kenboni = new RobotSE (Tatooine, 3, 3, Direction.EAST);
        Obiwan.setLabel("Obi"); //labels for obiwan and kenboni
        Kenboni.setLabel("Ken");
        
        new Wall (Tatooine, 2, 3, Direction.NORTH); //Make the walls 
        new Wall (Tatooine, 2, 3, Direction.EAST);
        new Wall (Tatooine, 2, 3, Direction.WEST);
        new Wall (Tatooine, 3, 3, Direction.EAST);
        new Wall (Tatooine, 3, 3, Direction.SOUTH);
        
        new Thing (Tatooine, 0, 0);  //place the things in the city
        new Thing (Tatooine, 1, 0);
        new Thing (Tatooine, 1, 1);
        new Thing (Tatooine, 1, 2);
        new Thing (Tatooine, 2, 2);
        
        Obiwan.move();                  //Move obiwan and kenboni in alternating motion so they finish facing each other
        Kenboni.turnAround();
        Obiwan.pickThing();
        Kenboni.move();
        Obiwan.turnLeft();
        Kenboni.turnRight();
        Kenboni.move();
        Obiwan.move();
        Kenboni.pickThing();
        Obiwan.pickThing();
        Kenboni.move();
        Obiwan.turnLeft();
        Kenboni.pickThing();
        Obiwan.move();
        Obiwan.pickThing();
        Kenboni.turnLeft();
        
    }
}
