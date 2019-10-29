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
        char[] answer= chosenWord.toCharArray();//convert the randomized word to a char array
        char[] guessArr2 = new char[answer.length];
        for (int i=0; i<answer.length; i++){
            guessArr2[i] = '*';
        }System.out.print("Welcome, let's play hangman!\nHere is a word I am thinking of: "+guessArr2);


//        System.out.println("Enter your guess: ");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.next().toLowercase();
//        if (hangman.contains(userInput)) {
//            guessArr.indexOf(userInput);
//            System.out.println("Your guess so far: "+ userInput);
//        }
//
//

//
}
}
