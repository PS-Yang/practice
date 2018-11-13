package practice;

public class Solution453 {
	
	// sum + m*(n-1) = x*n , which n is nums.length , x is the array finally number ,and m is the answer. 
	// x = min + m , which min is the array's min number.
	// 	sum + m*(n-1) = n*(min + m) 
	//	=> m = sum - n*min  (sol2)
	//  => m = nums[1]-min + nums[2]-min + nums[3]-min +.... +nums[N-1]-min. (sol1)
	//sol2
	public int minMoves(int[] nums) {
        if(nums.length==0)
        	return 0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int n:nums)
        {
        	min=Math.min(min, n);
        	sum=sum+n;
        }
        return sum-min*nums.length;
    }
	//sol1
//	public int minMoves(int[] nums) {
//        if(nums.length==0)
//        	return 0;
//        int count=0;
//        int min=Integer.MAX_VALUE;
//        for(int n:nums)
//        	min=Math.min(min, n);
//        for(int n:nums)
//        	count=count+n-min;
//        return count;
//    }
}
