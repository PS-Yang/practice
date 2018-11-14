package practice;

public class Solution461 {
	//sol1
	public int hammingDistance(int x, int y) {
		int ans=0;
		while((x > 0) || (y > 0))
		{
			ans=ans+((x^y)&1);
			x= x>>>1;
			y= y>>>1;
		}
		return ans;
    }
//	//sol 2 
//	public int hammingDistance(int x, int y) {
//		 int ans=0;
//	        for(int i=1; i<32; i++)
//	        {
//	            if(x%2!=y%2)
//	                ans++;
//	            x=x/2;
//	            y=y/2;
//	        }
//	        return ans;
//    }
}
