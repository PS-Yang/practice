package practice;

public class Solution479 {
	//sol 1
	public int largestPalindrome(int n) {
        int MOD=1337;
        if(n<1 || n>8)
        	return 0;
        if(n==1)
        	return 9;
        int max=(int)Math.pow(10, n)-1;
        for(int i=max-1;i>max/10;i--)
        {
        	StringBuilder sb=new StringBuilder();
        	long num=Long.valueOf(i+sb.append(i).reverse().toString());
        	for(long x=max;x*x>=num;x--)
        		if(num%x==0)
        			return (int) (num%MOD);
        }
        return 0;
    }
}
