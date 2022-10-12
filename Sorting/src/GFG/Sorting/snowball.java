package GFG.Sorting;

public class snowball {
	
	static int snowball(int N, int weights[]){
        // code here
        int res=0;
        for(int i=0; i<N;i++) {
        	res+=weights[i];
        	
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		int weights[]= {1,2,3};
		int N=weights.length;
		
		
		System.out.println(snowball(N, weights));
	}
}
