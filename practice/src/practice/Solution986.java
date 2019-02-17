package practice;
import java.util.ArrayList;


class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Solution986 {
	//sol1
		public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
	        ArrayList<Interval> list=new ArrayList();
	        int i=0,j=0;
	        while(i<A.length && j<B.length)
	        {
	        	Interval tmp=null;
	        	if(A[i].start<=B[j].start && A[i].end>=B[j].start)
	        	{
	        		if(A[i].end<B[j].end)
	        		{
	        			tmp=new Interval(B[j].start,A[i].end);
	        			i++;
	        		}
	        		else
	        		{
	        			tmp=new Interval(B[j].start,B[j].end);
	        			j++;
	        		}
	   
	        	}
	        	else if(A[i].start>=B[j].start && A[i].start<=B[j].end)
	        	{
	        		if(A[i].end>B[j].end)
	        		{
	        			tmp=new Interval(A[i].start,B[j].end);
	        			j++;
	        		}
	        		else
	        		{
	        			tmp=new Interval(A[i].start,A[i].end);
	        			i++;
	        		}
	        	}
	        	else if(A[i].start<B[j].start && A[i].end<B[j].start)
	        		i++;
	        	else
	        		j++;
	        	if(tmp!=null)
	        		list.add(tmp);
	        }
	        Interval[] ans=new Interval[list.size()];
	        int idx=0;
	        for(Interval inter:list)
	        	ans[idx++]=inter;
	        return ans;
	    }
}
