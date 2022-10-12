package GFG.Sorting;

public class Inversion {
	static int countInv(int arr[], int l, int r)
    {
        int res = 0;
        if (l<r) {
           
            int m = (r + l) / 2;
     
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            res += countAndMerge(arr, l, m , r);
        }
        return res;
    }
	
	static int countAndMerge(int arr[] , int l, int m, int r) {
		
		int n1=m-l+1; int n2= r-m;
		int left[]= new int[n1];
		int right[]= new int[n2];
		for(int i=0; i<n1;i++) {
			left[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i]=arr[m+1+i];
		}
		int res=0; int i=0; int j=0; int k=l;
		
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k]=left[i]; i++;
			}else {
				arr[k]=right[i]; j++;
				res=res+(n1-i);
			}
			k++;
		}
		while(i<n1) {
			arr[k]=left[i]; i++; k++;
		}
		while(j<n2) {
			arr[k]=right[j]; j++; k++;
		}
		return res;
	}
	
	public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
	    System.out.print(countInv(arr,0,n-1));
        
    }
}
