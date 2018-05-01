/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Folder;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the ROBOTs
 *
 * @author Kiwiocia
 */
public class Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City england = new City();

        // add robot to the city of england

        RobotSE marx = new RobotSE(england, 2, 3, Direction.SOUTH);

        new Thing(england, 2, 3); //create a new thing in england
        marx.setColor(Color.cyan); //change the colour of Marx to cyan
        new Wall(england, 4, 4, Direction.SOUTH);

        marx.move(2);       //Moves the robot 2 units forward
        marx.turnLeft();    //Karl Turns to his left
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

        new Thread() {
            public void run() {
                while (true) {
                }

            }
        }.start();
    }
}
