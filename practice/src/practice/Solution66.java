package practice;

import java.util.ArrayList;

public class Solution66 {
	public int[] plusOne(int[] digits) {
		int tmp=1;
		int i=digits.length-1;
		while(i>=0 && tmp==1)
		{
			digits[i]=digits[i]+tmp;
			if(digits[i]/10!=1)
				tmp=0;
			else
				digits[i]=0;
			i--;
		}
		if(tmp==1)
		{
			int ans[]=new int[digits.length+1];
			ans[0]=1;
			for(int j=1;j<ans.length;j++)
			{
				ans[j]=digits[j-1];
			}
			return ans;
		}
		else
			return digits;
    }
}
