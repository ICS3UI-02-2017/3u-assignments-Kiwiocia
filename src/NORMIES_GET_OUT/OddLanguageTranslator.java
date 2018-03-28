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
public class OddLanguageTranslator {

    public static void main(String[] args) {
        //new scanner
        Scanner input = new Scanner(System.in);
        //repreat
        while (true) {
            System.out.println("Enter some word so i can translate that");
            String wordA = input.nextLine();
            //sanitize that thing
            wordA = wordA.toLowerCase();
            //check if the word starts with a vowel
            if (wordA.startsWith("a")
                    || wordA.startsWith("e")
                    || wordA.startsWith("i")
                    || wordA.startsWith("o")
                    || wordA.startsWith("u")) {
                // stick ay on the end
                String transWord = wordA + "ay";
                System.out.println(wordA + " in Pig Latin is " + transWord);
            } else {
                int length = wordA.length();
                for (int x = 0; x < length; x++) {
                    if (wordA.charAt(x) == 'a'
                            || wordA.charAt(x) == 'e'
                            || wordA.charAt(x) == 'i'
                            || wordA.charAt(x) == 'o'
                            || wordA.charAt(x) == 'u') {
                        String start = wordA.substring(0, x);
                        String end = wordA.substring(x);
                        String word = end + start + "ay";
                        System.out.println(wordA + " is " + word + " in piglatin");

                    }


                }
                break;
            }
        }
        }
    }
