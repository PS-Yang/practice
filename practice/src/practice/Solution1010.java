package practice;

public class Solution1010 {
	public int numPairsDivisibleBy60(int[] time) {
        int timeCount[]=new int[60]; 
        for(int t:time)
        	timeCount[t%60]++;
		int count=0;
		for(int t:time)
		{
			t=t%60;
			int complement=(60-t)%60;
			if(t==complement)
				count+=timeCount[complement]-1;
			else
				count+=timeCount[complement];
			timeCount[t%60]--;
		}
        	
        return count;
    }
}
