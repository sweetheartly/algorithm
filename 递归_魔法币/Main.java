package �ݹ�_ħ����;

import java.util.Scanner;

/**
 * 
 * @author �κ��
 *С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,����С������һöħ���Ҷ�û��,����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
С�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ���ҡ� 
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
