package Arrays;
public class arrayproduct {
	public static void main(String[] args) {
		int product=1;
		int[] arr = {1,2,3,4,5,6};
		for(int i = 0;i<arr.length;i++) {
	
				product=product*arr[i];
			
		}
		System.out.println(product);
	}
}
