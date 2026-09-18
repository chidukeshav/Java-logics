package Arrays;
import java.util.Arrays;

public class revarray {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6};
	int[] temp = new int[a.length];
	int j= 0;
	for(int i = a.length-1;i>=0;i--) {
		temp[j++]=a[i];
	}
	System.out.println(Arrays.toString(temp));
}
}
