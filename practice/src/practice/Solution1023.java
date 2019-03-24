	package practice;

public class Solution1023 {
	
	//sol2
	public boolean queryString(String S, int N) {
		for (int i = N; i > N/2; i--) {
			String str=Integer.toBinaryString(i);
			if(!S.contains(str))
				return false;
		}
		return true;
    }
	//sol1
//	public boolean queryString(String S, int N) {
//		
//		for (int i = 1; i <= N; i++) {
//			String str=Integer.toBinaryString(i);
//			if(!S.contains(str))
//				return false;
//		}
//		return true;
//    }
}
