package practice;

public class Solution190 {
	//2.
	public int reverseBits(int n) {
		int ans=0;
		for(int i=0;i<32;i++)
		{
			ans=ans<<1;
			if((n&1)==1)
				ans++;
			n=n>>1;
		}
        return ans;
    }
	//1.
//	public int reverseBits(int n) {
//		StringBuilder sb=new StringBuilder();
//		sb.append(Integer.toBinaryString(n));
//		sb.reverse();
//		while(sb.length()<32)
//			sb.append(0);
//		int ans=Integer.parseUnsignedInt(sb.toString(), 2);
//        return ans;
//    }
}
