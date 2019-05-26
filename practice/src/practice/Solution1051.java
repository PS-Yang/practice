package practice;

import java.util.Arrays;

public class Solution1051 {
	public int heightChecker(int[] heights) {
        int sorth[]=heights.clone();
        Arrays.sort(sorth);
        int count=0;
        for (int i = 0; i < sorth.length; i++) 
			if(sorth[i]!=heights[i])
				count++;
		
        return count;
    }

}
