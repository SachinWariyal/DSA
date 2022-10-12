package Searchingg;

import java.util.ArrayList;

public class TwoRepeatedElements {
	
	public static int[] Repeated(int arr[], int n) {
		
		int count[] = new int[n+3];
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
			if(count[arr[i]]==2) {
				ans.add(arr[i]);
			}
		}
		for(int i=0;i<ans.size();i++) {
			arr[i]=ans.get(i);
		}
		return arr;
		
		
		}
	
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,3};
		int n=arr.length;
		System.out.println(Repeated(arr, n));
	}
}
