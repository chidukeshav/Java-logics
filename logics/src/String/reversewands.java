package String;
public class reversewands {
static String rev(String s) {
	char[] ch = s.toCharArray();
	int i = 0,j=ch.length-1;
	while(i<j) {
		char t=ch[i];
		ch[i]=ch[j];
		ch[j]=t;
		i++;j--;
	}
	return new String(ch);
	}

	public static void main(String[] args) {
		String s = "Hi Hello How are you";
		System.out.println(s);
		String x[] = s.split(" ");
		for(int i = x.length-1;i>=0;i--) {
			System.out.print(rev(x[i])+" ");
		}
	}
}
