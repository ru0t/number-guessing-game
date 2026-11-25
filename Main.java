import java.util.Scanner;

public class Main {

    static void introMessage() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Please select the difficulty level:");
        String[] choices = { "Easy (10 chances)", "Medium (5 chances)", "Hard (3 chances)" };

        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + 1 + ". " + choices[i]);
        }
    }

    static int generateRandomNum() {
        int randomNum = (int) (Math.random() * 100) + 1;
        return randomNum;
    }

    public static void main(String[] args) {
        introMessage();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();
    }
}
