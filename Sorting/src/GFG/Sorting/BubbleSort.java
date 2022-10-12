package GFG.Sorting;

public class BubbleSort {
	
	static void bubbleSort(int arr[], int n) {
		boolean swapped;
		for(int i=0; i <n ;i++) {
			swapped=false;
			for(int j=0; j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {

				//swap
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
					swapped = true;
				}
				
			}
			if(swapped==false) {
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
	int arr[]= {1,3,2,4,7,5,6};
	int n=arr.length;
	bubbleSort(arr, n);
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}
