/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;          //Import Packages
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bosta6892
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a city and Place a robot in it
        final City meme = new City();
        final RobotSE AB = new RobotSE(meme, 4, 0, Direction.EAST);

        //place 12 walls
        new Wall(meme, 4, 2, Direction.WEST);
        new Wall(meme, 4, 2, Direction.NORTH);
        new Wall(meme, 4, 7, Direction.EAST);
        new Wall(meme, 4, 7, Direction.NORTH);
        new Wall(meme, 3, 3, Direction.WEST);
        new Wall(meme, 3, 3, Direction.NORTH);
        new Wall(meme, 3, 6, Direction.NORTH);
        new Wall(meme, 3, 6, Direction.EAST);
        new Wall(meme, 2, 4, Direction.WEST);
        new Wall(meme, 2, 4, Direction.NORTH);
        new Wall(meme, 2, 5, Direction.EAST);
        new Wall(meme, 2, 5, Direction.NORTH);

        //place 4 things
        new Thing(meme, 4, 1);
        new Thing(meme, 3, 2);
        new Thing(meme, 2, 3);
        new Thing(meme, 1, 4);

        //Pick up 4 things while going up the "staircase"
        AB.move();
        AB.pickThing();
        AB.turnLeft();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.pickThing();
        AB.turnLeft();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.pickThing();
        AB.turnLeft();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.pickThing();
        //place the things while going down the "staircase"
        AB.move();
        AB.putThing();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.putThing();
        AB.turnLeft();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.putThing();
        AB.turnLeft();
        AB.move();
        AB.turnRight();
        AB.move();
        AB.putThing();
        AB.turnLeft();
        AB.move();
    }
}

