package String;

public class cov_frtlast
{
	public static void main(String[]args) {
		String s = "hello";
		char first = (char)(s.charAt(0)-32);
		char last = (char)(s.charAt(s.length()-1)-32);
		System.out.println(first+s.substring(2,s.length()-1)+last);
	}

}
