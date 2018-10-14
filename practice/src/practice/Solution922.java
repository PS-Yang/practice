package practice;

public class Solution922 {
	public int[] sortArrayByParityII(int[] A) {
		int i=0;
		int j=1;
		while(i<A.length-1 && A[i]%2==0)
	  		i=i+2;
	  	while(j<A.length &&A[j]%2==1)
	  		j=j+2;
		while(i<A.length-1)
		{
		  	int temp=A[i];
		  	A[i]=A[j];
		  	A[j]=temp;
		  	while(i<A.length-1 && A[i]%2==0)
		  		i=i+2;
		  	while(j<A.length &&A[j]%2==1)
		  		j=j+2;
		}
		return A;
	}
	
//	//1. using array
//	public int[] sortArrayByParityII(int[] A) {
//		int ans[]=new int[A.length];
//        int j=0;
//        int k=1;
//		for(int i=0;i<A.length;i++)
//		{
//			if(A[i]%2==0)
//			{
//				ans[j]=A[i];
//				j=j+2;
//			}
//			else
//			{
//				ans[k]=A[i];
//				k=k+2;
//			}
//		}
//		return ans;
//    }
}
