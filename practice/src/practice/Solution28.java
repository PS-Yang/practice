package practice;

public class Solution28 {
	//2版 少用一個變數
	public int strStr(String haystack, String needle) {
		if(needle.length()==0 )
			return 0;
		for(int i=0;i<=haystack.length()-needle.length();i++)
		{
			int j=0;
			while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
				j++;
			if(j==needle.length())
				return i;
		}
		return -1;
    }
	
//  1版
//	public int strStr(String haystack, String needle) {
//		if(needle.length()==0)
//			return 0;
//		int index=-1;
//		for(int i=0;i<=haystack.length()-needle.length();i++)
//		{
//			int j=0;
//			while(j<needle.length() && haystack.charAt(i)==needle.charAt(j))
//			{
//				if(j==0)
//					index=i;
//				j++;
//				i++;
//			}
//			if(j==needle.length())
//				break;
//			else
//			{
//				i=i-j;
//				index=-1;
//			}	
//		}
//		return index;
//    }
}
