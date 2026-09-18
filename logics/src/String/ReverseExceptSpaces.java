package String;
public class ReverseExceptSpaces {
    public static void main(String[] args) {
        String s = "ab cd ef";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                rev = rev + s.charAt(i);
            }
        }

        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                System.out.print(" ");
            else
                System.out.print(rev.charAt(k++));
        }
    }
}

