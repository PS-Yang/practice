package practice;

import java.util.HashMap;


public class Solution911 {
	private int []times;
	private HashMap<Integer,Integer> winner=new HashMap<>();
	public Solution911(int[] persons, int[] times) {
        this.times=times;
        HashMap<Integer,Integer> count=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int man=0;
        for(int i=0;i<persons.length;i++) 
        {
        	count.put(persons[i], count.getOrDefault(persons[i], 0)+1);
        	if(max<=count.get(persons[i]))
        	{
        		max=count.get(persons[i]);
        		man=persons[i];
        	}
        	winner.put(i, man);
        }
    }
	public int q(int t) {
    	int begin=0;
    	int end=times.length-1;
    	if(t>times[end])
    		return winner.get(end);
    	int mid=0;
    	int ans=0;
    	while(begin<=end)
    	{
    		mid=(begin+end)/2;
    		if(times[mid]>t)
    			end=mid-1;
    		else if(times[mid]<t)
    			begin=mid+1;
    		else 
    		{
    			ans=mid;
    			break;
    		}
    	}
    	if(ans!=mid && begin>=end)
    	{
    		if(times[begin]>t)
    			ans=begin-1;
    		else
    			ans=begin;
    	}
    	return winner.get(ans);
    }
}