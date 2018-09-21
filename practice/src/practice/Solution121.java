package practice;

public class Solution121 {
	public int maxProfit(int[] prices) {
        if(prices.length<2)
        	return 0;
		int ans=0;
        int min=prices[0];
        for(int p:prices)
		{
			min=Math.min(min, p);
			if(ans<p-min)
				ans=p-min;
		}
        return ans;
    }
}
