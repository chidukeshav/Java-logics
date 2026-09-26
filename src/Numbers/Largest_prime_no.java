package Numbers;

public class Largest_prime_no {
	static boolean prime(int no){
		if(no<=1) {
			return false;
			
		}
		else {
			for(int i=2;i<=no/2;i++) {
				if(no%i==0) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		int max=Integer.MIN_VALUE;
		for(int j=0;j<a.length;j++) {
			if(prime(a[j])) {
				if(a[j]>max) {
					max=a[j];
				}
				//min=Math.min(a[j],min);
			}
			
		}
		System.out.println(max);
		
	}

}
