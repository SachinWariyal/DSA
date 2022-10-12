package GFG.Sorting;

public class MinDiffInArray {

	static int HoarePar(int arr[], int l, int r) {

		int pivot = arr[l];
		int i = l - 1;
		int j = r + 1;
		while (true) {
			do { // {5,3,8,4,2,7,1,10};
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j)
				return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	}

	static void qSort(int arr[], int l, int r) {
		if (l < r) {
			int p = HoarePar(arr, l, r);
			qSort(arr, l, p);
			qSort(arr, p + 1, r);

		}

	}

	static void minDiff(int arr[], int n) {
		qSort(arr, 0, n - 1);
		int res = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
				res = Math.min(res, arr[i] - arr[i - 1]);
				
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 12, 20 };
		int n = arr.length;
//		qSort(arr, 0, n - 1);
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
		minDiff(arr, n);

	}
}
