package practice;

public class Solution680 {
	public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
		while(i<j && s.charAt(i)==s.charAt(j))
		{
			i++;
			j--;
		}
		return palindrome(s,i+1,j) || palindrome(s,i,j-1);
    }
	public boolean palindrome(String s,int i,int j){
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
//	public boolean validPalindrome(String s) {
//        int i=0;
//        int j=s.length()-1;
//        int count=0;
//		while(i<j)
//		{
//			while(s.charAt(i)!=s.charAt(j))
//			{
//				count++;
//				if(count>1)
//					return false;
//				if(s.charAt(i+1)==s.charAt(j))
//					i++;
//				else if(s.charAt(i)==s.charAt(j-1))
//					j--;
//				else 
//					return false;
//			}
//			i++;
//			j--;
//		}
//		
//		return true;
//    }
}
