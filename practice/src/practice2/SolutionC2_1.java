package practice2;

public class SolutionC2_1 {
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		if(K==0||A.length==0)
			return A;
		int ans[]=new int[A.length];
		while(K>A.length)
			K=K-A.length;
		for(int i=0;i<A.length;i++)
		{
			if(i+K<A.length)
				ans[i+K]=A[i];
			else
				ans[i+K-A.length]=A[i];
		}
		return ans;
    }
}
