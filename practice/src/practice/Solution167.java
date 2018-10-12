package practice;

import java.util.HashMap;

public class Solution167 {
	public int[] twoSum(int[] numbers, int target) {
		if(numbers.length<2)
			return null;
		int i=0,j=numbers.length-1;
		while(i<j)
		{
			if(numbers[i]+numbers[j]==target)
				return new int []{i+1,j+1};
			else if(numbers[i]+numbers[j]<target)
				i++;
			else
				j--;
		}
		return null;
    }
	//1. question1 sol.
//	public int[] twoSum(int[] numbers, int target) {
//		int ans[]={0,0};
//		if(numbers.length<2)
//			return null;
//		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
//		for (int i = 0; i < numbers.length; i++) {
//			if(hm.containsKey(target-numbers[i]))
//			{
//				ans[0]=hm.get(target-numbers[i])+1;
//				ans[1]=i+1;
//				return ans;
//			}
//			hm.put(numbers[i], i);
//		}
//		return ans;
//    }
}
