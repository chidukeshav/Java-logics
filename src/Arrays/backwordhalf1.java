package Arrays;
public class backwordhalf1 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};
	for(int i=arr.length-1;i>arr.length/2-1;i--) {
		System.out.println(arr[i]);
	}
}
}
