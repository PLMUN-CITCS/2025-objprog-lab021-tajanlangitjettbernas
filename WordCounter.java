import java.util.Scanner;

public class WordCounter {

    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        return scanner.nextLine(); // Read the entire line as a sentence
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Handle empty or null sentences
        }
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+"); // "\\s+" handles multiple spaces
        return words.length; // Return the number of words
    }

    // Main Program Flow
    public static void main(String[] args) {
        // Get a sentence from the user
        String sentence = getSentenceInput();
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        // Display the word count to the user
        System.out.println("The number of words in your sentence is: " + wordCount);
    }
}