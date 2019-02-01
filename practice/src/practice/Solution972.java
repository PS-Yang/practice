package practice;

public class Solution972 {
	public boolean isRationalEqual(String S, String T) {
        return str(S)==str(T);
    }
	
	private double str(String s){
		int idx=s.indexOf("(");
		if(idx!=-1)
		{
			String head=s.substring(0,idx);
			String tail=s.substring(idx+1,s.length()-1);
			for (int i = 0; i < 20; i++) 
				head+=tail;
			s=head;
		}
		return Double.valueOf(s);
	}
}
