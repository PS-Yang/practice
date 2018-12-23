package practice;

import java.util.Stack;

import other.interview;

public class Solution962 {
	//sol2 
	public int maxWidthRamp(int[] A) {
		Stack<Integer> stack=new Stack<>();
		int ans=0;
		
		for (int i = 0; i < A.length; i++) 
			if (stack.isEmpty() || A[stack.peek()]>A[i]) 
				stack.push(i);
		
		for (int i = A.length-1; i > 0; i--)
        	while(!stack.isEmpty() && A[stack.peek()]<=A[i])
        		ans=Math.max(ans, i-stack.pop());
        return ans;
    }
	//sol1
//	public int maxWidthRamp(int[] A) {
//        int max=0,min=0,ans=0;
//        for (int i = 1; i < A.length; i++) 
//        {
//			if(A[i]<A[min])
//				min=i;
//			else
//				ans=Math.max(ans, i-min);
//		}
//        return ans;
//    }
}
