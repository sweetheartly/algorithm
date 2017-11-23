package DP_01背包;

public class Main {

	public static void main(String[] args) {
		int[] w = {2,2,6,5,4};
		int[] v = {6,3,5,4,6};
		int[] dp = new int[10];
		
        int[][] f = new int[6][11]; //f[i][j]表示前i个物品能装入容量为j的背包中的最大价值  


        //通过公式迭代计算  
        for(int i=1;i<f.length;i++){  
            for(int j=1;j<f[0].length;j++){  
                if(w[i-1]>j)    
                    f[i][j] = f[i-1][j];
                else{  
                    f[i][j] = Math.max(f[i-1][j], f[i-1][j-w[i-1]]+v[i-1]);  
                }  
            }  
        }  
		System.out.println(f[5][10]);
	}

}
