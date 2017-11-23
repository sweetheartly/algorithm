package 递归_魔法币;

import java.util.Scanner;

/**
 * 
 * @author 宋鸿浩
 *小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。 
 */
public class Main {
	public static void f(int x,int n,String s){
		if(n == 1) {
			System.out.println(1);
			return; 
		}
		
		if(n == 2) {
			System.out.println(2);
			return;
		}
			 
		if(2*x+1 > n) 
			return;
		
		if(2*x+2 > n) 
			return;
		
		if(2*x+1 == n) {
			System.out.println(s+"1");
			return;
		}
			
		
		if(2*x+2 == n) {
			System.out.println(s+"2");
			return;
		}
		  
		f(x*2+1,n,s+"1");
		f(x*2+2,n,s+"2");
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		f(0,n,"");

	}

}
