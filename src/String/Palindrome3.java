package String;
public class Palindrome3 {

    public static void main(String[] args) {

        String s = "Madam";

        s = s.toLowerCase();

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
