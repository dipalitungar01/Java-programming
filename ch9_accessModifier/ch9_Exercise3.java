package ch9_accessModifier;


import java.util.Random;
import java.util.Scanner;

class Game {

    private int number;
    private int userInput;
    private int noOfGuesses = 0;

    // Constructor
    public Game() {
        Random random = new Random();
        number = random.nextInt(100) + 1; // Generates a number between 1 and 100
    }

    // Take user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (1-100): ");
        userInput = sc.nextInt();
    }

    // Check whether the guessed number is correct
    public boolean isCorrectNumber() {
        noOfGuesses++;

        if (userInput == number) {
            System.out.println(" Congratulations! You guessed the correct number.");
            return true;
        } else if (userInput < number) {
            System.out.println("Too Low! Try Again.");
        } else {
            System.out.println("Too High! Try Again.");
        }
        return false;
    }

    // Getter
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class ch9_Exercise3 {
    public static void main(String[] args) {
        /*
        create a class Game, which allows a user to play "Guess the numbeer"
        game once. Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
               3. isCorrectNumber() to detect whether the number entered by the user is true
               4. getter and setter for noOfGuesses
               Use properties such as noOfGuesses(int), etc to get this task done!
               */

        Game game = new Game();

        boolean correct = false;

        while (!correct) {
            game.takeUserInput();
            correct = game.isCorrectNumber();
        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " guesses.");
    }
}
