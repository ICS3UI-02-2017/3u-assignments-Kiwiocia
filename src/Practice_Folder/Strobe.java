/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice_Folder;

import java.util.Random;
import becker.robots.City;          //COPY PASTA IMPORTS
import becker.robots.Direction;
import becker.robots.RobotSE;
import java.awt.Color;
import becker.robots.Wall;

/**
 *
 * @author bosta6892
 */
public class Strobe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City meme = new City(); //I EXIST
        final RobotSE AB = new RobotSE(meme, 2, 2, Direction.EAST);
        final Random A = new Random();

        new Wall(meme, 1, 2, Direction.SOUTH);
        new Wall(meme, 2, 5, Direction.WEST);
        new Wall(meme, 5, 4, Direction.NORTH);
        new Wall(meme, 4, 1, Direction.EAST);

        new Thread() {
            public void run() {
                while (true) {
                    int x = A.nextInt(10);

                    if (x == 1) {
                        AB.setColor(Color.CYAN);
                    }
                    if (x == 2) {
                        AB.setColor(Color.BLUE);
                    }
                    if (x == 3) {
                        AB.setColor(Color.PINK);
                    }
                    if (x == 4) {
                        AB.setColor(Color.GREEN);
                    }
                    if (x == 5) {
                        AB.setColor(Color.MAGENTA);
                    }
                    if (x == 6) {
                        AB.setColor(Color.ORANGE);
                    }
                    if (x == 7) {
                        AB.setColor(Color.RED);
                    }
                    if (x == 8) {
                        AB.setColor(Color.WHITE);
                    }
                    if (x == 9) {
                        AB.setColor(Color.YELLOW);
                    }
                    if (x == 0) {
                        AB.setColor(Color.BLACK);
                    }


                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();



        while (AB.frontIsClear()) {
            AB.move();
            while (!AB.frontIsClear()) {
                AB.turnRight();
            }
        }

    }
}
