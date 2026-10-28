package com.pluralsight;

import java.util.Scanner;

public class DisplayQuotesApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] quotes = new String[10];
        quotes[0] = "It's better to walk alone than follow the wrong crowd.";
        quotes[1] = "Never let the fear of striking out keep you from playing the game.";
        quotes[2] = "Never interrupt your enemy when he's making a mistake.";
        quotes[3] = "Dream as if you'll live forever.";
        quotes[4] = "One day the risk you took will make sense.";
        quotes[5] = "Be so good they can't ignore you.";
        quotes[6] = "Some people feel the rain. others just jet wet.";
        quotes[7] = "You can miss someone and still know they don't belong to your life.";
        quotes[8] = "Never become so attached that losing someone means losing yourself.";
        quotes[9] = "Surprise them.";

        try {
            System.out.println("select a number between 1 and 10 to display the quote: ");
            int userChoice = input.nextInt();
            System.out.println(quotes[userChoice-1]);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}