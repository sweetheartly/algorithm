package ºÏ¸ùÖ²Îï;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int num[];
	static int use[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int k = scan.nextInt();
		num = new int[k * 2];
		use = new int[k * 2];
		Set<HashSet> re = new HashSet<HashSet>();
		for (int i = 0; i < k; i++) {
			Set<Integer> set = new HashSet<Integer>() {
				{
					add(scan.nextInt());
					add(scan.nextInt());
				}
			};
			re.add((HashSet) set);
		}
		Iterator iterator = re.iterator();
		while (iterator.hasNext()) {
			
			Set a = (Set) iterator.next();

			Iterator is = re.iterator();
			while (is.hasNext()) {
				Set<Integer> del = new HashSet<Integer>();
				Set b = (Set) is.next();

				Set<Integer> result = new HashSet<Integer>();
				result.addAll(a);
				result.retainAll(b);
				if (!result.isEmpty() && a != b) {
					b.addAll(a);
					a.clear();
				}
			}
		}
		Iterator it = re.iterator();
		int c = 0;
		int count = 0;
		while(it.hasNext()) {
			Set ss = (Set) it.next();
			if(!ss.isEmpty()) {
				count += ss.size();
				c++;
			}				
		}
		System.out.println(c+(m*n-count));
	} 
}
