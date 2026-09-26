package Arrays;

public class second_min {
	public static void main(String[] args) {
		int[]a= {3,6,1,5,4,2};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
	}

}
