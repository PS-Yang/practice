package practice;

public class Solution915 {
	public int partitionDisjoint(int[] A) {
        int leftlen=1;
        int leftmax=A[0];
        for(int i=leftlen;i<A.length;i++)
        {
        	leftlen=i;
        	if(leftmax<=A[i])
        	{
        		int j=i+1;
            	int tmpmax=A[i];
            	for(;j<A.length;j++)
            	{
            		tmpmax=Math.max(tmpmax, A[j]);
            		if(A[j]<leftmax)
            			break;
            	}
            	if(j==A.length)
            		break;
            	else
            		leftmax=tmpmax;
        	}
        }
        return leftlen;
    }
}
