package practice;

import java.util.List;
import java.util.ArrayList;

public class Solution1018 {
	public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans=new ArrayList<>();
        int cur=0;
		for (int i = 0; i < A.length; i++) 
		{
			cur=(cur*2+A[i])%5;
			ans.add(cur==0);
		}
        return ans;
    }
}
