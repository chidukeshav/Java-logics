package Numbers;

import java.util.Scanner;

public class Prime_number {
	static boolean isprime(int no) {
	if(no<=1) {
		return false;
	}else {
		for(int i=2;i<=Math.sqrt(no);i++) {
			if(no%i==0) {
				return false;
			
			}
		}
	}
	return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num: ");
		if(isprime(s.nextInt())) {
			System.out.println("Prime Num");
		}else {
			System.out.println("Not Prime");
		}
		
	}

}
