package practice;

import java.util.HashSet;
import java.util.Iterator;

public class Solution204 {
	public int countPrimes(int n) {
		if(n<3)
			return 0;
		boolean[] flag=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++)
        {
        	if(flag[i]==false)
        	{
            	count++;
            	for (int j=2; i*j<n; j++)
            		flag[i*j] = true;
        	}
        		
        }
        return count;
    }
}
