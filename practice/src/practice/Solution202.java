package practice;

import java.util.HashSet;

public class Solution202 {
	public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(set.add(n))
        {
        	int tmp=0;
        	while(n>0)
        	{
        		tmp=tmp+(n%10)*(n%10);
        		n=n/10;
        	}
        	n=tmp;
        	if(tmp==1)
        		return true;
        }
        return false;
    }
}
