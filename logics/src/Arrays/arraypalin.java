package Arrays;
import java.util.Arrays;

public class arraypalin {
	public static void main(String[] args) {
		int[] a = {1,2,3,3,2,1};
		int[] temp = new int[a.length];
		int j= 0;
		for(int i = a.length-1;i>=0;i--) {
			temp[j++]=a[i];
		}
		if(Arrays.equals(a, temp)) {
			System.out.println(Arrays.toString(temp)+" "+ "palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}
}
