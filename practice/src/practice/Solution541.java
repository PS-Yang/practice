package practice;

public class Solution541 {
	//sol3 using char array
	public String reverseStr(String s, int k) {
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i=i+2*k)
        {
        	int l=i, j=Math.min(i+k-1, s.length()-1);
        	while(l<j)
        	{
        		char tmp=c[l];
                c[l++]=c[j];
                c[j--]=tmp;
        	}
        }
        return new String(c);
    }
	//sol2 fixed form sol1
//	public String reverseStr(String s, int k) {
//        StringBuilder sb=new StringBuilder();
//        int N=s.length();
//        int i=0;
//        while(i<N)
//        {
//        	StringBuilder tmp=new StringBuilder();
//        	if(i+2*k<N)
//        	{
//        		tmp.append(s.substring(i,i+k)).reverse();
//            	tmp.append(s.substring(i+k,i+2*k));
//        	}
//        	else if(i+k<N)
//            {
//            	tmp.append(s.substring(i,i+k)).reverse();
//            	tmp.append(s.substring(i+k,N));
//            }
//            else
//            	tmp.append(s.substring(i,N)).reverse();
//        	sb.append(tmp);
//        	i=i+2*k;
//        }
//        
//        return sb.toString();
//    }
	
	//sol1
//	public String reverseStr(String s, int k) {
//        StringBuilder sb=new StringBuilder();
//        int N=s.length();
//        int i=0;
//        while(i+2*k<N)
//        {
//        	StringBuilder tmp=new StringBuilder();
//        	tmp.append(s.substring(i,i+k)).reverse();
//        	tmp.append(s.substring(i+k,i+2*k));
//        	sb.append(tmp);
//        	i=i+2*k;
//        }
//        if(i+k<N)
//        {
//        	StringBuilder tmp=new StringBuilder();
//        	tmp.append(s.substring(i,i+k)).reverse();
//        	tmp.append(s.substring(i+k,N));
//        	sb.append(tmp);
//        }
//        else
//        {
//        	StringBuilder tmp=new StringBuilder();
//        	tmp.append(s.substring(i,N)).reverse();
//        	sb.append(tmp);
//        }
//        return sb.toString();
//    }
}
