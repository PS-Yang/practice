package practice;

public class Solution172 {
	public int trailingZeroes(int n) {
        int ans=0;
		while(n>0)
		{
			n=n/5;
			ans=ans+n;
		}
		return ans;
    }
}
