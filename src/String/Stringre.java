package String;

import java.util.Arrays;

class Stringre
{

	public static void main(String[] args) 
	{
		String s="JAVA";
		char[]ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp =ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
		}
		System.out.println(new String(ch));
	}
}	
//		String res="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			res=res+s.charAt(i);
//		}
//		System.out.println(res);
//	}

