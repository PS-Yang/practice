package practice;

public class Solution67 {
	public String addBinary(String a, String b) {
        String ans="";
        int idxa=a.length()-1;
        int idxb=b.length()-1;
        int out=0;
        while(idxa>=0 || idxb>=0)
        {
        	int sum=out;
        	if(idxa>=0)
        		sum=sum+a.charAt(idxa)-'0';
        	if(idxb>=0)
        		sum=sum+b.charAt(idxb)-'0';
        	ans=sum%2+ans;
        	out=sum/2;
        	idxa--;
        	idxb--;
        }
        if(out==1)
        	ans="1"+ans;
        return ans;
    }
	//1板
//	public String addBinary(String a, String b) {
//        String ans="";
//        int idxa=a.length()-1;
//        int idxb=b.length()-1;
//        int out=0;
//        while(idxa>=0 || idxb>=0)
//        {
//        	if(idxa<=-1)
//        	{
//        		if((out==1 && b.charAt(idxb)=='1') || (out==0 && b.charAt(idxb)=='0'))
//        			ans="0"+ans;
//        		else
//        		{
//        			ans="1"+ans;
//        			out=0;
//        		}
//        	}
//        	else if(idxb<=-1)
//        	{
//        		if((out==1 && a.charAt(idxa)=='1') || (out==0 && a.charAt(idxa)=='0'))
//        			ans="0"+ans;
//        		else
//        		{
//        			ans="1"+ans;
//        			out=0;
//        		}
//        	}
//        	else if(a.charAt(idxa)=='1' && b.charAt(idxb)=='1')
//        	{
//        		ans=out+ans;
//        		out=1;
//        	}
//        	else if(a.charAt(idxa)=='0' && b.charAt(idxb)=='0')
//        	{
//        		ans=out+ans;
//        		out=0;
//        	}
//        	else 
//        	{
//        		if(out==0)
//        			ans="1"+ans;
//        		else
//        			ans="0"+ans;	
//        	}
//        	idxa--;
//        	idxb--;
//        }
//        if(out==1)
//        	ans="1"+ans;
//        return ans;
//    }
}
