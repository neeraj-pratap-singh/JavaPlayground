
import java.util.Scanner;
import java.util.Random;

public class HangmanGame {
    private static final String[] WORD_BANK = {"apple", "banana", "orange", "grape", "watermelon"};
    private static final String[] HANGMAN_DRAWINGS = {
        "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };

    private static final int MAX_TRIES = HANGMAN_DRAWINGS.length - 1;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    private String word;
    private char[] guessedLetters;
    private int attempts;

    private void setupGuessedLetters() {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isLetter(letter) && isVowel(letter)) {
                guessedLetters[i] = letter;
            }
        }
    }

    private boolean isVowel(char letter) {
        return "aeiouAEIOU".indexOf(letter) != -1;
    }

    public HangmanGame() {
        word = getRandomWord();
        guessedLetters = new char[word.length()];
        attempts = 0;
    }

    private String getRandomWord() {
        int index = random.nextInt(WORD_BANK.length);
        return WORD_BANK[index];
    }

    private void displayWord() {
        for (char letter : guessedLetters) {
            System.out.print(letter == '\u0000' ? "_ " : letter + " ");
        }
        System.out.println();
    }

    private boolean isWordGuessed() {
        for (char letter : guessedLetters) {
            if (letter == '\u0000') {
                return false;
            }
        }
        return true;
    }

    private boolean makeGuess(char letter) {
        boolean guessedCorrectly = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = letter;
                guessedCorrectly = true;
            }
        }
        return guessedCorrectly;
    }

    private boolean isValidInput(char letter) {
        return Character.isLetter(letter) && !hasAlreadyGuessed(letter);
    }

    private boolean hasAlreadyGuessed(char letter) {
        for (char guessedLetter : guessedLetters) {
            if (guessedLetter == letter) {
                return true;
            }
        }
        return false;
    }

    private void playGame() {
        while (attempts < MAX_TRIES) {
            System.out.println(HANGMAN_DRAWINGS[attempts]);
            displayWord();
            System.out.print("Guess a letter: ");
            char guess = Character.toLowerCase(scanner.next().charAt(0));
            if (!isValidInput(guess)) {
                System.out.println("Invalid input. You either entered a non-letter or already guessed that letter.");
                continue;
            }

            if (!makeGuess(guess)) {
                attempts++;
            }

            if (isWordGuessed()) {
                System.out.println("Congratulations! You guessed the word: " + word);
                break;
            }
        }

        if (attempts >= MAX_TRIES) {
            System.out.println("Oops! You ran out of attempts. The word was: " + word);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.setupGuessedLetters();
        hangmanGame.playGame();
    }
}
