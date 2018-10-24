package practice;

public class Solution326 {
	//sol2
	public boolean isPowerOfThree(int n) {
		int threeMax=1162261467;
        return (n>0) && (threeMax%n==0);
    }
//	//sol3
//	public boolean isPowerOfThree(int n) {
//	    return (n>0) && ((Math.log10(n)/Math.log10(3))%1==0);
//	}
//	//sol1 using loop
//	public boolean isPowerOfThree(int n) {
//        if(n<=0)
//        	return false;
//        while(n>1)
//		{
//			if(n%3!=0)
//				return  false;
//			n=n/3;
//		}
//		return true;
//    }
}
