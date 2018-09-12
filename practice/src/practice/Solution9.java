package practice;

public class Solution9 {
	public boolean isPalindrome(int x) {
		int end=0;
        if (x>=0 && x<10)
			return true;
        else if(x<0|| (x % 10 == 0 && x != 0))
			return false;
		else
		{
			while(x>end)
			{
				end=end*10+x%10;
				x=x/10;	
				if(end==x || end==x/10)
					return true;
			}
			return false;
		}
        
    }
}
