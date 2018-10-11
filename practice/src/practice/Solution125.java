package practice;

public class Solution125 {
	public boolean isPalindrome(String s) {
		if(s.equals(""))
			return true;
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			while(i<s.length() && !Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while(j>=0 && !Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if(i>j)
				break;
			char a=s.charAt(i);
			char b=s.charAt(j);
			if(a!=b)
				return false;
			i++;
			j--;
		}
		return true;
    }
}
