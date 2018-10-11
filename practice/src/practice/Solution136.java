package practice;

import java.util.HashSet;

public class Solution136 {
	//2. using  xor
	public int singleNumber(int[] nums) {
        int ans=0;
		for(int n:nums)
			ans=ans^n;
		return ans;
    }
	//1.
//	public int singleNumber(int[] nums) {
//        HashSet<Integer> set=new HashSet<>();
//		for(int n:nums)
//		{
//			if(!set.add(n))
//				set.remove(n);
//		}
//		return set.iterator().next();
//    }
}
