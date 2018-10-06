package practice;

public class Solution69 {
	public int mySqrt(int x) {
		if(x==0)
			return 0;
        int begin=1;
        int end=Integer.MAX_VALUE;
        while(true)
        {
        	int mid= begin+(end-begin)/2;
        	if (mid <= x/mid)
        	{
        		if( mid+1 > x/(mid+1))
        			return mid;
        		begin=mid+1;
        	}
        	else
        		end=mid-1;
        }
    }
}
