package 剑指offer_1_二维数组中的查找;

public class Main {
	public static boolean find(int k,int arr[][]) {
		int m = arr.length -1;
		int n = arr[0].length;
		int c = 0;
		while(m >= 0 && c < n) {
			System.out.println(arr[m][c]);
			if(arr[m][c] > k)
				m--;
			else if(arr[m][c] < k)
				c++;
			else 
				return true;
		}
		return false;
		
	}

	public static void main(String args[]) {
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(find(1,a));
	}
}
//