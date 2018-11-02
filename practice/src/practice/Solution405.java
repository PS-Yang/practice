package practice;

public class Solution405 {
	//sol1
	public String toHex(int num) {
		char c[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		if(num==0)
			return "0";
		String ans="";
		while(num!=0)
		{
			ans=c[(num&15)]+ans;
			num=(num>>>4);
		}
		return ans;
	}
}
