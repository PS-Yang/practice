package practice;

import java.util.HashMap;
import java.util.Stack;

public class Solution496 {
	//sol3 O(N) 5ms
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
		for(int i=0;i<nums2.length;i++)
		{
			while(!st.isEmpty() && st.peek()<nums2[i])
				map.put(st.pop(), nums2[i]);
			st.push(nums2[i]);
		}
//		while(!st.isEmpty())
//			map.put(st.pop(),-1);
		int ans[]=new int [nums1.length];
		for(int i=0;i<nums1.length;i++)
			ans[i]=map.getOrDefault(nums1[i], -1);
		
		return ans;
    }
	
	//sol2 using HashMap two for loop 3ms
//	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int ans[]=new int [nums1.length];
//        HashMap<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<nums2.length;i++)
//		{
//			int j=i+1;
//			for(;j<nums2.length;j++)
//			{
//				if(nums2[j]>nums2[i])
//				{
//					map.put(nums2[i], nums2[j]);
//					break;
//				}
//			}
//			if(j==nums2.length)
//				map.put(nums2[i], -1);
//		}
//		for(int i=0;i<nums1.length;i++)
//			ans[i]=map.get(nums1[i]);
//		
//		return ans;
//    }
	//sol 1 time O(N*N)
//	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int ans[]=new int [nums1.length];
//		for(int i=0;i<nums1.length;i++)
//		{
//			int tmp=-1;
//			boolean flag=false;
//			for(int j=0; j<nums2.length;j++)
//			{
//				if(flag && nums2[j]>nums1[i])
//				{
//					tmp=nums2[j];
//					break;
//				}
//				else if(nums1[i]==nums2[j])
//					flag=true;			
//			}
//			ans[i]=tmp;
//		}
//			
//		return ans;
//    }
}
