package practice;

public class Solution1022 {
	//sol2 暴力破解
	public int smallestRepunitDivByK(int K) {
		if(K==1)
			return 1;
		if(K%2==0 || K%5==0)
			return -1;
		int i=1,count=1;
		while (count<=K) {
			if(i%K==0)
				return count;
			i=(i*10+1)%K;
			count++;
		}
		
		return -1;
    }
	//sol1 暴力破解
//	public int smallestRepunitDivByK(int K) {
//		if(K==1)
//			return 1;
//		if(K%2==0 || K%5==0)
//			return -1;
//		int i=1,count=1;
//		while (count<1000000000) {
//			if(i%K==0)
//				return count;
//			i=i*10+1;
//			i=i%K;
//			count++;
//		}
//		
//		return -1;
//    }
}
