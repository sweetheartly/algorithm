package 验证乱序字符串是否相同;

public class Main1 {
    public boolean isAnagram(String s, String t) {
    	int a[] = new int[26];
    	int b[] = new int [26];
    	for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)-'a'] ++;
		}
    	for (int i = 0; i < t.length(); i++) {
			b[t.charAt(i)-'a'] ++;
		}
    	for (int i = 0; i < 26; i++) {
			if(a[i] != b[i])
				return false;
		}
    	return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Main().isAnagram("caat", "act"));
	}

}
