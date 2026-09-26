package Arrays;

public class third_max {
	public static void main(String[] args) {
	int[]a= {3,6,1,5,4,2};
	int fmax=a[0];
	int smax=a[0];
	int tmax=a[0];
	for(int i =0;i<a.length;i++) {
		if(a[i]>fmax) {
			smax=fmax;
			tmax=smax;
			fmax=a[i];
		}
		else if(a[i]>smax) {
			tmax=smax;
			smax=a[i];
		}
		else if(a[i]>tmax) {
			tmax=a[i];
		}
	}
	System.out.println(tmax);
}

}
