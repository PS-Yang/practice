package practice;

import java.util.Arrays;

public class Solution899 {
	public String orderlyQueue(String S, int K) {
		if(K>1)
		{
			char c[]=S.toCharArray();
			Arrays.sort(c);
			return new String(c);
		}
		else
		{
			String ans=S;
			for(int i=0;i<S.length();i++)
			{
				String tmp=S.substring(i)+S.substring(0,i);
				if(tmp.compareTo(ans)<0)
					ans=tmp;
			}
			return ans;
		}
    }
}
