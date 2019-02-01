package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution969 {
	//sol1 
	public List<Integer> pancakeSort(int[] A) {
        List<Integer> ans=new ArrayList<Integer>();
        int len=A.length-1;
        int k=len;
        while (k>0) 
        {
        	if(A[0]>A[k])
        	{
        		reverse(A, k);
        		ans.add(k+1);
        		k=len;
        	}
        	else if(k+1<=len && A[k+1]<A[k])
        	{
        		reverse(A, k);
        		ans.add(k+1);
        		k=len;
        	}
        	else
        		k--;
		}
        return ans;
    }
	
	private void reverse(int[] A , int j) {
		int i=0;
		while(i<j)
		{
			int tmp=A[i];
			A[i]=A[j];
			A[j]=tmp;
			i++;
			j--;
		}
	}
}
