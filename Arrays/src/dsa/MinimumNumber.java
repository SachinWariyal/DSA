package dsa;

public class MinimumNumber {
	
	static int minNumber(int arr[], int low, int high, int n) {
		
		 int s =low ;
         int e = high;
         
         while(s<e){
             
             int m = (e+s)/2;
             
             if(arr[m]>arr[e])
             s=m+1;
             
             else
             e=m;
         }
         
         return arr[s];
		
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};	
		int n=arr.length;
		int low=0;
		int high=n-1;
		System.out.println(minNumber(arr, low, high, n));
	}
}
