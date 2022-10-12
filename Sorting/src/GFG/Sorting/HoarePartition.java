package GFG.Sorting;

public class HoarePartition {
	
		static int Hoare(int arr[], int l, int h) {
			
			int pivot=arr[l];
			int i=l-1; int j=h+1;
			
			while(true) {
				
				do {
					i++;
				}while(arr[i]<pivot);
				do {
					j--;
				}while(arr[j]>pivot);
				
				if(i>=j) {
					return j;
				}
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			
		}
	
	public static void main(String[] args) {
		int arr[]= {5,3,8,4,2,7,1,10};
		int n=arr.length;
		int l=0;
		int h=n-1;
		
		Hoare(arr, l, h);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}
}
