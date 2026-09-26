package Arrays;
import java.util.Arrays;
public class positive_to_front {
public static void main(String[] args) {
	int[]arr= {-2,5,-1,8,-3,4};
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		if(arr[i]>0){
			i++;
		}
		else if(arr[j]<=0) {
			j--;
		}
		else {
			int t =arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
	System.out.println(Arrays.toString(arr));
	
}
}
