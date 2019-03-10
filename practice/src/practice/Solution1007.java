package practice;

public class Solution1007 {
	private int ans=Integer.MAX_VALUE;
	public int minDominoRotations(int[] A, int[] B) {
        run(A,B,A[0],0);
        run(A,B,B[0],1);
        run(B,A,B[0],0);
        run(B,A,A[0],1);
        return ans==Integer.MAX_VALUE? -1:ans;
    }
	public void run(int[] cur, int[] not,int num,int count) {
		for (int i = 1; i < cur.length; i++) {
			if(num==cur[i])
				continue;
			else if(num==not[i])
				count++;
			else 
			{
				count=-1;
				break;
			}
		}
		if(count!=-1)
        	ans=Math.min(count, ans);
	}
}
