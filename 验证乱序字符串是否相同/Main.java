package 验证乱序字符串是否相同;
/* ex: a = aaabbb ,b = ababab => true;
 	 a= cat,b = car, => false;*/
public class Main {
	public static int partition(char[] a, int L, int R) {
		int i, j = L;
		for (i = L; i< R; i++) {
			if(a[i] < a[R]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = (char) temp;
				j++;			
			}
		}
		int temp = a[j];
		a[j] = a[R];
		a[R] = (char) temp;
		return j;
	}
	public static void quicksort(char[] a, int L, int R) {
		if(L<R) {
			int M = partition(a, L, R);
			quicksort(a,L,M-1);
			quicksort(a,M+1,R);
		}
	}    
    public boolean isAnagram(String s, String t) {
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		quicksort(a,0,a.length-1);
		quicksort(b,0,b.length-1);
		String s1 = null,s2 = null;
		for (int i = 0; i < a.length; i++) {
			s1+=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			s2+=b[i];
		}
		return s1.equals(s2);
    }
    public static void main(String args[]) {
    	String s ="package 验证乱序字符串是否相同;;";
    	String t ="package 验证乱序字符串是否相同;;";
    	System.out.println(new Main().isAnagram(s, t));
    }
}