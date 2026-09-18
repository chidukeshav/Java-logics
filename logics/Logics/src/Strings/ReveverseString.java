package Strings;
public class ReveverseString {
public static void main(String[] args) {
	String s = "Hi Hello How are you";
	System.out.println(s);
	String x[] = s.split(" ");
	for(int i = x.length-1;i>=0;i--) {
		System.out.print(x[i]+" ");
	}
}
}
