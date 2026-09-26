package Numbers;

public class prime_no_method_with_return {
	static boolean isprime() {
		int num=7;
		//boolean flag=true;
		if(num<=0) {
			return false;
		}
		else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
					
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if(isprime()) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
			
		}
		
		
		
	}

}
