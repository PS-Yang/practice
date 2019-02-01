package practice;

public class Solution984 {
	public String strWithout3a3b(int A, int B) {
        StringBuilder sb=new StringBuilder();
        boolean writeA=true;
        if(B>A)
        	writeA=false;
        while (A>0 || B>0) 
        {
			if(writeA)
			{
				if(A <= Math.round((float)B/2) || A==1)
				{
					sb.append("a");
					A--;
				}
				else 
				{
					sb.append("aa");
					A=A-2;
				}
				writeA=!writeA;
			}
			else
			{
				if(B <= Math.round((float)A/2) || B==1)
				{
					sb.append("b");
					B--;
				}
				else 
				{
					sb.append("bb");
					B=B-2;
				}
				writeA=!writeA;
			}
			
		}
        return sb.toString();
    }
	
	
//	public String strWithout3a3b(int A, int B) {
//        StringBuilder sb=new StringBuilder();
//        int size=0;
//        if(A>B)
//        {
//        	int n=(A/2-1);
//        	if(n<=0)
//        		size=1;
//        	else
//        		size=B/(A/2-1);
//        }
//        else 
//        {
//        	int n=(B/2-1);
//        	if(n<=0)
//        		size=1;
//        	else
//        		size=A/(B/2-1);
//        }
//        if(size>2)
//        	size=2;
//        int i=0,j=0;
//        while ( i<A || j<B) 
//        {
//        	if(A>B)
//        	{
//        		while (i<A) 
//        		{
//        			sb.append("a");
//					i++;
//					if(i%2==0)
//						break;
//				}
//        		int k=0;
//        		while (j<B && k<size) 
//        		{
//        			sb.append("b");
//        			k++;
//					j++;
//				}
//        	}
//        	else 
//        	{
//        		while (j<B) 
//        		{
//        			sb.append("b");
//					j++;
//					if(j%2==0)
//						break;
//				}
//        		int k=0;
//        		while (i<A && k<size) 
//        		{
//        			sb.append("a");
//        			k++;
//					i++;
//				}
//        		
//			}
//			
//		}
//        return sb.toString();
//    }
}
