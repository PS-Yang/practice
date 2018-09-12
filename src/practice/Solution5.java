package practice;

public class Solution5 {
	public String longestPalindrome(String s) {
        if(s.equals(""))
			return "";
        String ans=s.substring(0,1);
		int size=1;
		for(int i=1;i<s.length();i++)
		{
			int right=0;
			int left=0;
			while(true)
			{
				if((i+right)<s.length() && s.charAt(i)==s.charAt(i+right) )
				{
					right++;
				}
				else if((i+left)>=0 && s.charAt(i)==s.charAt(i+left))
				{
					left--;
				}
				else
				{
					right--;
					left++;
					break;
				}
			}
			if(right-left+1>size)
			{
				size=right-left;
				ans=s.substring(i+left,i+right+1);
			}
			int j=1;
			String temp="";
			while(i-j+left>=0 &&  i+j+right<s.length() && s.charAt(i-j+left)==s.charAt(i+j+right))
			{
				temp=s.substring(i-j+left,i+j+right+1);
				// System.out.println(j);
				j++;
			}
			if(temp.length()>size)
			{
				size=temp.length();
				ans=temp;
			}
		}
		return ans;
    }
}
