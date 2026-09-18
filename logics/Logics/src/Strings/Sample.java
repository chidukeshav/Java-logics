package Strings;
class Sample
{
	static String demo(String s){
		char[] ch = s.toCharArray();
		int i=0,j=s.length()-1;
		while (i<j)
		{
			if (ch[i]!=ch[j])
			{
				return ("Not a palindrome");
			}
			i++;
			j--;
		}
		return ("palindrome");
	}
	public static void main(String[] args) 
	{
		System.out.println(demo("level"));
	}
}
