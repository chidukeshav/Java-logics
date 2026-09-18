package Strings;
public class Palindrome13 {

    public static void main(String[] args) {

        String sentence = "wow madam racecar level";

        String[] words = sentence.split(" ");

        String smallest = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            if (word.equalsIgnoreCase(rev)) {

                if (smallest.equals("") ||
                    word.length() < smallest.length()) {

                    smallest = word;
                }
            }
        }

        System.out.println(smallest);
    }
}