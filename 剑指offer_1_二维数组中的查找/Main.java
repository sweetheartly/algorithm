package ��ָoffer_1_��ά�����еĲ���;

public class Main {
    public static boolean Find(int target, int [][] array) {
    	String str = array.toString();
		return str.indexOf(""+target) == 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2},{3}};
		int b = 11;
		System.out.println(a);
		System.out.println(Find(b,a));
	}

}
