package practice;

public class Solution434 {
	//sol 2
	public int countSegments(String s) {
		int len=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
				len++;
		}
			
		return len;
    }
	//sol 1
//	public int countSegments(String s) {
//		if(s.length()==0)
//			return 0;
//		int len=0;
//		for(String str:s.split(" "))
//			if(!str.equals(""))
//				len++;
//		return len;
//    }
}
