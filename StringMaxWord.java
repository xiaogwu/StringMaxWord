/**
 * @author Xiao G. Wu
 * CS111A - Inclass assignment 
 * @version 1.0 12/22/2011
 */ 


import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

/**
 * This class takes user input and determines the longest word of the sentence.  It also keeps track of the longest word ever of all sentences entered.
 */

public class StringMaxWord {

    /**
     * Main method 
     */
    
    public static void main(String[] args) {

        // Crate a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String longestWord = "";
        while (keepGoing) {
            System.out.printf("> ");
            String userInput = keyboard.nextLine();
            // Check for Quit condition
            if (userInput.equals("Quit") || userInput.equals("quit")) {
                keepGoing = false;
            } else {
                StringTokenizer st = new StringTokenizer(userInput, "? .!,");
                String currentLongestWord = "";
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    if (word.length() >= currentLongestWord.length()) {
                        currentLongestWord = word;
                    } 
                    if (currentLongestWord.length() >= longestWord.length()) {
                        longestWord = currentLongestWord;
                    }
                }
                System.out.printf("Current longest word: %s(%d)\n", currentLongestWord, currentLongestWord.length());
                System.out.printf("Longest word: %s(%d)\n", longestWord, longestWord.length());
            }
        }
    }
}
