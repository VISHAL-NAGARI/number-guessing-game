import java.util.Scanner;
import java.util.Random;

    public class NumberGuessGaming {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int lowerBound = 1;
            int upperBound = 100;
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            int points = 100;

            System.out.println("HEY!!!! Welcome to the Number Guessing Game!! lets explore:");
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

            while (!hasGuessedCorrectly) {
                System.out.print("So now enter the number that you guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please guess a number between " + lowerBound + " and " + upperBound + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! no problem try again.");
                    points -= 10;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! no problem try again.");
                    points -= 10;
                } else {
                    System.out.println("Hey player CONGRATULATIONS!!!! you got it RIGHT , you got your guess :11 " + numberToGuess + " correct in : " + attempts + " attempts.");
                    System.out.println("And finally you scored with" + points + " points.");
                    hasGuessedCorrectly = true;
                }
            }
        }
    }
