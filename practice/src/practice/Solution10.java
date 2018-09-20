package practice;

public class Solution10 {
	
//	1. p.charAt(j) == s.charAt(i) =>  dp[i][j] = dp[i-1][j-1];
//	2. p.charAt(j) == '.' => dp[i][j] = dp[i-1][j-1]; the same as 1.
//	3. p.charAt(j) == '*' 
//			3-1.  p.charAt(j-1)!=s.charAt(i) => dp[i][j]=dp[i][j-2]; // such as a* is empty.
//			3-2.  p.charAt(j-1)==s.charAt(i) or p.charAt(j-1)=='.' 
//			=> dp[i][j]=dp[i][j-1]; // such as a* is only one;
//			=> dp[i][j]=dp[i-1][j];	// such as a* is multiple.
//			=> dp[i][j]=dp[i][j-2]; // such as a* is empty
//  ***notice array index and String index difference
	public boolean isMatch(String s, String p) {
		if (s == null || p == null) 
	        return false;
		boolean ans[][]=new boolean [s.length()+1][p.length()+1];
		ans[0][0]=true;
		for(int i=0;i<s.length();i++)
			ans[i+1][0]=false;
		for(int i=0;i<p.length();i++)
		{
			ans[0][i+1]=false;
			if (p.charAt(i) == '*') 
				ans[0][i+1] = ans[0][i-1];
		}
		for (int i = 1; i <=s.length(); i++) 
		{
			for (int j = 1; j<=p.length(); j++) 
			{
				if (p.charAt(j-1) == '.' || p.charAt(j-1) == s.charAt(i-1)) 
	                    ans[i][j] = ans[i-1][j-1];
				else if (p.charAt(j-1) == '*') 
				{
	                if(p.charAt(j-2) !=  s.charAt(i-1) && p.charAt(j-2) != '.') // a* the same as empty.
	                		ans[i][j] = ans[i][j-2];
	                else if(p.charAt(j-2) ==  s.charAt(i-1) || p.charAt(j-2) == '.')
	                {
	                	ans[i][j] = (ans[i][j-1] | ans[i-1][j] | ans[i][j-2]);
	                }
	                	
				}
			}
		}
//		for(int i=0;i<=s.length();i++)
//		{
//			for (int j = 0; j<=p.length(); j++) 
//				 System.out.print(ans[i][j]+" ");
//			System.out.println();
//		}		
		return ans[s.length()][p.length()];
	}
//	public boolean isMatch(String s, String p) {
//
//	    if (s == null || p == null) {
//	        return false;
//	    }
//	    boolean[][] dp = new boolean[s.length()+1][p.length()+1];
//	    dp[0][0] = true;
//	    for (int i = 0; i < p.length(); i++) {
//	        if (p.charAt(i) == '*' && dp[0][i-1]) {
//	            dp[0][i+1] = true;
//	        }
//	    }
//	    for (int i = 0 ; i < s.length(); i++) {
//	        for (int j = 0; j < p.length(); j++) {
//	            if (p.charAt(j) == '.') {
//	                dp[i+1][j+1] = dp[i][j];
//	            }
//	            if (p.charAt(j) == s.charAt(i)) {
//	                dp[i+1][j+1] = dp[i][j];
//	            }
//	            if (p.charAt(j) == '*') {
//	                if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
//	                    dp[i+1][j+1] = dp[i+1][j-1];
//	                } else {
//	                    dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
//	                }
//	            }
//	        }
//	    }
//		for(int i=0;i<=s.length();i++)
//		{
//			for (int j = 0; j<=p.length(); j++) 
//				 System.out.print(dp[i][j]+" ");
//			System.out.println();
//		}
//	    return dp[s.length()][p.length()];
//	}
}
