package Numbers;

public class Summation_count_no {
	public static void main(String[] args) {
		int no=1234567;
		int count=0;
		while(no!=0) {
			int rem = no%10;
			count++;
			no=no/10;
		}
		System.out.println(count);
	}

}
