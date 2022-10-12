package dsa;

import java.util.ArrayList;

public class MaxAndSecondMax {
	
	static ArrayList<Integer> Max(int arr[], int sizeOfArray) {
		ArrayList<Integer>li=new ArrayList<>();
        
        int firstmax = -1;
        int secondmax = -1;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            if(arr[i]<firstmax && arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        li.add(firstmax);
        li.add(secondmax);
        return li;
    }
	
	public static void main(String[] args) {
	int arr[]= {2,2,1,2,5,6};
	int sizeOfArray=arr.length;
	System.out.println(Max(arr,sizeOfArray));
	}
}
