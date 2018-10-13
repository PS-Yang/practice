package practice;

public class Solution191 {
	public int hammingWeight(int n) {
		int count=0;
		for(int i=0; i<32; i++)
		{
			count=count+(n&1);
			n=n>>>1;
		}
        return count;
    }
//	//1.
//	public int hammingWeight(int n) {
//		StringBuilder sb=new StringBuilder();
//		sb.append(Integer.toBinaryString(n));
//		int count=0;
//        for(char c:sb.toString().toCharArray())
//        {
//        	if(c=='1')
//        		count++;
//        }
//        return count;
//    }
}
