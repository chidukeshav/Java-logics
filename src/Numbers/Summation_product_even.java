package Numbers;

public class Summation_product_even {

	public static void main(String[] args) {
		int no=1234567;
		int pro=1;
		while(no!=0) {
			if(no%2!=0) {
				int rem = no%10;
				pro=rem*pro;
				
			}
			no=no/10;
			
		}
		
			System.out.println(pro);
	}

}
