package practice;

public class Solution521 {
	//sol2
	public int findLUSlength(String a, String b) {
		if(a.equals(b))
			return -1;
		else 
			return Math.max(a.length(), b.length());
    }
	//sol1
//	public int findLUSlength(String a, String b) {
//		if(a.length()==0 && b.length()==0)
//			return -1;
//		if(a.length()==0)
//			return b.length();
//		if(b.length()==0)
//			return a.length();
//        int ans=-1;
//        for(int i=0;i<a.length();i++)
//        {
//        	for(int j=a.length();j>=i+1;j--)
//        	{
//        		if(!b.contains(a.substring(i, j)))
//            	{
//            		ans=Math.max(ans,a.substring(i,j).length());
//            		break;
//            	}
//        		else if(a.substring(i, j).length()<ans)
//        			break;
//        	}		
//        }
//        for(int i=0;i<b.length();i++)
//        {
//        	for(int j=b.length();j>=i+1;j--)
//        	{
//        		if(!a.contains(b.substring(i, j)))
//            	{
//            		ans=Math.max(ans,b.substring(i,j).length());
//            		break;
//            	}
//        		else if(b.substring(i, j).length()<ans)
//        			break;
//        	}		
//        }
//        return ans;
//    }
}
