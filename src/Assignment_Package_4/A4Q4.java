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
public class A4Q4 {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        System.out.println("so you wanna set up a party huh?");
        String party = In.nextLine();
        if (party.contains("yes") || party.contains("sure")) {
            System.out.println("cool, we need to get costs down");
            System.out.println("so we need a food, a dj, rental for the hall");
            System.out.println("decorations, staff and other random cr-");
            System.out.println("...");
            System.out.println("stuff");
            System.out.println("so, how much will the food cost?");
            String food1 = In.nextLine();
            int food = Integer.parseInt(food1);
            System.out.println("mmhmm, and the DJ?");
            String music1 = In.nextLine();
            int music = Integer.parseInt(music1);
            System.out.println("and the rent for the hall?");
            String rent1 = In.nextLine();
            int rent = Integer.parseInt(rent1);
            System.out.println("decorations?");
            System.out.println("sidenote, dont spend too much for these");
            System.out.println("they'll either get stolen or broken");
            String deco1 = In.nextLine();
            int deco = Integer.parseInt(deco1);
            System.out.println("we need security for the dj by the by,");
            System.out.println("the dj is being a knob and doesnt want to pay");
            System.out.println("soooooo, you have to pay for that");
            String staff1 = In.nextLine();
            int staff = Integer.parseInt(staff1);
            System.out.println("cool, cool, and last thing, im going to cosco");
            System.out.println("and im grabbing some random stuff we'll need");
            System.out.println("since i am a knob aswell, you're paying");
            String misc1 = In.nextLine();
            int misc = Integer.parseInt(misc1);
            System.out.println("oh and also, how much will tickets be");
            String ticket1 = In.nextLine();
            int ticket = Integer.parseInt(ticket1);
            System.out.println("ok lemmme whip out the old calcy and see the tally");
            int price = food + music + rent + deco + staff + misc;
            System.out.println("right, so that brings us to a total of " + price + ", hot damm");
            System.out.println("and you said tickets are " + ticket + " right?");
            String ticket2 = In.nextLine();
            if (ticket2.contains("yes")) {
                System.out.println("cool");
                double ticketsold = price / ticket;
                System.out.println("so we gotta sell about " + ticketsold + " tickets, lets get started then");
            }
            if (ticket2.contains("no")) {
                System.out.println("Alright screwit im done here get your own calc");
                System.out.println(" and figure it out yourself");
            }
        }
        if (party.contains("no") || party.contains("nope") || party.contains("nah bruv") || party.contains("nah") || party.contains("lol no")) {
            System.out.println("h e c k");
        }

    }
}
