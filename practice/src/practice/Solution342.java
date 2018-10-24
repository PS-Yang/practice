package practice;

public class Solution342 {
	//sol1 ref 231
	public boolean isPowerOfFour(int num) {
		//前兩個為 power of 2.
		return num>0 && ((num&(num-1)) == 0) && ((num-1)%3==0);
    }
//	//sol1 ref 326
//	public boolean isPowerOfFour(int num) {
//		return (num>0) && ((Math.log10(num)/Math.log10(4))%1==0);
//    }
}
