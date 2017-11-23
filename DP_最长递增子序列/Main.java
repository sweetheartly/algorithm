package DP_最长递增子序列;
/**
 * 
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,3,4,8,6,7};
		int[] dp = new int[a.length+1];
		int max = 0;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(a[i]>a[j])
					max = dp[j]+1;
				dp[i] = Math.max(max, dp[i]);	
			}
			System.out.println(dp[i]);
		}
	}

}
