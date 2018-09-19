package practice2;

import java.util.Arrays;

public class SolutionT1 {
	public int solution(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
		int ans=1;
		for(int j=0;j<A.length;j++)
		{
			if(ans==A[j])
				ans++;
			else if(A[j]>ans)
				break;
		}
		return ans;
    }

}
