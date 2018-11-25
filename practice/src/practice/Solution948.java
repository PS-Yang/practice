package practice;

import java.util.Arrays;

public class Solution948 {
	public int bagOfTokensScore(int[] tokens, int P) {
		if(tokens.length==0)
			return 0;
		int ans=0;
		Arrays.sort(tokens);
		int i=0;
		int j=tokens.length-1;
		while(i<=j && P>tokens[i])
		{
			while(i<tokens.length && P>=tokens[i])
			{
				P=P-tokens[i];
				i++;
				ans++;
			}
			if(i>j)
				break;
			if(ans>0 && i!=j && (P+tokens[j]) > tokens[i])
			{
				P=P+tokens[j];
				ans--;
				j--;
			}
		}
		return ans;
    }
}
