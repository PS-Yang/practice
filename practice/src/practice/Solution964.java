package practice;

import other.interview;

public class Solution964 {
	 public int leastOpsExpressTarget(int x, int target) {
		 int pos=0,neg=0,k=0;
	     while(target>0)
	     {
	    	 int cur = target % x;
	    	 target = target/x;
	    	 if(k>0)
	    	 {
	    		 int pos2=Math.min(cur*k+pos, (cur+1)*k+neg);
	    		 int neg2=Math.min((x-cur)*k+pos, (x-cur-1)*k+neg);
	    		 pos=pos2;
	    		 neg=neg2;
	    	 }
	    	 else //個位數處理
	    	 {
	    		 pos=cur*2;
	    		 neg=(x-cur)*2;
	    	 }
	    	 k++;
	    	 System.out.println(pos+" "+neg);
	     }
	     return Math.min(pos, k+neg)-1;
	 }
}
