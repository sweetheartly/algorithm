package �ϸ�ֲ��;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	// ����һ������������ģ����ʵ�е�ɸѡ������������Ҫ����
	// ���ɳ�ʱ
	public static ArrayList<ArrayList> arrayList;

	public static void classify(int a, int b) {
		boolean bool = true;
		for (int i = 0; i < arrayList.size(); i++) {

			ArrayList<Integer> arr = arrayList.get(i);
			for (int j = 0; j < arr.size(); j++) {
				if (a == (int) arr.get(j)) {
					bool = false;
					arr.add(b);
					break;
				}
			}
		}
		if (bool) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(a);
			al.add(b);
			arrayList.add(al);
		}

	}

	public static void main(String[] args) {
		arrayList = new ArrayList<ArrayList>();
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt(), n = scan.nextInt(), k = scan.nextInt(), s = m * n;
		for (int i = 0; i < k; i++) {
			classify(scan.nextInt(), scan.nextInt());

		}
		System.out.println(arrayList.size());
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}

	}
}
