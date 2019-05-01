package practice;


public class Solution1027 {
	//sol
	public int longestArithSeqLength(int[] A) {
        int count = 0;
        for(int i=0; i < A.length ; i++)
        {
            for (int j=i+1; j < A.length ; j++) 
            {
            	int dif=A[j]-A[i] , cur = A[j] , tmpcount=2;
            	for (int k=j+1; k < A.length ; k++) 
            	{
            		if(A[k] == cur + dif)
            		{
            			cur = A[k];
            			tmpcount++;
            		}
            	}
            	count=Math.max(count,tmpcount);
            }
        }
        return count;
    }
}
