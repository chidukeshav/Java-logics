package String;

public class frt_cap {
	public static void main(String[]args) {
		String s = "hello";
		char first =(char)(s.charAt(0)-32);
		System.out.println(first+s.substring(1));
	}

}
