package practice;

public class Solution696 {
	public int countBinarySubstrings(String s) {
        int total=0,cur=1,pre=0;
        for(int i=1;i<s.length();i++)
        {
        	if(s.charAt(i-1)==s.charAt(i))
        		cur++;
        	else
        	{
        		total+=Math.min(cur, pre);
        		pre=cur;
        		cur=1;
        	}
        }
        total+=Math.min(cur, pre);
		return total;
    }
}
