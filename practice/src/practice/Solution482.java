package practice;

public class Solution482 {
//	//sol 1
	public String licenseKeyFormatting(String S, int K) {
		StringBuilder sb=new StringBuilder();
		S=S.toUpperCase().replaceAll("-", "");
		int len=S.length();
		int first=len%K;
		int prv=0;
		for(int i=first;i<=S.length();i=i+K)
		{
			sb.append(S.substring(prv,i));
			if(i!=S.length() && i!=0)
				sb.append("-");
			prv=i;
		}
		return sb.toString();
    }
}
