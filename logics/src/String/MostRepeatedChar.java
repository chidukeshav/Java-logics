package String;
public class MostRepeatedChar {
public static void main(String[] args) {
	String str = "helloi_hi_howi";
	int[] arr = new int[127];
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
			arr[ch]++;
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.print((char)(i)+"-"+arr[i]+"  ");
		}
	}
	
	
	int max=0;
	int j=0,k=arr.length-1;
	while(j<k) {
			if(arr[j]>arr[k]) {
				max=arr[j];
				k--;
			}
			else {
				max=arr[k];
				j++;
			}	
	}
	System.out.println("|| max is "+max);
	for(int l=0;l<arr.length;l++) {
		if(arr[l]==max) {
			System.out.println((char)l+" "+arr[l]);
		}
	}
}
}
