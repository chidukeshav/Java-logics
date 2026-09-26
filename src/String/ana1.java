package String;

public class ana1 {
	public static void main(String[] args) {
		
	
	String s1="race";
	String s2="care";
	int[]arr=new int[127];
	for(int i =0;i<s1.length();i++) {
		char ch =s1.charAt(i);
		arr[ch]++;
	}
	for(int i=0;i<s2.length();i++) {
		char ch = s2.charAt(i);
		arr[ch]--;
	}
	
	for(int i =0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println("not");
			return;
		}
	}
		System.out.println("anagram");
	}

}
