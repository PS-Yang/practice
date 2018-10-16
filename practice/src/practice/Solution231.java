package practice;

public class Solution231 {
//	//2. using bit operation
//	public boolean isPowerOfTwo(int n) {
//		return n > 0 && ((n & (n-1)) == 0);
//    }
	//1.
	public boolean isPowerOfTwo(int n) {
		if(n<1)
			return false;
		while(n>1)
		{
			if(n%2==1)
				return  false;
			n=n/2;
		}
		return true;
    }
}
