package String;

public class reverse1 {
	static void res(String s)
	{
		String res = "";
		for(int i =s.length()-1; i>=0; i--) {
			res = res+s.charAt(i);
			System.out.println(res);
	}
}
	

	public static void main(String[]args)
	{
		res("java");
	}
}
