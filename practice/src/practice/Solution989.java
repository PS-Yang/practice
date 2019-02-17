package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class Solution989 {
	//sol2
	public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans=new ArrayList<>();
        int total=K,i= A.length-1;
        while (total>0 || i>=0)
        {
        	if(i>=0)
        	    total+=A[i--];
        	ans.add(total%10);
        	total/=10;
		}

        Collections.reverse(ans);
        return ans;
    }
	//sol1
//	public List<Integer> addToArrayForm(int[] A, int K) {
//        List<Integer> ans=new ArrayList<>();
//        int remain=0,i=A.length-1,sum=0;
//        while(K>0 || remain>0 || i>=0)
//        {
//        	sum=K%10+remain;
//        	if(i>=0)
//        		sum+=A[i];
//        	remain=0;
//        	if (sum>9) 
//        	{
//				remain=1;
//				sum=sum%10;
//			}
//        	ans.add(0, sum);
//        	i--;
//        	K=K/10;
//        }
//        return ans;
//    }
}
