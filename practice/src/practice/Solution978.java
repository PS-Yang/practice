package practice;

public class Solution978 {
	//sol2
	public int maxTurbulenceSize(int[] A) {
        int max=1,up=1,down=1;
        for (int i = 1; i < A.length; i++) 
        {
			if(A[i]<A[i-1])
			{
				down=++up;
				up=1;
			}
			else if(A[i]>A[i-1])
			{
				up=++down;
				down=1;
			}
			else 
			{
				up=1;
				down=1;
			}	
			max=Math.max(max, Math.max(up, down));
		}
        return max;
    }
	//sol1
//	public int maxTurbulenceSize(int[] A) {
//        int max=1,cur=1,cur2=1;
//        for (int i = 0; i < A.length-1; i++) 
//        {
//			if(i%2==0 && A[i]<A[i+1])
//				cur++;
//			else if(i%2==1 && A[i]>A[i+1])
//				cur++;
//			else 
//				cur=1;
//			if(i%2==1 && A[i]<A[i+1])
//				cur2++;
//			else if(i%2==0 && A[i]>A[i+1])
//				cur2++;
//			else 
//				cur2=1;
//			max=Math.max(cur, max);
//			max=Math.max(cur2, max);
//		}
//        return max;
//    }
}
