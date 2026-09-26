package Arrays;
import java.util.Arrays;

public class bubblesort {
public static void main(String[] args) {
	int[] arr = {5,4,3,2,1};
	System.out.println("1st"+Arrays.toString(arr));
	for(int  i = 0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int t = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = t;
			}
		}
	}
	System.out.println("1st"+Arrays.toString(arr));
	System.out.println(" ");
	
	int[] brr = {3,2,5,4,1};
	System.out.println("2nd"+Arrays.toString(brr));
	for(int  i = 0;i<brr.length;i++) {
		for(int j=0;j<brr.length-1-i;j++) {
			if(brr[j]>brr[j+1]) {
				int t = brr[j];
				brr[j] = brr[j+1];
				brr[j+1] = t;
			}
		}
	}
	System.out.println("2nd"+Arrays.toString(brr));
	System.out.println(" ");
	
	int[] crr = {506,504,503,505,502};
	System.out.println("3rd"+Arrays.toString(crr));
	for(int  i = 0;i<crr.length;i++) {
		for(int j=0;j<crr.length-1-i;j++) {
			if(crr[j]>crr[j+1]) {
				int t = crr[j];
				crr[j] = crr[j+1];
				crr[j+1] = t;
			}
		}
	}
	System.out.println("3rd"+Arrays.toString(crr));
	System.out.println(" ");
	
	int[] drr = {420,423,425,421,422};
	System.out.println("4th"+Arrays.toString(drr));
	for(int  i = 0;i<drr.length;i++) {
		for(int j=0;j<drr.length-1-i;j++) {
			if(drr[j]>drr[j+1]) {
				int t = drr[j];
				drr[j] = drr[j+1];
				drr[j+1] = t;
			}
		}
	}
	System.out.println("4th"+Arrays.toString(drr));
	System.out.println(" ");
	
	int[] err = {6,5,7,8,9};
	System.out.println("5th"+Arrays.toString(err));
	for(int  i = 0;i<err.length;i++) {
		for(int j=0;j<err.length-1-i;j++) {
			if(err[j]>err[j+1]) {
				int t = err[j];
				err[j] = err[j+1];
				err[j+1] = t;
			}
		}
	}
	System.out.println("5th"+Arrays.toString(err));
}
}
