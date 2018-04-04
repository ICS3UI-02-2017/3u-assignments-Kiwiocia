/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Package_5;

import java.util.Scanner;

/**
 *
 * @author Kiwiocia
 */
public class A5 {

    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Ubbi Dubbi translator my man");
        //create a string that consists of the next line the user eneters
        String wordA = input.nextLine();
        //make the word a lower case word
        wordA = wordA.toLowerCase();
        //create a string called word 
        String word = "";
        //just trust me this will work
        //create a string for all important vowels "y" can leave.
        String vowels = "aeiou";
        //create an integer for the word that was entered
        int length = wordA.length();

        for (int x = 0; x < length; x++) {
            if (vowels.indexOf(wordA.charAt(x)) == -1) {
                char a = wordA.charAt(x);
                word = word + a;
            } else if (x - 1 >= 0 && vowels.indexOf(wordA.charAt(x - 1)) >= 0 && vowels.indexOf(wordA.charAt(x)) >= 0) {
                char c = wordA.charAt(x);
                word = word + c;
            } else if (vowels.indexOf(wordA.charAt(x)) >= 0) {
                char b = wordA.charAt(x);
                word = word + "ub" + b;
            }
        }
        System.out.println("your word is");
        System.out.println(word);
        System.out.println("in ubbi dubbi");
    }
}
