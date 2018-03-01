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
import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A2QCHALLENGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City meme = new City(); //I EXIST
        RobotSE AB = new RobotSE(meme, 0, 3, Direction.SOUTH);
        RobotSE MB = new RobotSE(meme, 0, 3, Direction.SOUTH);
        Scanner In = new Scanner(System.in);
        //ok so step on for this is to make a lot of walls to make the 
        //"sidewalk and driveway"
        //i need fourty fokin five.
        //Why
        //OH AND DONT FORGET THAT I ALSO NEED SIXTEEN DAMM "THINGS" 
        //THANKS
        //so what i can do is recycle the code i used for the wall follower
        //Cross that last comment out like hard,
        //what i need to use is Threads
        //This will simplifly everything

        new Wall(meme, 0, 3, Direction.WEST);
        new Wall(meme, 0, 3, Direction.EAST);
        new Wall(meme, 1, 3, Direction.WEST);
        new Wall(meme, 2, 3, Direction.WEST);
        new Wall(meme, 3, 3, Direction.WEST);
        new Wall(meme, 4, 3, Direction.WEST);
        new Wall(meme, 5, 3, Direction.WEST);
        new Wall(meme, 6, 3, Direction.WEST);
        new Wall(meme, 7, 3, Direction.WEST);
        new Wall(meme, 8, 3, Direction.WEST);
        new Wall(meme, 9, 3, Direction.WEST);
        new Wall(meme, 10, 3, Direction.WEST);//10
        new Wall(meme, 1, 7, Direction.EAST);
        new Wall(meme, 4, 3, Direction.EAST);
        new Wall(meme, 6, 3, Direction.EAST);
        new Wall(meme, 7, 3, Direction.EAST);
        new Wall(meme, 10, 3, Direction.EAST);
        new Wall(meme, 10, 3, Direction.SOUTH);//16
        new Wall(meme, 1, 4, Direction.NORTH);
        new Wall(meme, 3, 4, Direction.SOUTH);
        new Wall(meme, 5, 4, Direction.NORTH);
        new Wall(meme, 5, 4, Direction.SOUTH);//20
        new Wall(meme, 8, 4, Direction.NORTH);
        new Wall(meme, 9, 4, Direction.SOUTH);//22
        new Wall(meme, 1, 5, Direction.NORTH);
        new Wall(meme, 3, 5, Direction.SOUTH);
        new Wall(meme, 5, 5, Direction.NORTH);
        new Wall(meme, 5, 5, Direction.SOUTH);
        new Wall(meme, 8, 5, Direction.NORTH);
        new Wall(meme, 9, 5, Direction.SOUTH);//28
        new Wall(meme, 1, 6, Direction.NORTH);
        new Wall(meme, 3, 6, Direction.SOUTH);//30
        new Wall(meme, 5, 6, Direction.NORTH);
        new Wall(meme, 5, 6, Direction.SOUTH);
        new Wall(meme, 8, 6, Direction.NORTH);
        new Wall(meme, 9, 6, Direction.SOUTH);//34
        new Wall(meme, 1, 7, Direction.NORTH);
        new Wall(meme, 2, 7, Direction.EAST);
        new Wall(meme, 3, 7, Direction.EAST);
        new Wall(meme, 3, 7, Direction.SOUTH);
        new Wall(meme, 8, 7, Direction.EAST);
        new Wall(meme, 8, 7, Direction.NORTH);//40
        new Wall(meme, 9, 7, Direction.SOUTH);
        new Wall(meme, 9, 7, Direction.EAST);
        new Wall(meme, 5, 6, Direction.EAST);

        new Thing(meme, 2, 3);
        new Thing(meme, 2, 4);
        new Thing(meme, 2, 5);
        new Thing(meme, 2, 6);
        new Thing(meme, 3, 3);
        new Thing(meme, 3, 5);
        new Thing(meme, 3, 7);
        new Thing(meme, 5, 3);
        new Thing(meme, 5, 4);
        new Thing(meme, 5, 5);
        new Thing(meme, 8, 3);
        new Thing(meme, 8, 4);
        new Thing(meme, 8, 7);
        new Thing(meme, 9, 4);
        new Thing(meme, 9, 5);
        new Thing(meme, 9, 7);

        while (true) {
            while (AB.getAvenue() == 3) {
                while (AB.getDirection() != Direction.SOUTH) {
                    AB.turnRight();

                }
                while (AB.countThingsInBackpack() > 0) {
                    AB.putAllThings();
                }
                if (AB.frontIsClear()) {
                    AB.move();
                    AB.turnLeft();
                    if (!AB.frontIsClear()) {
                        AB.turnRight();

                    } else {
                        AB.move();
                    }
                    while (AB.canPickThing()) {
                        AB.pickThing();

                    }
                }
                while (AB.getStreet() == 10) {
                    while (MB.frontIsClear()) {
                        MB.move();
                        while (MB.canPickThing()) {
                            MB.pickThing();
                        }
                        while (!MB.frontIsClear()) {
                            MB.putAllThings();
                            AB.putAllThings();
                            int MBB = (MB.countThingsInBackpack());
                            int ABB = (AB.countThingsInBackpack());
                            System.out.println("MB " +MBB+ " AB " + ABB);
                            In.nextLine();
                        }
                    }
                }
            }
            while (AB.getAvenue() != 3) {
                if (AB.frontIsClear()) {
                    AB.move();
                    while (AB.canPickThing()) {
                        AB.pickThing();
                    }

                }
                if (!AB.frontIsClear()) {
                    AB.turnRight();
                    if (AB.frontIsClear()) {
                        AB.move();
                        while (AB.canPickThing()) {
                            AB.pickThing();
                        }
                        AB.turnRight();
                    }
                    while (!AB.frontIsClear() && AB.getDirection() == Direction.SOUTH) {
                        AB.turnRight();
                        while (AB.frontIsClear()) {
                            AB.move();
                        }
                    }
                }
            }
        }
    }
}
