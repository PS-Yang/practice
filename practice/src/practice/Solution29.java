package practice;

public class Solution29 {
	public int divide(int dividend, int divisor) {
        int sign=1;
        if((divisor>0 && dividend<0) || (divisor<0 && dividend>0))
        	sign=-1;
        long ldividend = Math.abs((long) dividend);
    	long ldivisor = Math.abs((long) divisor);
    	long ans = ldivide(ldividend, ldivisor);
    	if(ans>Integer.MAX_VALUE) 
    	{
    		if(sign==1)
    			return Integer.MAX_VALUE;
    		else
    			return Integer.MIN_VALUE;
    	}
    	else
    		return (int) (ans*sign);
    }
	private long ldivide(long ldividend, long ldivisor) {
		if(ldividend<ldivisor) 
			return 0;
		long count=1;
		long sum=ldivisor;
		while((sum+sum)<ldividend)   //O(log(N))
		{
			sum=sum+sum;
			count=count+count;
		}
		return count+ldivide(ldividend-sum,ldivisor);
	}
}
