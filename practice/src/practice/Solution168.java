package practice;

public class Solution168 {
	public String convertToTitle(int n) {
		String ans="";
		while(n>0)
		{
			n--;
			ans=(char)('A' + n % 26)+ans;
			n=n/26;
		}
		return ans;
    }
//	public String convertToTitle(int n) {
//		String str[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//		String ans="";
//		while(n>0)
//		{
//			n--;
//			ans=str[n%26]+ans;
//			n=n/26;
//		}
//		return ans;
//    }
}
