package GFG.Sorting;

public class IntersectionOfTwoSortedArrays {
	
	static void Intersection(int a[], int b[],int m, int n) {
		
		int i=0; int j=0;
		while(i<m && j<n) {
			
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(a[i]<b[j]) {
				i++;
			}else if(a[i]>b[j]) {
				j++;
			}else {
				System.out.print(a[i]+" ");
				i++; j++;
			} 
		}
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {3,5,10,10,15,15,20};
		int b[]= {5,10,10,10,15,30};
		int m=a.length;
		int n=b.length;
		Intersection(a, b, m, n);
	}
}
