import java.util.Scanner;
import java.util.Random;
public class NumberGuessgame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        printWelcome();
        while (playGame()) {

        }
        System.out.println("Thanks for playing. Goodbye.");
    }

    public static void printWelcome() {
        System.out.println("------------------------------------");
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("-------------------------------------");
    }

    public static int chooseDifficulty() {
        while (true) {
            System.out.println("Choose difficulty");
            System.out.println("1. Easy (1-50)");
            System.out.println("2. Normal(1-100)");
            System.out.println("3. Hard(1-500)");
            System.out.print("Enter your choice: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter valid number.");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            if (choice == 1) return 50;
            if (choice == 2) return 100;
            if (choice == 3) return 500;
            System.out.println("Invalid choice. Try again.");
        }
    }

    public static int getMaxAttempts(int maxNumber) {
        if (maxNumber == 50) return 7;
        else if (maxNumber == 100) return 10;
        else return 15;
    }

    public static Integer readGuess(int maxNumber) {
        System.out.print("Enter your guess: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter valid number.");
            scanner.next();
            return null;
        }
        int guess = scanner.nextInt();
        if (guess < 1 || guess > maxNumber) {
            System.out.println("Warning: Number must be between 1 and " + maxNumber);
            return null;
        }
        return guess;
    }

    public static void printWarmHint(int secretNumber, int guess) {
        int difference = Math.abs(secretNumber - guess);
        if (difference <= 5) {
            System.out.println("Very close!");
        } else if (difference <= 10) {
            System.out.println("Close!");
        } else {
            System.out.println("Far away");

        }

    }

    public static boolean playGame() {
        int maxNumber = chooseDifficulty();
        int maxAttempts = getMaxAttempts(maxNumber);
        int secretNumber = random.nextInt(maxNumber) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;
        System.out.println("You have chosen a number between 1 and " + maxNumber);
        System.out.println("You have " + maxAttempts + " Attempts");
        while (attempts < maxAttempts) {
            Integer guess = readGuess(maxNumber);
            if (guess == null) {
                continue;
            }
            attempts++;
            if (guess == secretNumber) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                guessedCorrectly = true;

                return askReplay();
            }
            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            printWarmHint(secretNumber, guess);
            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }
        System.out.println("Game Over! The correct number was: " + secretNumber);
        return false;
    }
    public static boolean askReplay(){
        System.out.print("Do you want to play game again(y/n): ");
        String answer = scanner.next().trim().toLowerCase();
        if(answer.equals("y")){
            return true;
        }
        return false;
    }
}