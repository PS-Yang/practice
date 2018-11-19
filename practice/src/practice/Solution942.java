package practice;

import java.util.ArrayList;

public class Solution942 {
	//sol2
	public int[] diStringMatch(String S) {
		int ans[]=new int[S.length()+1];
		int left=0,right=S.length();
		for(int i=0;i<S.length();++i)
		{
			if(S.charAt(i)=='I')
				ans[i]=left++;
			else
				ans[i]=right--;
		}
		ans[S.length()]=left;
		return ans;
	}
	// sol1 in contest but runtime error
//	public int[] diStringMatch(String S) {
//		int ans[]=new int [S.length()+1];
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(0);
//		for(int i=0;i<S.length();i++)
//		{
//			if(S.charAt(i)=='I')
//			{
//				int n=list.get(i)+1;
//				if(list.contains(n))
//				{
//					for(int j=0;j<list.size();j++)
//						if(list.get(j)>=n)
//							list.set(j, list.get(j)+1);			
//				}
//				list.add(n);
//			}
//			else
//			{
//				int n=list.get(i)-1;
//				if(list.contains(n))
//				{
//					for(int j=0;j<list.size();j++)
//						if(list.get(j)>=n)
//							list.set(j, list.get(j)+1);			
//				}
//				list.add(n);
//				if(n==-1)
//					for(int j=0;j<list.size();j++)
//						list.set(j, list.get(j)+1);		
//				
//			}
//			System.out.println(list);
//		}
//		for(int i=0;i<ans.length;i++)
//			ans[i]=list.get(i);
//		
//		return ans;
//    }
}
