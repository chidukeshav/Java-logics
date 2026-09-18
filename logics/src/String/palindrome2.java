package String;

public class palindrome2 {
	static void pali(String s) {
		char[]ch=s.toCharArray();
		int i = 0, j = ch.length-1;
		while(i<j) {
			if(ch[i]!=ch[j]) {
				System.out.println("not");
				return;
			}
			i++;j--;
		}
		System.out.println("pal");
			
		}
		public static void main(String[]args) {
			pali("java");
		}
	

}

