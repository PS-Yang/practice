package practice;

public class Solution258 {
	//2 O(1)
	public int addDigits(int num) {
		if(num<10)
		    return num;
		else if(num%9 ==0)
		    return 9;
		else
		    return num%9; 
    }
//	//1.
//	public int addDigits(int num) {
//		int ans;
//		do
//		{
//			ans=0;
//			while(num>0)
//			{
//				ans=ans+num%10;
//				num=num/10;
//			}
//			num=ans;
//		}while(ans>=10);
//        return ans;
//    }
}
