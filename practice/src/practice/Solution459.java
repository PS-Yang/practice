package practice;

public class Solution459 {
	//sol2 fixed form sol1
	public boolean repeatedSubstringPattern(String s) {
		if(s.length()==0)
			return false;
		int len=s.length();
		for(int i=len/2;i>=1;i--)
		{
			if(len%i==0)
			{
				int size=len/i;
				StringBuilder sb=new StringBuilder();
				String tmp=s.substring(0,i);
				for(int j=1;j<=size;j++)
					sb.append(tmp);
				if(s.equals(sb.toString()))
					return true;
			}
		}
		return false;
    }
	
	//sol 1 
//	public boolean repeatedSubstringPattern(String s) {
//		if(s.length()==0)
//			return false;
//		int len=s.length();
//		int i=len/2;
//		while(i>=1)
//		{
//			if(len%i==0)
//			{
//				String sub[]=new String [len/i];
//				for(int j=0;j<sub.length;j++)
//					sub[j]=s.substring(i*j,i*(j+1));
//				String tmp=sub[0];
//				int k;
//				for(k=1;k<sub.length;k++)
//					if(!tmp.equals(sub[k]))
//						break;
//				if(k==sub.length)
//					return true;
//			}
//			i--;
//		}
//		return false;
//    }
}
