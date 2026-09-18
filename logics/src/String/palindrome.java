package String;

//public class palindrome {
//	public static void main(String[]args)
//	{
//		String s = "java";
//		String res = "";
//		for(int i=s.length()-1;i>=0;i--) {
//			res = res+s.charAt(i);
//	}
//	if(s.equals(res)) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println("Not");
//	
//	}
//	}
//	}


public class palindrome{
	static void pal(String s) {
		String res = "";
		for(int i =s.length()-1; i>=0; i--) {
			res = res+s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)) {
			System.out.println("pal");
	} 
	else{
		System.out.println("not");
	}
}
	public static void main(String[]args)
	{
		pal("hkgg");
	}
	
}