package Numbers;
import java.util.*;
public class Next_prime_no {
	public static void main(String[] args) {
		int num=7;
		for(int j=num+1;j<=100;j++) 
		{
			//
	    num=j;
		boolean flag=true;
		if(num<=1) 
		{
			flag =false;
		}
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0) 
			{
				flag = false;
				break;
			}		
		}	
		if(flag) {
			System.out.println(num);
			break;
		}
	}
		
}

}
