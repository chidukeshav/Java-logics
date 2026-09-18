package String;
public class UpperCase {
public static void main(String[] args) {
	String str = "HeLLO hi HoW are You";
	
	int[] arr = new int[127];
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>='A' && ch<='Z') {
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
