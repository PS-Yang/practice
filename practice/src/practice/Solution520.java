package practice;

public class Solution520 {
	
	//sol 4 改寫sol3
		public boolean detectCapitalUse(String word) {
			return word.toUpperCase().equals(word) || word.toLowerCase().equals(word) ||
					(Character.isUpperCase(word.charAt(0)) 
					&& word.substring(1).toLowerCase().equals(word.substring(1)));
	    }
		//sol 3
//		public boolean detectCapitalUse(String word) {
//			if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
//				return true;
//			else if(Character.isUpperCase(word.charAt(0)) && 
//					word.substring(1).toLowerCase().equals(word.substring(1)))
//				return true;
//			else
//				return false;
//	    }
	//sol 1
//	public boolean detectCapitalUse(String word) {
//		boolean first=Character.isUpperCase(word.charAt(0));
//		boolean prev=first;
//        for(int i=1;i<word.length();i++)
//        {
//        	boolean now=Character.isUpperCase(word.charAt(i));
//        	if(first)
//        	{
//        		if(now!=prev && i!=1)
//        			return false;
//        		prev=now;
//        	}
//        	else if (now)
//        			return false;
//        }
//        return true;
//    }
	//sol2 one line
//	public boolean detectCapitalUse(String word) {
//		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
//    }
}
