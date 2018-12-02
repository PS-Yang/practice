package practice;

import java.util.Arrays;
import java.util.HashSet;

public class Solution949 {
	public String largestTimeFromDigits(int[] A) {
		StringBuilder sb=new StringBuilder();
		int max=-1;		
		max=Math.max(max, count(A[0],A[1],A[2],A[3]));
		max=Math.max(max, count(A[0],A[2],A[1],A[3]));
		max=Math.max(max, count(A[0],A[3],A[1],A[2]));
		max=Math.max(max, count(A[1],A[2],A[0],A[3]));
		max=Math.max(max, count(A[1],A[3],A[0],A[2]));
		max=Math.max(max, count(A[2],A[3],A[0],A[1]));
		if(max==-1)
			return "";
        return max/1000+""+max/100%10+":"+max/10%10+""+max%10;
    }
	private int count(int a,int b,int c,int d){
		int hour=Math.max(a*10+b <24 ? a*10+b : -1, 
						  b*10+a <24 ? b*10+a : -1);
		int min=Math.max(c*10+d <60 ? c*10+d : -1, 
						 d*10+c <60 ? d*10+c : -1);
		if(hour==-1 || min==-1)
			return -1;
		return hour*100+min;
	}
}
