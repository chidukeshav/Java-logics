package String;
public class Palindrome11 {

    public static void main(String[] args) {

        String sentence = "java level madam racecar";

        String[] words = sentence.split(" ");

        String lastPalindrome = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            if (word.equalsIgnoreCase(rev)) {
                lastPalindrome = word;
            }
        }

        System.out.println(lastPalindrome);
    }
}