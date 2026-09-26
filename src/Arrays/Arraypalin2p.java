package Arrays;
public class Arraypalin2p {
	public static void main(String[] args) {
		int[] a = {1,2,3,3,2,1};
		int i=0,j=a.length-1;
		while(i<j){
			if(a[i]!=a[j]) {
				System.out.println("Not a Palindrome");
				return;
			}
			i++;j--;
		}
		System.out.println("Palindrome");
	}

}