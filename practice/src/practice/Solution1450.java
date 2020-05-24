package practice;

public class Solution1450 {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
    	for(int i=0;i<startTime.length;i++)
    	{
    		if(startTime[i]<=queryTime && endTime[i]>=queryTime)
    			count++;
    	}
        return  count;
    }
//	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
//        int count=0;
//    	for(int i=0;i<startTime.length;i++)
//    		count += (startTime[i]<=queryTime && endTime[i]>=queryTime)? 1:0;
//        return  count;
//    }
}
