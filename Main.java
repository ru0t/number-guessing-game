import java.util.Scanner;

public class Main {

    static void introMessage() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 20.");
        System.out.println("Please select the difficulty level:");
        System.out.println();
        String[] choices = { "Easy (10 chances)", "Medium (5 chances)", "Hard (3 chances)" };

        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + 1 + ". " + choices[i]);
        }
        System.out.println();
    }

    static int generateRandomNum() {
        int randomNum = (int) (Math.random() * 20) + 1;
        return randomNum;
    }

    public static void main(String[] args) {
        introMessage();
        int chances = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
        System.out.println();
        switch (Integer.valueOf(choice)) {
            case 1:
                chances = 10;
                System.out.println("Great! You have selected the Easy difficulty level.");
                break;
            case 2:
                chances = 5;
                System.out.println("Great! You have selected the Medium difficulty level.");
                break;
            case 3:
                chances = 3;
                System.out.println("Great! You have selected the Hard difficulty level.");
                break;

            default:
                break;
        }
        System.out.println("Let's start the game!");
        System.out.println();

        int randomNumber = generateRandomNum();
        int attempts = 0;

        int i = 1;
        while (i <= chances) {
            System.out.print("Enter your guess: ");
            int guess = Integer.valueOf(scanner.nextLine());
            System.out.println("Chances: " + (chances - 1));
            attempts += 1;
            if (guess > randomNumber) {
                System.out.println("Incorrect! The number is less than " + guess);
            } else if (guess < randomNumber) {
                System.out.println("Incorrect! The number is greater than " + guess);
            } else if (guess == randomNumber) {
                System.out.println(
                        "Congratulations! You guessed the correct number in " + (chances - attempts) + " attempts");
                break;
            }
            i++;
        }
        scanner.close();
    }
}
