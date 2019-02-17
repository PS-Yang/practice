package practice;

public class Solution985 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum=0,i=0;
        for(int a:A)
        	if(a%2==0)
        		sum+=a;
        
        int ans[]=new int [queries.length];
        for(int que[]:queries)
        {
        	int idx=que[1];
        	if(A[idx]%2==0)
        		sum-=A[idx];
        	A[idx]+=que[0];
        	if(A[idx]%2==0)
        		sum+=A[idx];
        	ans[i++]=sum;
        }
        return ans;
    }
}
