package practice;

public class Solution458 {
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pig=0;
        int s=minutesToTest/minutesToDie+1;
        while(Math.pow(s, pig)<buckets)
        	pig++;
        return pig;
    }
}
