package practice;

public class Solution1017 {
	//sol1
	public String baseNeg2(int N) {
		String str="";
		while (N!=0) {
			str= Integer.toBinaryString(N & 1) + str;
			N = -(N >> 1);
		}
        return "".equals(str) ? "0":str;
    }
	//sol2
//	public String baseNeg2(int N) {
//		if(N==0)
//			return "0";
//		
//		StringBuilder sb=new StringBuilder();
//		while (N!=0) {
//			int rem=N%(-2);
//			N=N/(-2);
//			if(rem<0)
//			{
//				rem+=2;
//				N+=1;
//			}
//			sb.append(N);
//		}
//        return sb.reverse().toString();
//    }	

}
