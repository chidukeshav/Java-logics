package Strings;
class StringPalindrome
{

	public static void main(String[] args) 
	{
		String s="JAVA";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)){
			System.out.println("Palindrome");
		}else{
			System.out.println(" Not a Palindrome");
		}
	}
}
