package Numbers;

public class Smallest_prime_no {
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
		int min=Integer.MAX_VALUE;
		for(int j=0;j<a.length;j++) {
			if(prime(a[j])) {
				if(a[j]<min) {
					min=a[j];
				}
				//min=Math.min(a[j],min);
			}
			
		}
		System.out.println(min);
		
	}

}
