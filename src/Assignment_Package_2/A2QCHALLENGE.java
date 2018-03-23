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
        //...
        //i need fourty five.
        //Why
        //OH AND DONT FORGET THAT I ALSO NEED SIXTEEN DAMM "THINGS" 
        //THANKS
        //so what i can do is recycle the code i used for the wall follower
        //Cross that last comment out like hard,
        //what i need to use is Threads
        //This will simplifly everything
        
        //screw that noise threads are not easy but i got it, and it was horrible

        new Wall(meme, 0, 3, Direction.WEST);   //make the course
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
        new Wall(meme, 10, 3, Direction.WEST);
        new Wall(meme, 1, 7, Direction.EAST);
        new Wall(meme, 4, 3, Direction.EAST);
        new Wall(meme, 6, 3, Direction.EAST);
        new Wall(meme, 7, 3, Direction.EAST);
        new Wall(meme, 10, 3, Direction.EAST);
        new Wall(meme, 10, 3, Direction.SOUTH);
        new Wall(meme, 1, 4, Direction.NORTH);
        new Wall(meme, 3, 4, Direction.SOUTH);
        new Wall(meme, 5, 4, Direction.NORTH);
        new Wall(meme, 5, 4, Direction.SOUTH);
        new Wall(meme, 8, 4, Direction.NORTH);
        new Wall(meme, 9, 4, Direction.SOUTH);
        new Wall(meme, 1, 5, Direction.NORTH);
        new Wall(meme, 3, 5, Direction.SOUTH);
        new Wall(meme, 5, 5, Direction.NORTH);
        new Wall(meme, 5, 5, Direction.SOUTH);
        new Wall(meme, 8, 5, Direction.NORTH);
        new Wall(meme, 9, 5, Direction.SOUTH);
        new Wall(meme, 1, 6, Direction.NORTH);
        new Wall(meme, 3, 6, Direction.SOUTH);
        new Wall(meme, 5, 6, Direction.NORTH);
        new Wall(meme, 5, 6, Direction.SOUTH);
        new Wall(meme, 8, 6, Direction.NORTH);
        new Wall(meme, 9, 6, Direction.SOUTH);
        new Wall(meme, 1, 7, Direction.NORTH);
        new Wall(meme, 2, 7, Direction.EAST);
        new Wall(meme, 3, 7, Direction.EAST);
        new Wall(meme, 3, 7, Direction.SOUTH);
        new Wall(meme, 8, 7, Direction.EAST);
        new Wall(meme, 8, 7, Direction.NORTH);
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

        //This one's a doozy, hold on
        //loop infinalty
        while (true) {
            //ensure that the robot is facing south while on avenue
            while (AB.getAvenue() == 3) {
                while (AB.getDirection() != Direction.SOUTH) {
                    AB.turnRight();
                }
                //If the robot is holding a thing, place it
                while (AB.countThingsInBackpack() > 0) {
                    AB.putAllThings();
                }
                //move and turn left if front is clear
                if (AB.frontIsClear()) {
                    AB.move();
                    AB.turnLeft();
                    //check again if front is clear
                    if (!AB.frontIsClear()) {
                        AB.turnRight();
                        //this allows the robot to find openings in the wall to it's left
                    } else {
                        AB.move();
                    }
                    //whenever the robot moves it checks to see if it can picksomething up
                    while (AB.canPickThing()) {
                        //and if so it will
                        AB.pickThing();
                    }
                }
                //once the roomba bot AB finishes it's course at street 10
                while (AB.getStreet() == 10) {
                    //then the roomba bot MB will move when front is clear
                    while (MB.frontIsClear()) {
                        MB.move();
                        //whenever MB can pick something it will
                        while (MB.canPickThing()) {
                            MB.pickThing();
                        }
                        //once the roomba finishes it's course 
                        while (!MB.frontIsClear()) {
                            //both robots AB and MB place all their things
                            MB.putAllThings();
                            AB.putAllThings();
                            //this will show in console how many things are in
                            //each of the robot's backpack
                            int MBB = (MB.countThingsInBackpack());
                            int ABB = (AB.countThingsInBackpack());
                            System.out.println("MB " + MBB + " AB " + ABB);
                            In.nextLine();
                        }
                    }
                }
            }
            //while AB is not in avenue 3 then being this loop
            while (AB.getAvenue() != 3) {
                //when front is clear move
                if (AB.frontIsClear()) {
                    AB.move();
                    while (AB.canPickThing()) {
                        AB.pickThing();
                    }

                }
                //this causes a roomba effect, the robot will keep moving until
                //it reaches a wall and then moves down to the next street
                //if the room is 3 streets wide then the robot will still work
                if (!AB.frontIsClear()) {
                    AB.turnRight();
                    if (AB.frontIsClear()) {
                        AB.move();
                        while (AB.canPickThing()) {
                            AB.pickThing();
                        }
                        AB.turnRight();
                    }
                    //while the front is not clear and you face south turn right
                    while (!AB.frontIsClear() && AB.getDirection() == Direction.SOUTH) {
                        //this prevents the robot from getting stuck at (3,7)
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
