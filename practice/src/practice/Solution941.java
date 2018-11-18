package practice;

public class Solution941 {
//	public boolean validMountainArray(int[] A) {
//		if(A.length<3)
//			  return  false;
//		int i=1;
//		int max=A[0];
//		for(i=1;i<A.length;i++)
//		{
//		  	if(max<A[i])
//		  		max=A[i];
//		  	else
//		  		break;
//		}
//		if(i==A.length || max==A[0])
//		  	return false;
//		for(;i<A.length;i++)
//		  	if(max<=A[i])
//		  		return false;
//		  
//		  return true;  
//	}
	public boolean validMountainArray(int[] A) {
        if(A.length<3)
        	return  false;
        int max=A[0];
        int idx=0;
        for(int i=1;i<A.length;i++)
        {
        	if(max<A[i])
        	{
        		max=A[i];
        		idx=i;
        	}
        }
        if(idx==0 || idx==A.length-1)
        	return false;
        for(int i=0;i<A.length-1;i++)
        {
        	if(i<idx && A[i]>=A[i+1])
        		return false;	
        	if(i>=idx && A[i]<=A[i+1])
        		return false;
        }
        
        return true;
    }

}
