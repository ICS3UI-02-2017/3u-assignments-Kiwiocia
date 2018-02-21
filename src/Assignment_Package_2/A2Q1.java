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
 * @author kiwiocia
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City meme = new City();
        RobotSE AB = new RobotSE(meme, 1, 1, Direction.EAST);

        new Thing(meme, 1, 2);
        new Thing(meme, 1, 3);
        new Thing(meme, 1, 4);
        new Thing(meme, 1, 5);
        new Thing(meme, 1, 6);
        new Thing(meme, 1, 7);
        new Thing(meme, 1, 8);
        new Thing(meme, 1, 9);
        new Thing(meme, 1, 10);
        new Thing(meme, 1, 11);


        while (AB.countThingsInBackpack() < 7) { //check to see if there are less than 7 thing in the backpack
            AB.move();     //if there are less than 7 then move and pick a thing
            AB.pickThing();
        }
        if (AB.countThingsInBackpack() >= 7) {  //check again to see if there are less than 7 things in the backpack
            AB.move(4); //if not then move, ignoring the remaining things
        }
    }
}
