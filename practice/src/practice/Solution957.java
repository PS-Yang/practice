package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution957 {
	//sol3 we know the loop is 14.
	public int[] prisonAfterNDays(int[] cells, int N) {
		N=N%14;
		if(N==0)
			N=14;
        for(int i=1;i<=N;i++)
        {
        	int precells[]=cells.clone();
        	for(int j=0;j<cells.length;j++)
        	{
        		if(j==0||j==cells.length-1)
        			cells[j]=0;
        		else if(precells[j+1]==precells[j-1])
        			cells[j]=1;
        		else
        			cells[j]=0;
        	}
        }
        return cells;
    }
	//sol2
//	public int[] prisonAfterNDays(int[] cells, int N) {
//		HashMap<Integer,String> map=new HashMap<>();
//		int count=0;
//        while(count<N)
//        {
//        	int precells[]=cells.clone();
//        	StringBuilder sb=new StringBuilder();
//        	for(int j=0;j<cells.length;j++)
//        	{
//        		if(j==0||j==cells.length-1)
//        			cells[j]=0;
//        		else if(precells[j+1]==precells[j-1])
//        			cells[j]=1;
//        		else
//        			cells[j]=0;
//        		sb.append(cells[j]);
//        	}
//        	if(!map.containsValue(sb.toString()))
//        		map.put(count,sb.toString());
//        	else 
//        		break;
//        	count++;
//        }
//        if(count!=N)
//        {
//        	int tmp=N%count-1;
//        	if(tmp<0)
//        		tmp=tmp+count;
//        	int j=0;
//        	for(char c:map.get(tmp).toCharArray())
//        		cells[j++]=c-'0';
//        }
//        return cells;
//    }
	
	//sol1
//	public int[] prisonAfterNDays(int[] cells, int N) {
//        HashMap<Integer,List<Integer>> map=new HashMap<>();
//		
//		Integer prev[]=new Integer[cells.length];
//		for(int j=0;j<prev.length;j++)
//			prev[j]=cells[j];
//		
//		int i=0;
//        for(;i<N;i++)
//        {
//        	Integer now[]=new Integer[prev.length];
//        	for(int j=0;j<prev.length;j++)
//        	{
//        		if(j==0||j==prev.length-1)
//        			now[j]=0;
//        		else if(prev[j+1]==prev[j-1])
//        			now[j]=1;
//        		else
//        			now[j]=0;
//        	}
//        	prev=now;
//        	if(!map.containsValue(Arrays.asList(now)))
//        		map.put(i,Arrays.asList(now));
//        	else 
//        		break;
//        	
//        	// for(int j=0;j<now.length;j++)
//        	// 	System.out.print(now[j]+" ");
//        	// System.out.println();
//        }
//        if(i==N)
//        	for(int j=0;j<cells.length;j++)
//        		cells[j]=map.get(i-1).get(j);
//        else
//        	for(int j=0;j<cells.length;j++)
//        		cells[j]=map.get(((N%i-1)+i)%i).get(j);
//        return cells;
//    }
}
