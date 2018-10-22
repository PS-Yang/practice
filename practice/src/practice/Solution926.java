package practice;

public class Solution926 {
	public int minFlipsMonoIncr(String S) {
		int f0=0;
		int f1=0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='1')
			{
				f0++;
				f1 = Math.min(f0,f1);
			}
			if(S.charAt(i)=='0')
				f1 = Math.min(f0,f1+1);
				
		}
		return f1;
    }
	
	//sol1 有BUG
//	public int minFlipsMonoIncr(String S) {
//        int min=Integer.MAX_VALUE;
//        int count=0;
//        
//		for(int i=0;i<S.length();i++)
//		{
//			if(S.charAt(i)=='0')
//				count++;
//		}
//		min=Math.min(Math.min(min,count), S.length()-count);
//		
//		int mid=S.length()/2;
//		int begin=mid;
//		int end=mid;
//		while(begin<S.length()-1 && S.charAt(begin+1)==S.charAt(mid))
//			begin++;
//		while(end>=1 && S.charAt(end-1)==S.charAt(mid))
//			end--;
//		if(S.charAt(mid)==0)
//			begin++;
//		if(S.charAt(mid)==1)
//			end--;
//		int ans=0;
//		for(int i=0;i<end;i++)
//			if(i<mid && S.charAt(i)!='0')
//				ans++;
//		for(int i=begin+1;i<S.length();i++)
//			if(i>mid && S.charAt(i)!='1')
//				ans++;
//		min=Math.min(min,ans);
//		
//		return min;
//    }
}
