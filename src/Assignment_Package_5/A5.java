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
        //create an string that will consist of vowels, this will
        int length = wordA.length();
        //x starts at 0 and is less than the number of letters in the word chosen, add once each time it loops
        for (int x = 0; x < length; x++) {
            //check to see if the first position of the word is a vowel bu check if its a part of the "vowels" string
            if (vowels.indexOf(wordA.charAt(x)) == -1) {
                //if it isnt, then add the character to "word"
                char a = wordA.charAt(x);
                word = word + a;
                //if the charcater has another charcter behind it and the character behind it is a vowell and it itself it also a vowel,
            } else if (x - 1 >= 0 && vowels.indexOf(wordA.charAt(x - 1)) >= 0 && vowels.indexOf(wordA.charAt(x)) >= 0) {
                // then add that character to "word" 
                char c = wordA.charAt(x);
                word = word + c;
                //if not then check if the selected character if a vowel
            } else if (vowels.indexOf(wordA.charAt(x)) >= 0) {
                //if it is then add "ub" and that character, to word
                char b = wordA.charAt(x);
                word = word + "ub" + b;
            }
        }
        //once the whole length of the word is covered, display the word
        System.out.println("your word is");
        System.out.println(word);
        System.out.println("in ubbi dubbi");
    }
}
