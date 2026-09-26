package String;
public class Palindrome6 {

    public static void main(String[] args) {

        String s = "madam!!";

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}