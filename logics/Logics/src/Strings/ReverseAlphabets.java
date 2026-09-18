package Strings;
class ReverseAlphabets {
    public static void main(String[] args) {
        String s = "a1b2c3";
        char[] a = s.toCharArray();

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (!(a[i]>='a' && a[i]<='z'))
                i++;
            else if (!(a[j]>='a' && a[j]<='z'))
                j--;
            else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(a);
    }
}