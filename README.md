# Number Guessing Game

A command-line number guessing game written in Java. The program randomly selects a number from 1 to 20, and the player has a limited number of chances to guess it.

## Features

- Interactive command-line interface
- Random number between 1 and 20
- Three difficulty levels:
  - **Easy:** 10 chances
  - **Medium:** 5 chances
  - **Hard:** 3 chances
- Hints that indicate whether the secret number is higher or lower
- Congratulatory message when the correct number is guessed

## How to Run

Make sure Java is installed, then run the following commands from the project directory:

```bash
javac Main.java
java Main
```

## How to Play

1. Start the program.
2. Enter `1`, `2`, or `3` to select Easy, Medium, or Hard.
3. Enter a number from 1 to 20 as your guess.
4. Use the higher or lower hints to narrow down the number.
5. Continue until you guess the number or run out of chances.

## Example

```text
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 20.
Please select the difficulty level:

1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 1

Great! You have selected the Easy difficulty level.
Let's start the game!

Enter your guess: 10
Incorrect! The number is greater than 10
```