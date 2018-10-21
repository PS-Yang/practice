package practice;

public class Solution925 {
	
	//2. 簡化版
	public boolean isLongPressedName(String name, String typed) {
		if(name.length()==0 && typed.length()==0)
			return true;
		if(typed.length()<name.length())
			return false;
		int i=0,j=0;
		while(i<name.length() && j<typed.length())
		{
			if(name.charAt(i)==typed.charAt(j))
				i++;
			j++;
		}
		if(i<name.length())
			return false;
		else
			return true;
	}
//	// sol1
//	public boolean isLongPressedName(String name, String typed) {
//		if(name.length()==0 && typed.length()==0)
//			return true;
//		if(typed.length()<name.length())
//			return false;
//		int j=0;
//		for(int i=0;i<name.length();i++)
//		{
//			char c=name.charAt(i);
//			int count_name=1;
//			while(i<name.length()-1 && c==name.charAt(i+1))
//			{
//				count_name++;
//				i++;
//			}
//			while( j<typed.length() &&c!=typed.charAt(j));
//			{
//				j++;
//			}
//			if(j>=typed.length())
//				return false;
//			int count_type=1;
//			while(j<typed.length()-1 && typed.charAt(j+1)==c)
//			{
//				count_type++;
//				j++;
//			}
//			if(count_type<count_name)
//				return false;
//			j++;
//		}
//		return true;      
//    }
}
