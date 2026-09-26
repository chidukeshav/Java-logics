package Numbers;

public class Summation_product_odd {
	public static void main(String[] args) {
		
	
	int no=123456;
	int pro=1;
	while(no!=0) {
		int rem = no%10;
		if(rem%2!=0) {
		pro=pro*rem;
		}
		no=no/10;
		
		}
	System.out.println(pro);
	}
	

}
