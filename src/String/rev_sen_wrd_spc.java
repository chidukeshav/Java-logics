package String;

public class rev_sen_wrd_spc {
public static void main(String[]args) {
	String s = "hi hello how are you";
	System.out.println(s);
	char[]ch=s.toCharArray();
	int i = 0, j = ch.length-1;
	while(i<j) {
		if(ch[i]==' ') {
			i++;
		}
		else if(ch[j]==' ')
		{
			j--;
		}else {
			char t = ch[i];
			ch[i]=ch[j];
			ch[j]=t;
			i++;
			j--;
		}
	}
	System.out.println(new String(ch));
		}
	
}

