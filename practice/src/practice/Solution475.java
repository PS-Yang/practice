package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution475 {
	//sol 1
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int ans=Integer.MIN_VALUE;
		int i=0;
		for(int house:houses)
		{
			while(i < heaters.length-1 && heaters[i]+heaters[i+1] < 2*house)
				i++;
			ans=Math.max(ans, Math.abs(heaters[i]-house));
		}
		
		return ans;
    }
}
