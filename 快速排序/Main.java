package 快速排序;

public class Main {
	public static int partition(int arr[], int L, int R) {
		int i, j = L;
		for (i = L; i< R; i++) {
			if(arr[i] < arr[R]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;			
			}
		}
		int temp = arr[j];
		arr[j] = arr[R];
		arr[R] = temp;
		return j;
	}
	public static void quicksort(int arr[], int L, int R) {
		if(L<R) {
			int M = partition(arr, L, R);
			quicksort(arr,L,M-1);
			quicksort(arr,M+1,R);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,1,5,8,6,2,4};
		quicksort(arr, 0, 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
