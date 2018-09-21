package practice;

public class Solution44 {
	public boolean isMatch(String s, String p) {
		if(p.equals("*"))
			return true;
		
		boolean ans[][]=new boolean [s.length()+1][p.length()+1];
		ans[0][0]=true;
		for(int i=1;i<=s.length();i++)
			ans[i][0]=false;
		for(int i=1;i<=p.length();i++)
		{
			if(p.charAt(i-1)=='*')
				ans[0][i]=ans[0][i-1];
			else
				ans[0][i]=false;
		}
		for(int i=1;i<=s.length();i++)
		{
			for(int j=1;j<=p.length();j++)
			{
				if(p.charAt(j-1)==s.charAt(i-1) || p.charAt(j-1)=='?')
				{
					ans[i][j]=ans[i-1][j-1];
				}
				else if(p.charAt(j-1)=='*')
				{
					ans[i][j]=ans[i-1][j]||ans[i][j-1]||ans[i-1][j-1];
				}
				else
					ans[i][j]=false;
			}
		}
//		for(int i=0;i<=s.length();i++)
//		{
//			for(int j=0;j<=p.length();j++)
//				System.out.print(ans[i][j]+" ");
//			System.out.println();
//		}
		return ans[s.length()][p.length()];
    }

}
