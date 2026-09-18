package Strings;
public class Palindrome12 {

    public static void main(String[] args) {

        String sentence = "wow madam racecar level";

        String[] words = sentence.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            if (word.equalsIgnoreCase(rev)) {

                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        System.out.println(longest);
    }
}