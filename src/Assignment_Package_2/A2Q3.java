/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_2;

import becker.robots.City;          //COPY PASTA IMPORTS
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author kiwiocia
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City meme = new City(); //I EXIST
        RobotSE AB = new RobotSE(meme, -2, 3, Direction.SOUTH);

        if (AB.getStreet() == 0) {
        } else {
            while (AB.getStreet() > 0) {
                while (AB.getDirection() != Direction.NORTH) {
                    AB.turnLeft();
                }
                AB.move();
            }
            while (AB.getStreet() < 0) {
                while (AB.getDirection() != Direction.SOUTH) {
                    AB.turnLeft();
                }
                AB.move();
            }
        }


        if (AB.getAvenue() == 0) {
        } else {
            while (AB.getAvenue() > 0) {
                while (AB.getDirection() != Direction.WEST) {
                    AB.turnLeft();
                }
                AB.move();
            }
            while (AB.getAvenue() < 0) {
                while (AB.getDirection() != Direction.EAST) {
                    AB.turnLeft();
                }
                AB.move();
            }
        }
    }
}
