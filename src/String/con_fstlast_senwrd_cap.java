package String;

public class con_fstlast_senwrd_cap {
	public static void main(String[]args) {
		String s = "hi hello how are you";
		String[]str =s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			char first = (char)(str[i].charAt(0)-32);
			System.out.print(first+str[i].substring(1)+" ");
		}
	}

}
