package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution697 {
	//sol2
	public int findShortestSubArray(int[] nums) {
        HashMap<Integer,LinkedList<Integer>> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
        	LinkedList<Integer> tmp;
        	if(map.containsKey(nums[i]))
        	{
        		tmp=map.get(nums[i]);
        		tmp.set(0, tmp.get(0)+1);
        		tmp.set(2, i);
        	}
        	else
        	{
        		tmp=new LinkedList<>();
        		tmp.add(1);
        		tmp.add(i);
        		tmp.add(i);
        		map.put(nums[i], tmp);
        	}
        	if(tmp.get(0)>max)
        	{
        		set.clear();
        		max=tmp.get(0);
        	}
        	if(tmp.get(0)>=max)
        		set.add(nums[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int n:set)
        	ans=Math.min(ans, map.get(n).get(2)-map.get(n).get(1)+1);
        return ans;
    }
	//sol1 
//	public int findShortestSubArray(int[] nums) {
//        int num[]=new int [50000];
//        HashSet<Integer> set=new HashSet<>();
//        int max=0;
//        for(int n:nums)
//        {
//        	num[n]++;
//        	if(num[n]>max)
//        	{
//        		set.clear();
//        		max=num[n];
//        	}
//        	if(num[n]>=max)
//        		set.add(n);
//        }
//        int ans=Integer.MAX_VALUE;
//        for(int n:set)
//        {
//        	int i=0,j=nums.length-1;
//        	while(nums[i]!=n)
//        		i++;
//        	while(nums[j]!=n)
//        		j--;
//        	ans=Math.min(ans, j-i+1);
//        }
//        return ans;
//    }
}
