package 合并石堆;

import java.util.Scanner;

/*描述
有N堆石子排成一排，每堆石子有一定的数量。现要将N堆石子并成为一堆。合并的过程只能每次将相邻的两堆石子堆成一堆，每次合并花费的代价为这两堆石子的和，经过N-1次合并后成为一堆。求出总的代价最小值。
输入
有多组测试数据，输入到文件结束。
每组测试数据第一行有一个整数n，表示有n堆石子。
接下来的一行有n（0< n <200）个数，分别表示这n堆石子的数目，用空格隔开
输出
输出总代价的最小值，占单独的一行
样例输入
3
1 2 3
7
13 7 8 16 21 4 18
样例输出
9
239
*/
public class Main {
	public static int dp[][];
	public static int sum[];

	static int getMinval(int a[], int n) {
		return n;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		dp = new int[n][n];
		sum = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		sum[0] = a[0];

		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + a[i];
		}
		System.out.println(getMinval(a, n));
	}
}
