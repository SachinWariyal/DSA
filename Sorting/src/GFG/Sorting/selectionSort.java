package GFG.Sorting;

public class selectionSort {
	
	static void selectionSort(int arr[], int n) {
		
		for (int i = 0; i < n; i++) {
			int min_ind = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
		}

	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,5,3,1,6,7};
		int n =arr.length;
		selectionSort(arr, n);
	    
	    for(int i = 0; i < n; i++){
	       System.out.print(arr[i] + " ");
	}
}
}
