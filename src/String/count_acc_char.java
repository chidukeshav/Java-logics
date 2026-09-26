package String;

public class count_acc_char {

public static void main(String[] args) {
	String s = "aaabcccdd";
	int[]arr=new int[127];
	for(int i =0;i<s.length();i++) {
		char ch = s.charAt(i);
		arr[ch]++;
	}
	for(int i =0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println((char)i+" "+arr[i]);
			
		}
		
	}
	
 }

}
