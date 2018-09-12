package practice;

public class Solution8 {
	public int myAtoi(String str) {
        int ans=0;
		int type=1;
		int loc=0;
		for(int i=0;i<str.length();i++)
		{
			int c=Character.getNumericValue(str.charAt(i));
			if(str.charAt(loc)==' ')
				loc++;
            else if(i==loc && str.charAt(i)=='+')
				type=type;
			else if(i==loc && str.charAt(i)=='-')
				type=-type;
			else if(c>=0 && c<=9)
			{
				int temp=ans;
				ans=ans*10+c;
				if(ans/10!=temp && type==1)
					return Integer.MAX_VALUE;
				else if(ans/10!=temp && type==-1)
					return Integer.MIN_VALUE;
			}
			else 
				break;
			
		}
		ans=ans*type;
        return ans;
    }
}
