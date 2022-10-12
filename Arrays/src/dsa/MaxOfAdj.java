package dsa;

import java.util.ArrayList;

public class MaxOfAdj {
	
	static void maxOfAdj(int arr[], int sizeOfArray) {
		ArrayList<Integer> li =new ArrayList<>();
		for(int i=1;i<sizeOfArray;i++) {
			
			int res=Math.max(arr[i], arr[i-1]);
			li.add(res);
		}for(int i:li){
	        System.out.print(i+" ");;
	        }
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5};
		int sizeOfArray=arr.length;
		maxOfAdj(arr, sizeOfArray);
	}
}
