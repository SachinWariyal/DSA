package GFG.Sorting;

public class Uninon {
	
	static void Union(int a[], int b[], int m, int n) {
		
		int i=0; int j=0;
		while(i<m && j<n) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && a[j]==a[j-1]) {
				j++;
				continue;
			}
			
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}else if(b[j]<a[i]) {
				System.out.print(b[j]+" ");
				j++;
			}else {
				System.out.print(a[i]+" ");
				i++; j++;
			}
		}
		while(i<m )
			if(i>0 && a[i]!=a[i-1]) {
				System.out.println(a[i]+" ");
				i++;
			}
		while(j<n)
			if(j>0 && b[j]!=b[j-1]) {
				System.out.print(b[j]+" ");
				j++;
			}
		
	}
	
	public static void main(String[] args) {
		int a[]= {3,5,8};
		int b[]= {2,8,9,10,15};
		int m=a.length;
		int n=b.length;
		Union(a, b, m, n);
		
	}
}
