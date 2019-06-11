package practice;



public class Solution1078 {
	//sol2
	public String[] findOcurrences(String text, String first, String second) {
        StringBuilder sb=new StringBuilder();
        String word[]=text.split(" ");
		for(int i=2;i<word.length;i++)
			if(word[i-2].equals(first) && word[i-1].equals(second))
				sb.append(word[i]+" ");
		
        if(sb.length()==0)
			return new String[0];
        return sb.toString().split(" ");
    }
	
	//sol1
//	public String[] findOcurrences(String text, String first, String second) {
//        StringBuilder sb=new StringBuilder();
//        int count=0;
//		for(String s:text.split(" "))
//		{
//			if(count==2)
//			{
//				sb.append(s+" ");
//				count=0;
//			}
//			if(count==1 && s.equals(second))
//				count=2;
//			else if(s.equals(first))
//				count=1;
//			else
//				count=0;
//		}
//        if(sb.length()==0)
//			return new String[0];
//        return sb.toString().split(" ");
//    }
}
