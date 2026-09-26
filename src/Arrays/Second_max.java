package Arrays;

public class Second_max {
	public static void main(String[] args) {
		int[]a= {3,6,1,5,4,2};
		int fmax=-1;
		int smax=-2;
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
