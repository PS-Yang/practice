package practice;

public class Solution171 {
	public int titleToNumber(String s) {
		int ans=0;
        for(char c:s.toCharArray())
        	ans=ans*26+(int)(c-'A'+1);
        return ans;
    }
}
