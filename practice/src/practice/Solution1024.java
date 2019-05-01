package practice;

import java.util.Arrays;

public class Solution1024 {
	//sol2
	public int videoStitching(int[][] clips, int T) {
		int[] dp = new int[T+ 1];
        Arrays.fill(dp, T+1);
        dp[0] = 0;
        for(int i = 0; i <= T; i++) {
            for(int[] c : clips) {
                if(i >= c[0] && i <= c[1]) dp[i] = Math.min(dp[i], dp[c[0]] + 1);
            }
            if(dp[i] == T+1) return -1;
        }
        return dp[T];
    }
	//sol1
//	public int videoStitching(int[][] clips, int T) {
//		int count = 0;
//        Arrays.sort(clips, (a,b) ->  a[0] - b[0]);
//        int begin=0, end=0, i=0;
//        while(end<T)
//        {
//            for(; i<clips.length && clips[i][0]<= begin; i++ )
//                end = Math.max ( end, clips[i][1] ); 
//            if(begin == end)
//                return -1;
//            count++;
//            begin=end;
//        }
//        return count;
//    }
}
