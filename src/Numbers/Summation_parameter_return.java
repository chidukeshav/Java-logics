package Numbers;

public class Summation_parameter_return {
	public static void main(String[] args) {
		System.out.println(add(12345));
		
	}
static int add(int no) {
	int sum=0;
	while(no!=0) {
		int rem = no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
	
}
}
