package Strings;
public class Palindrome2 {

    public static void main(String[] args) {

        String s = "level";

        int start = 0;
        int end = s.length() - 1;

        boolean palindrome = true;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end)) {
                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}