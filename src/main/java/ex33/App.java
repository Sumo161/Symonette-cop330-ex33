package ex33;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */
public class App {
    public static void main(String[] args) {

        // must display all possible outcomes; so yes, no, maybe, and come back later
        String[] responses = { "Yes", "No", "Maybe", "Ask again later" };
        Scanner inputScanner = new Scanner(System.in);

        // concat
        System.out.println("What is your question? ");
        System.out.print("> ");
        inputScanner.nextLine();

        int randomIdx = getNumberBetween(0, responses.length);
        String response = responses[randomIdx];
        System.out.println(response + ".");

        inputScanner.close();
    }

    private static int getNumberBetween(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}

