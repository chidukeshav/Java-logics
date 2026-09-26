package String;

public class swap_oroprator {

		public static void main(String[] args) 
		{
			int a = 4, b = 5, c = 8;
			a = a^b^c;
			b = a^b^c;
			c = a^b^c;
			a = a^b^c;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}


