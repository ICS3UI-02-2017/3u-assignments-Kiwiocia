/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NORMIES_GET_OUT;

import becker.robots.City;          //COPY PASTA
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
import java.util.Random;
/**
 *
 * @author kiwiocia
 */
public class MAHBOI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random colour = new Random();
        for (int x = 1; x <=5; ++x){
            int randomInt = colour.nextInt(10);
        }
        
        // TODO code application logic here        
        City meme = new City(); //SetupKiwiocia
         RobotSE Andrew = new RobotSE(meme, 1, 1, Direction.EAST); 
         //try to set up a way to get colour to change with a random number generator
         new Wall(meme,1 , 5, Direction.WEST);
         new Wall(meme, 0, 1, Direction.SOUTH);
         new Wall(meme, 5, 4 ,Direction.NORTH);
         new Wall(meme, 4, 0 ,Direction.EAST);

         while(Andrew.frontIsClear()){
            //if mah boi me, says yeah the front is clear
            Andrew.move();
            
         while(!Andrew.frontIsClear()){
            //when front is not clear
            Andrew.turnRight();
              }       
         }
    }
}
