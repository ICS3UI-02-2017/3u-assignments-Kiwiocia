/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_4;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A4Q7 {

    public static void main(String[] args) {
        //create a scanner
        Scanner In = new Scanner(System.in);
        //player integer keeps the value of the players position
        int player = 1;
        //make an introduction
        System.out.println("IT'S SNKAES AND LADDERS TIME YAAAAAAAY");
        System.out.println("Wait, you don't have a board do you");
        System.out.println("i gotcha bruv");
        System.out.println("dont worry about the visuals ill tell you where you are");
        System.out.println("ok, roll");
        //while the player value is less than 100 then the game will continue
        while (player < 100) {
            //create a value for a dice roll
            String roll1 = In.nextLine();
            //create an intger out of the string
            int roll = Integer.parseInt(roll1);
            //ensure taht the roll is equal to those possible by a dice
            if (roll <= 6 && roll >= 1) {
                player = player + roll;
            } else {
                //make a sarcastic comment when 
                System.out.println("yeah no");
                System.out.println("try again");
            }
            //the sneaky solid snakes 
            while (player == 99) {
                player = player - 22;
                System.out.println("wrecked by a snake");
            }
            while (player == 90) {
                player = player - 32;
                System.out.println("wrecked by a snake");
            }
            while (player == 54) {
                player = player - 35;
                System.out.println("wrecked by a snake");
            }
            // the ladders
            while (player == 40) {
                player = player + 24;
                System.out.println("eyyy that's a ladder");
            }
            while (player == 9) {
                player = player + 25;
                System.out.println("eyyy that's a ladder");
            }
            while (player == 67) {
                player = player + 19;
                System.out.println("eyyy that's a ladder");
            }
            //create a way so that th player cannot go past 100
            if (player > 100) {
                player = player - roll;
                System.out.println("you need to land on 100 no more or less");
            }
            //tell the player what position they are 
            System.out.println("you're at " + player);
            //how the game is won
            if (player == 100) {
                System.out.println("YOU WIN!");
            }
        }
    }
}