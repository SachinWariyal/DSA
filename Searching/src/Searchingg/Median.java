package Searchingg;

public class Median {
	
	static double findMedian(int arr[], int n, int brr[], int m) {
		
		int b1=0; int e1=n;
		while(b1<e1) {
			int i1=(b1+e1)/2;
			int i2=(n+m+1)/2;
			
			int mxl1=(i1==0)? Integer.MIN_VALUE:arr[i1-1];
			int mnr1=(i1==n)? Integer.MAX_VALUE:arr[i1];
			int mxl2=brr[i2-1];
			int mnr2=brr[i2];
			
			if(mxl1<=mnr2 && mxl2<=mnr1) {
				if((n+m)%2==0) {
				return ((Math.max(mxl1, mxl2) + Math.min(mnr1, mnr2))/2 );
				}else {
					return( Math.max(mxl1, mxl2));
				}
				}else if(mxl1>mnr2) {
					e1=i1-1;
				}else {
					b1=i1+1;
				}
		}
		return 0;
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int brr[]= {3,4,5,6,7,8};
		int n=arr.length;
		int m=brr.length;
		System.out.println(findMedian(arr, n, brr, m));
	}
}
