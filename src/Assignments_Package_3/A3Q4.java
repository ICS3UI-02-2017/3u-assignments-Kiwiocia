/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments_Package_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Kiwiocia
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City danq = new City();
        RobotSE Usain = new RobotSE(danq, 3, 3, Direction.SOUTH);

        new Wall(danq, 1, 1, Direction.NORTH);
        new Wall(danq, 1, 2, Direction.NORTH);
        new Wall(danq, 1, 2, Direction.EAST);
        new Wall(danq, 2, 2, Direction.EAST);
        new Wall(danq, 1, 1, Direction.WEST);
        new Wall(danq, 2, 1, Direction.WEST);
        new Wall(danq, 2, 1, Direction.SOUTH);
        new Wall(danq, 2, 2, Direction.SOUTH);
        new Wall(danq, 1, 4, Direction.NORTH);
        new Wall(danq, 1, 5, Direction.NORTH);
        new Wall(danq, 1, 5, Direction.EAST);
        new Wall(danq, 2, 5, Direction.EAST);
        new Wall(danq, 1, 4, Direction.WEST);
        new Wall(danq, 2, 4, Direction.WEST);
        new Wall(danq, 2, 4, Direction.SOUTH);
        new Wall(danq, 2, 5, Direction.SOUTH);
        new Wall(danq, 4, 1, Direction.NORTH);
        new Wall(danq, 4, 2, Direction.NORTH);
        new Wall(danq, 4, 2, Direction.EAST);
        new Wall(danq, 5, 2, Direction.EAST);
        new Wall(danq, 4, 1, Direction.WEST);
        new Wall(danq, 5, 1, Direction.WEST);
        new Wall(danq, 5, 1, Direction.SOUTH);
        new Wall(danq, 5, 2, Direction.SOUTH);
        new Wall(danq, 4, 4, Direction.NORTH);
        new Wall(danq, 4, 5, Direction.NORTH);
        new Wall(danq, 4, 5, Direction.EAST);
        new Wall(danq, 5, 5, Direction.EAST);
        new Wall(danq, 4, 4, Direction.WEST);
        new Wall(danq, 5, 4, Direction.WEST);
        new Wall(danq, 5, 4, Direction.SOUTH);
        new Wall(danq, 5, 5, Direction.SOUTH);

        //new integer called pupper
        int pupper = 0;
        //while pupper does not = 1  then go trough these motions
        while (pupper != 1) {
            Usain.move(3);
            Usain.turnLeft();
            Usain.move(3);
            Usain.turnLeft();
            Usain.move(3);
            Usain.turnLeft();
            //add 1 to pupper
            pupper = pupper + 1;
            //new integer called meme
            int meme = 0;
            //while meme is not 3 then do this
            while (meme != 3) {
                Usain.move(6);
                Usain.turnLeft();
                Usain.move(3);
                Usain.turnLeft();
                Usain.move(3);
                Usain.turnLeft();
                //add 1 to meme
                meme = meme + 1;
                if (meme == 3) {
                    Usain.move(3);
                }
            }
        }
    }
}
