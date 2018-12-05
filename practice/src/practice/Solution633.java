package practice;

public class Solution633 {
	public boolean judgeSquareSum(int c) {
        int i=(int)Math.sqrt(c);
        int j=1;
        while(j<=i)
        {
        	if(i*i+j*j==c)
        		return true;
        	else if(i*i+j*j>c)
        		i--;
        	else
        		j++;
        }
        return false;
    }
}
