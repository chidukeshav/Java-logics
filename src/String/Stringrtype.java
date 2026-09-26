package String;
class Stringrtype
{
	static String string(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		return (res);
	}
	public static void main(String[] args) 
	{
	  System.out.println(string("POLO"));
		
	}
}
