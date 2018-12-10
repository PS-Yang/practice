package practice;

import java.util.HashSet;

public class Solution955 {
	public int minDeletionSize(String[] A) {
		int ans=0,j;
        if(A.length<=1)
        	return 0;
        boolean sort[]=new boolean[A.length-1];
        for(int i=0;i<A[0].length();i++)
        {
        	for(j=0;j<A.length-1;j++)
        	{
        		if(!sort[j] && A[j+1].charAt(i)<A[j].charAt(i)) //
        		{
        			ans++;
        			break;
        		}
        	}
        	if(j<A.length-1)
        		continue;
        	for(j=0;j<A.length-1;j++)
        		if(A[j+1].charAt(i)>A[j].charAt(i)) //確定>的代表已排序好，
        			sort[j]=true;
        }
        return ans;
    }
}
