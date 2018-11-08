package practice;

public class Solution441 {

	//sol1
	public int arrangeCoins(int n) {
		if(n<1)
			return 0;
		int i=1;
        while(n>=0)
        {
        	n=n-i;
        	if(n<0)
                break;
        	i++;
        }
        return i-1;
    }
	//sol2 using math x^2+x-2n<=0 使用公式解
//	public int arrangeCoins(int n) {
//		return (int)(-1 + Math.sqrt(1+8*(long)n) ) /2;
//	}
}
