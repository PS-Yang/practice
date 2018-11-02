package practice;

public class Solution400 {
	public int findNthDigit(int n) {
        int len=1,start=1;
        long count=9;
        while(len*count<n)
        {
        	n-=len*count;
        	len++;
        	count=count*10;
        	start=start*10;
        }
        start=start+(n-1)/len;
        String s=start+"";
        return Character.getNumericValue(s.charAt((n-1)%len));
    }
}
