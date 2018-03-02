/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NORMIES_GET_OUT;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pint a line that says something
        System.out.println("The FitnessGram™ Pacer Test ");
        System.out.println("is a multistage aerobic capacity t");

        System.out.println("test that progressively gets more difficult");
        System.out.println("as it continues.");
        System.out.println("The 20 meter pacer test will begin in 30 seconds.");
        System.out.println("Line up at the start. The running speed starts slowly,");
        System.out.println("but gets faster each minute after you hear this signal.");
        System.out.println("[beep]");
        System.out.println("A single lap should be completed each time you hear this sound.");
        System.out.println("[ding] ");
        System.out.println("Remember to run in a straight line,");
        System.out.println("and run as long as possible.");
        System.out.println("The second time you fail to complete a lap before the sound,");
        System.out.println("your test is over. The test will begin on the word start.");
        System.out.println("On your mark,");
        System.out.println("get ready,");
        System.out.println("start");
        
        //to use a scanner to get an info 
        Scanner In = new Scanner(System.in);
        
        System.out.println("Enter your will to live");
        In.nextLine();
        System.out.println("then the contract is sealed");
        
        System.out.println("tell me your year of brith");
        
        int birthyear = In.nextInt();
        int age = 2018 - birthyear;
        System.out.println("you are " + age + " years in debt");
        while (age < 0){
            System.out.println("wait, WRONG, YOU ARE A L I A R");
            
        }
        
        if (age > 30){
            System.out.println("YOU ARE FAR TOO DEEP IN DEBT, PAY NOW");
            System.out.println("REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        }
                
                
    }
}
