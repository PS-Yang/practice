package practice2;

public class Solution_GrandChallenge {
	public int solution(String S) {
        // write your code in Java SE 8
		if(S.length()==0)
			return 0;
		int ans=0;		
		for(int i=0;i<S.length()-ans;i++)
		{
			int index=i+1;
			while(index<S.length() && S.charAt(i)==S.charAt(index))
			{
				index++;
			}
			if(index==S.length())
				break;
			char a=S.charAt(i);
			char b=S.charAt(index);
			int counta=index-i;
			int countb=1;
			index++;
			while(index<S.length() )
			{
				if(a==S.charAt(index))
					counta++;
				if(b==S.charAt(index))
					countb++;
				if(counta==countb && ans<counta+countb)
						ans=counta+countb;
				if(S.charAt(index)!=a && S.charAt(index)!=b)
					break;
				index++;
			}
		}
		return ans;
    }
}
