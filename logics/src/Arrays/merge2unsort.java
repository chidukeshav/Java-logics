package Arrays;
import java.util.Arrays;

public class merge2unsort {
	public static void main(String[] args) {
		int[] a1= {5,3,4};
		int[] a2= {2,1,6};
		int[] temp=new int[a1.length+a2.length];
		System.arraycopy(a1, 0, temp, 0, a1.length);
		System.arraycopy(a2, 0, temp, a1.length, a2.length);
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
	}
	
}
