package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        // Question 1: Favorite color
        String favoriteColor = "Black";

        // Question 2: Year started class
        int yearStarted = 2025;

        // Question 3: Middle initial
        char middleInitial = 'A';

        // Question 4: Pets (yes/no)
        boolean hasPets = true;

        // Question 5: Nice message or saying
        String message = "I love MMA.";

        // Print the answers
        System.out.println("My favorite color is: " + favoriteColor);
        System.out.println("I started this class in: " + yearStarted);
        System.out.println("My middle initial is: " + middleInitial);
        System.out.println("Do I have pets? " + (hasPets ? "Yes" : "No"));
        System.out.println("Here’s a nice message: " + message);
    }
}
