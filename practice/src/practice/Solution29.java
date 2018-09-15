package practice;

public class Solution29 {
	public int divide(int dividend, int divisor) {
        int count=0;
        int sign=1;
        if((divisor>0 && dividend<0) || (divisor<0 && dividend>0))
        	sign=-1;
        long ldividend = Math.abs((long) dividend);
    	long ldivisor = Math.abs((long) divisor);
    	long lans = ldivide(ldividend, ldivisor);
    	int ans;
    	if(lans>Integer.MAX_VALUE)
    	{
    		if(sign==1)
    			return Integer.MAX_VALUE;
    		else
    			return Integer.MIN_VALUE;
    	}
    	else
    		ans=(int) (lans*sign);
    	return ans;
    }
	private long ldivide(long ldividend, long ldivisor) {
		if(ldividend<ldivisor)
			return 0;
		long temp=1;
		long sum=ldivisor;
		while((sum+sum)<ldividend)
		{
			sum=sum+sum;
			temp=temp+temp;
		}
		return temp+ldivide(ldividend-sum,ldivisor);
	}
}
