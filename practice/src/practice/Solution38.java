package practice;

public class Solution38 {
	
	//2版 使用StringBuilder
	public String countAndSay(int n) {
		if(n==1)
			return "1";
		StringBuilder ans=new StringBuilder("1");
		for(int i=2;i<=n;i++)
		{
			StringBuilder temp=new StringBuilder();
			int count=1;
			for(int j=0;j<ans.length();j++)
			{
				if(j<ans.length()-1 && ans.charAt(j)==ans.charAt(j+1))
					count++;
				else
				{
					temp.append(count).append(ans.charAt(j));
					count=1;
				}
			}
			ans=temp;
		}
        return ans.toString();
    }
	
	//1版使用String
//	public String countAndSay(int n) {
//		if(n==1)
//			return "1";
//		String ans="1";
//		for(int i=2;i<=n;i++)
//		{
//			String temp="";
//			int count=1;
//			for(int j=0;j<ans.length();j++)
//			{
//				if(j<ans.length()-1 && ans.charAt(j)==ans.charAt(j+1))
//					count++;
//				else
//				{
//					temp=temp+count+""+ans.charAt(j);
//					count=1;
//				}
//			}
//			ans=temp;
//		}
//        return ans;
//    }
}
