package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution15 {
	public List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> ans=new ArrayList<>();
	     Arrays.sort(nums);
		 for(int begin=0;begin<nums.length-2;begin++)
		 {
			//begin>0是因為會有-1 error 設定邊界與前一個數值不同才需要做
			 if(begin==0 || (begin>0 && nums[begin]!=nums[begin-1])) 
			 {
				 int mid=begin+1;
				 int end=nums.length-1;
				 int target=-nums[begin];
				 while(mid<end)
				 {
					 if(nums[mid]+nums[end]==target)
					 {
						 ans.add(Arrays.asList(nums[begin], nums[mid], nums[end]));
						 while (mid < end && nums[mid] == nums[mid+1]) //若是mid與mid+1值一樣去除
							 mid++;
		                 while (mid < end && nums[end] == nums[end-1]) //若是end與end-1值一樣去除
		                	 end--;
		    			 mid++;
						 end--;
					 }
					 else if (nums[mid] + nums[end] < target) 
						 mid++;
		             else 
		            	 end--;
				 }
			 }
		 }
	 	 return ans;
	 }
//	 public List<List<Integer>> threeSum(int[] nums) {
//		 List<List<Integer>> ans=new ArrayList<>();
//	     Arrays.sort(nums);
//		 for(int begin=0;begin<nums.length-2;begin++)
//		 {
//			 if(begin>0 && nums[begin]==nums[begin-1]) //與前一個數值不同才需要做
//				 continue;
//			 int mid=begin+1;
//			 int end=nums.length-1;
//			 int target=-nums[begin];
//			 while(mid<end)
//			 {
////				 System.out.println(nums[begin]+" "+nums[mid]+" "+nums[end]);
//				 if(nums[mid]+nums[end]==target)
//				 {
//					 ans.add(Arrays.asList(nums[begin], nums[mid], nums[end]));
//		
//					 while (mid < end && nums[mid] == nums[mid+1]) 
//						 mid++;
//	                 while (mid < end && nums[end] == nums[end-1]) 
//	                	 end--;
//	    			 mid++;
//					 end--;
//				 }
//				 else if (nums[mid] + nums[end] < target) 
//					 mid++;
//	             else 
//	            	 end--;
//			 }
//		 }
//	 	 return ans;
//	 }
}

//public List<List<Integer>> threeSum(int[] num) {
//Arrays.sort(num);
//List<List<Integer>> res = new LinkedList<>(); 
//for (int i = 0; i < num.length-2; i++) 
//{
//    if (i == 0 || (i > 0 && num[i] != num[i-1])) 
//    {
//        int lo = i+1, hi = num.length-1, sum = 0 - num[i];
//        while (lo < hi) 
//        {
//            if (num[lo] + num[hi] == sum) 
//            {
//                res.add(Arrays.asList(num[i], num[lo], num[hi]));
//                while (lo < hi && num[lo] == num[lo+1]) lo++;
//                while (lo < hi && num[hi] == num[hi-1]) hi--;
//                lo++; hi--;
//            } 
//            else if (num[lo] + num[hi] < sum) 
//            	lo++;
//            else 
//            	hi--;
//       }
//    }
//}
//return res;
//}

//public List<List<Integer>> threeSum(int[] nums) {
//List<List<Integer>> res = new ArrayList<>();
//Arrays.sort(nums);
//for (int i = 0; i + 2 < nums.length; i++) {
//if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
//    continue;
//}
//int j = i + 1, k = nums.length - 1;  
//int target = -nums[i];
//while (j < k) {
//    if (nums[j] + nums[k] == target) {
//        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//        j++;
//        k--;
//        while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
//        while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
//    } else if (nums[j] + nums[k] > target) {
//        k--;
//    } else {
//        j++;
//    }
//}
//}
//return res;
//}
