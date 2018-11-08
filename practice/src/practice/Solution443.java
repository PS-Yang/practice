package practice;

public class Solution443 {
	public int compress(char[] chars) {
		if(chars.length==0)
			return 0;
		int len=0;
		for(int i=0;i<chars.length;i++)
		{
			char tmp=chars[i];
	        int count=1;
			while(i+1<=chars.length-1 && tmp==chars[i+1])
			{
				count++;
				i++;
			}
			chars[len]=tmp;
			len++;
			if(count!=1)
			{
				char c[]=(count+"").toCharArray();
				for(char tmpc:c)
				{
					chars[len]=tmpc;
					len++;
				}
			}
		}
		return len;
    }
}
