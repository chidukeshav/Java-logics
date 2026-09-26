package Numbers;

public class Prime_no_method_with_parameter {
	 static void isprime(int num) {
		boolean flag =true;
		if(num<=0) {
			flag=false;
		}
		else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prime number");
		}
	}
public static void main(String[] args) {
	isprime(7);
}
}
