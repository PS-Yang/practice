package practice;

public class Solution58 {
	public int lengthOfLastWord(String s) {
		if(s.length()==0 || s.equals("") ||s.equals(" "))
			return 0;
		boolean flag=true;
		for(char c:s.toCharArray())
		{
			if(c!=' ')
			{
				flag=false;
				break;
			}
		}
		if(flag)
			return 0;
		String str[]=s.split(" ");
		return str[str.length-1].length();
    }
}
