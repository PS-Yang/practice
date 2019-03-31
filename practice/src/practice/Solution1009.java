package practice;

public class Solution1009 {
	//sol2
	public int bitwiseComplement(int N) {
        String binary=Integer.toBinaryString(N);
        StringBuilder  sb=new StringBuilder();
        for(char c:binary.toCharArray())
        {
        	if(c=='0')
        		sb.append("1");
        	else
        		sb.append("0");
        }
        int ans = Integer.parseInt(sb.toString(), 2);
        return ans;
    }
	//sol1
//	public int bitwiseComplement(int N) {
//        String binary=Integer.toBinaryString(N);
//        StringBuilder  sb=new StringBuilder();
//        for(char c:binary.toCharArray())
//        {
//        	if(c=='0')
//        		sb.append("1");
//        	else
//        		sb.append("0");
//        }
//        int ans = Integer.parseInt(sb.toString(), 2);
//        return ans;
//    }
}
