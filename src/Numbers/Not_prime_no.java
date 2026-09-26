package Numbers;

public class Not_prime_no {
		static boolean primeno(int no) {
			if(no<=1) {
				return false;
			}
			else {
				for(int i=2;i<no/2;i++) {
					if(no%i==0) {
						return false;
					}
				}
			}
			return true;
		}
		public static void main(String[] args) {
			int[]a= {1,2,3,4,5,6,7,8};
		for(int j=0;j<a.length;j++) {
			if(!primeno(a[j])) {
			
			System.out.println(a[j]);
			}
		}
		

	}

}
