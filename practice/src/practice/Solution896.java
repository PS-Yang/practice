package practice;

public class Solution896 {
	public boolean isMonotonic(int[] A) {
		if(A.length<2)
			return true;
        int type[]=new int [A.length];
        int temp=A[0];
		for(int i=1;i<A.length;i++)
		{
			if(temp<A[i])
				type[i]=1;
			else if(temp==A[i])
				type[i]=0;
			else
				type[i]=2;
			temp=A[i];	
		}
		int tmp=type[1];
		for(int i=2;i<type.length;i++)
		{
			if(tmp!=type[i] && type[i]!=0  && tmp!=0)
			{
				return false;
			}
			if(type[i]!=0)
				tmp=type[i];
		}
		return true;
    }
}
