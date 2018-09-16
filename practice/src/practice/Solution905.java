package practice;

public class Solution905 {
	public int[] sortArrayByParity(int[] A) {
        int ans[]=new int[A.length];
        int j=0;
        int k=A.length-1;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]%2==0)
			{
				ans[j]=A[i];
				j++;
			}
			else
			{
				ans[k]=A[i];
				k--;
			}
		}
		return ans;
    }
//	// 2.don't use new array
//	public int[] sortArrayByParity(int[] A) {
//        int ans[]=new int[A.length];
//        int i=0;
//        int j=A.length-1;
//        while(i<j)
//        {
//        	if(A[i]%2==0)
//        		i++;
//        	if(A[j]%2==1)
//        		j--;
//        	if(i<j)
//        	{
//        		int temp=A[i];
//        		A[i]=A[j];
//        		A[j]=temp;
//        	}
//        }
//		return A;
//    }

}
