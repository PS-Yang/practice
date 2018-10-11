package practice;

public class Solution122 {
	//2. easy solution
	public int maxProfit(int[] prices) {
		int sum=0;
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i]>prices[i-1])
				sum=sum+prices[i]-prices[i-1];
		}
		return sum;
	}
//	//1.
//	public int maxProfit(int[] prices) {
//		if(prices.length<2)
//        	return 0;
//		int sum=0;
//        int min=prices[0];
//        int prev=Integer.MIN_VALUE;
//        for(int p:prices)
//		{
//			if(p<prev)
//			{
//				sum=sum+prev-min;
//				min=p;
//			}
//			min=Math.min(min, p);
//			prev=p;
//		}
//        sum=sum+prev-min;
//        return sum; 
//    }

}
