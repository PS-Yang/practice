package practice;

public class Solution941 {
	//sol1 
	public boolean validMountainArray(int[] A) {
        if(A.length<3)
        	return  false;
        int i=0;
        while(i<A.length-1 && A[i]<A[i+1])
        	i++;
        if(i==0 || i==A.length-1)
        	return false;
        while(i<A.length-1 && A[i]>A[i+1])
        	i++;
        return i==A.length-1;
    }
	//sol2 
//	public boolean validMountainArray(int[] A) {
//        if(A.length<3)
//        	return  false;
//        int max=A[0];
//        int idx=0;
//        for(int i=1;i<A.length;i++)
//        {
//        	if(max<A[i])
//        	{
//        		max=A[i];
//        		idx=i;
//        	}
//        }
//        if(idx==0 || idx==A.length-1)
//        	return false;
//        for(int i=0;i<A.length-1;i++)
//        {
//        	if(i<idx && A[i]>=A[i+1])
//        		return false;	
//        	if(i>=idx && A[i]<=A[i+1])
//        		return false;
//        }
//        
//        return true;
//    }

}
