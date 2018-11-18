package practice;

import java.util.HashSet;

public class Solution944 {
	public int minDeletionSize(String[] A) {
        int ans=0;
        if(A.length<=1)
        	return 0;
        for(int i=0;i<A[0].length();i++)
        {
        	for(int j=0;j<A.length-1;j++)
        	{
        		if(A[j+1].charAt(i)<A[j].charAt(i))
        		{
        			ans++;
        			break;
        		}
        	}
        }
        	
        return ans;
    }
	//sol 1
//	public int minDeletionSize(String[] A) {
//        int ans=0;
//        if(A.length<=1)
//        	return 0;
//        for(int i=0;i<A[0].length();i++)
//        {
//        	int n=A[0].charAt(i)-'a';
//        	for(int j=1;j<A.length;j++)
//        	{
//        		int tmp=A[j].charAt(i)-'a';
//        		if(tmp<n)
//        		{
//        			ans++;
//        			break;
//        		}
//        		n=tmp;
//        	}
//        }
//        	
//        return ans;
//    }
}
