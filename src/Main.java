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
        System.out.println(chosenWord);
        System.out.println(chosenWord.length());
        String init=chosenWord.replaceAll(String, "-");
        char[] userGuess=init.toCharArray();
        System.out.println("Enter your guess: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        if (hangman.contains(userInput)) {
            System.out.println("Your guess so far: "+);

        }
    }
}
