package String;
public class Palindrome8 {

    public static void main(String[] args) {

        String sentence = "java level madam code";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            if (word.equalsIgnoreCase(rev)) {
                System.out.println(word);
            }
        }
    }
}