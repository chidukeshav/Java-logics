package Strings;
public class Vowels {
public static void main(String[] args) {
	String str = "Hello hi how are You";
	
	int[] arr = new int[127];
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch=='A' || ch=='E' || ch=='I'|| ch=='U'|| ch=='O'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			arr[ch]++;
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.print((char)(i)+"-"+arr[i]+"  ");
		}
	}
}
}
