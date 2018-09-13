package practice;

public class Solution14 {
	public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        if(strs.length==0)
        	return "";
        else if(strs.length<2)
        	return strs[0];
        ans.append(strs[0]);
        for(int i=1;i<strs.length;i++)
        {
        	while(strs[i].indexOf(ans.toString())!=0)
        		ans.delete(ans.length()-1, ans.length());
        }
		return ans.toString();
    }
	
//	public String longestCommonPrefix(String[] strs) {
//        String ans="";
//        if(strs.length==0)
//        	return "";
//        else if(strs.length<2)
//        	return strs[0];
//        ans=strs[0];
//        for(int i=1;i<strs.length;i++)
//        {
//        	while(strs[i].indexOf(ans.toString())!=0)
//        		ans=ans.substring(0, ans.length()-1);
//        }
//		return ans;
//    }
	
//	public String longestCommonPrefix(String[] strs) {
//        StringBuilder ans=new StringBuilder();
//        if(strs.length<1)
//        	return "";
//        else if(strs.length<2)
//        	return strs[0];
//        ans.append(strs[0]);
//        for(int i=1;i<strs.length;i++)
//        {
//        	String temp=ans.toString();
//        	ans.delete( 0, ans.length() );
//        	if(temp.toString().length()<strs[i].length())
//        	{
//        		for(int j=0;j<temp.toString().length();j++)
//        		{
//        			if(temp.charAt(j)==strs[i].charAt(j))
//        				ans.append(temp.charAt(j));
//        			else
//        				break;
//        		}
//        			
//        	}
//        	else
//        	{
//        		for(int k=0;k<strs[i].length();k++)
//        		{
//        			if(temp.charAt(k)==strs[i].charAt(k))
//        				ans.append(temp.charAt(k));
//        			else
//        				break;
//        		}	
//        	}
//        	if(ans.equals(""))
//        		return "";
//        }
//		return ans.toString();
//    }
}
