package dsa;

public class Majority {
	
	static int Majority(int arr[],int x,int y, int n) {
		int res=0;
		int countX=0;
		int countY=0;
		for(int i=1;i<n;i++) {
			if(arr[i]==x) {
				countX++;
			}else if(arr[i]==y) {
				countY++;
			}
		}if(countX==countY) {
//			return Math.min(x, y);
			return x<y ? x:y;
		}
		return countX >countY ? x:y;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {98,99, 39, 12, 0, 36, 15, 47, 79, 62, 64};
		int x = 64;int y = 5;
		int n=arr.length;
		
		System.out.println(Majority(arr, x, y, n));
	}
	
}
