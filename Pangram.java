package java_assignment;

import java.util.HashSet;

public class Pangram {
    public static boolean isPangram(String input) {
        input = input.replaceAll(" ", "").toLowerCase();
        HashSet<Character> letters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the dog";
        boolean isPangram = isPangram(inputSentence);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}