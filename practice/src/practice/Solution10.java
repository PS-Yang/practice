package practice;

public class Solution10 {
	public boolean isMatch(String s, String p) {
		if(s.equals("") ||p.equals(""))
			return false;
		boolean ans[][]=new boolean [s.length()+1][p.length()+1];
		ans[0][0]=true;
		for(int i=1;i<s.length();i++)
			ans[i][0]=false;
		for(int j=1;j<p.length();j++)
		{
			if(p.charAt(j-1)=='*' )
				ans[0][j]=ans[0][j-2];
		}
		for (int i = 1; i < s.length(); i++) 
		{
			for (int j = 1; j<p.length(); j++) 
			{
				if (p.charAt(j - 1) == '.' || p.charAt(j-1) == s.charAt(i-1)) 
	                    ans[i][j] = ans[i-1][j-1];
				else if (p.charAt(j - 1) == '*')  
				{
					ans[i][j] = ans[i][j - 2];
	                if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i-1)) 
	                	ans[i][j] = ans[i][j] | ans[i - 1][j];
	                    
	            } 
				else 
					ans[i][j] = false;
	                
	         }
		}
		return ans[s.length()][p.length()];
	}
}
