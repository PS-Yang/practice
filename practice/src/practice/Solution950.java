package practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution950 {
	//sol2 using queue
	public int[] deckRevealedIncreasing(int[] deck) {
		Arrays.sort(deck);
		int ans[]=new int [deck.length];
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<deck.length;i++)
			q.offer(i);
		for(int d:deck)
		{
			ans[q.poll()]=d;
			if(!q.isEmpty())
				q.offer(q.poll());
		}
		return ans;
    }
	//sol2 using queue
//	public int[] deckRevealedIncreasing(int[] deck) {
//		Arrays.sort(deck);
//		int ans[]=new int [deck.length];
//		Queue<Integer> q=new LinkedList<>();
//		for(int i=0;i<deck.length;i++)
//			q.offer(i);
//		int idx=0;
//		while(!q.isEmpty())
//		{
//			ans[q.poll()]=deck[idx++];
//			if(!q.isEmpty())
//				q.offer(q.poll());
//		}
//		return ans;
//    }
	//sol1 不算ans array space (1) 
//	public int[] deckRevealedIncreasing(int[] deck) {
//		Arrays.sort(deck);
//		int ans[]=new int [deck.length];
//		int count=1;
//		int idx=0;
//		int i=0;
//		while(i<deck.length)
//		{
//			if(count==0 && ans[idx]==0)
//				count++;
//			else if(count==1 && ans[idx]==0)
//			{
//				ans[idx]=deck[i];
//				i++;
//				count=0;
//			}
//			idx=idx++;
//			if(idx>=deck.length)
//				idx=idx-deck.length;
//		}
//		
//		return ans;
//    }
}
