package Arrays;

import java.util.Arrays;

//without using temp
public class Zerotolast1 {
	public static void main(String[] args) {
		int[]a= {0,1,0,2,0,3,0,4};
		int j = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]!=0) {
				a[j++]=a[i];
				
			}
		}
	while(j<a.length) {
		a[j++]=0;
	}
	
	System.out.println(Arrays.toString(a));
	
	}

}
