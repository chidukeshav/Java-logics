package Numbers;

public class Summation_parameter {
	public static void main(String[] args) {
		add(1234);
	}
static void add(int no) {
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum=sum+rem;
		
		no=no/10;
	}
		System.out.print(sum);
	
	
}
}
