package practice;

public class Solution476 {
	//sol2
	public int findComplement(int num) {
		return ~num &(Integer.highestOneBit(num) - 1);
    }
	
	//sol1 
//	public int findComplement(int num) {
//		int i=0;
//		int sum=0;
//		while(Math.pow(2, i)<=num)
//		{
//			sum=(int) (sum+Math.pow(2, i));
//			i++;
//		}
//		return sum-num;
//    }
}
