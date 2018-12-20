package practice;

public class Solution709 {
	//sol2
	public String toLowerCase(String str) {
        char c[]=str.toCharArray();
        for (int i = 0; i < c.length; i++) 
        	if('A'<=c[i] && c[i]<='Z')
        		c[i]=(char) (c[i]-'A'+'a');
		return new String(c);
		
    }
	//sol1
//	public String toLowerCase(String str) {
//        return str.toLowerCase();
//    }
}
