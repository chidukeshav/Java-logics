package Strings;
class Sample6
{
	public static void main(String[] args){
	String s = "leve";
	System.out.println(s);
		char[] ch = s.toCharArray();
		int i=0,j=s.length()-1;
		while (i<j)
		{
			if (ch[i]!=ch[j])
			{
				System.out.println("Not a palindrome");
				return;
			}
			i++;
			j--;
		System.out.println("palindrome");
		}
		
	}
}
