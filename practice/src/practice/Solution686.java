package practice;

public class Solution686 {
	public int repeatedStringMatch(String A, String B) {
        StringBuilder sb=new StringBuilder();
		int n=1;
		sb.append(A);
		while(sb.length()<B.length())
		{
			sb.append(A);
			n++;
		}
		if(sb.indexOf(B)>=0)
			return n;
		else if(sb.append(A).indexOf(B)>=0)
			return ++n;
		return -1;
    }
//	public int repeatedStringMatch(String A, String B) {
//        StringBuilder sb=new StringBuilder();
//		int n=1;
//		sb.append(A);
//		while(sb.toString().indexOf(B)<0)
//		{
//			if(sb.length()>A.length()+B.length())
//				return -1;
//			sb.append(A);
//			n++;
//		}
//		return n;
//    }
}
