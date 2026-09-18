package String;
public class Palindrome7 {

    public static void main(String[] args) {

        String s = "radar";

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}