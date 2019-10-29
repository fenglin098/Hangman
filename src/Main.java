import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hangman = new ArrayList<>();
        Collections.addAll(hangman, "tree", "rain", "bear", "encourage", "promise", "soup", "chess", "insurance", "pancakes", "stream");
        Random r = new Random();
        int randomNum = r.nextInt(10);
        String chosenWord = hangman.get(randomNum);
        System.out.println(chosenWord);//randomize a word for guessing
        char[] answerArr = chosenWord.toCharArray();//convert the randomized word to a char array
        char[] guessArr = new char[answerArr.length];
        for (int i = 0; i < answerArr.length; i++) {
            guessArr[i] = '*';
        }
        System.out.print("Welcome, let's play hangman!\nHere is a word I am thinking of: ");
        System.out.println(guessArr);
        int count = 1;
        do {
            System.out.println("Enter your guess: ");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.next().toLowerCase();
            if (userInput.length() > 1 && userInput.equalsIgnoreCase(chosenWord)) {
                System.out.println("You've won! The word was " + chosenWord);
                break;
            } else if (userInput.length() == 1) {
                char userInputChar = userInput.charAt(0);
                if (hangman.contains(userInput)) {
                    for (int j = 0; j < answerArr.length; j++) {
                        if (answerArr[j] == userInputChar) {
                            guessArr[j] = userInputChar;
                        }
                        System.out.println("Your guess so far: " + guessArr);
                    }
                } else {
                    count++;
                    System.out.println("You have guessed incorrectly " + count + "/6 times.");
                    if (count==6){
                        System.out.println("Sorry, you have no more guesses left. The word was "+chosenWord);
                    }
                }
            }

        } while (count <= 6);

    }
}







