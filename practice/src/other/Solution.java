package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {
	public int solution(int[] T) {
		HashSet<Integer> set=new HashSet<>();
		int ansmax=T.length/2;
		for(int i=0;i<T.length;i++)
		{
			if(set.size()<ansmax)
				set.add(T[i]);
			else
				break;
		}
		return set.size();
	}
	public int solution2(String S) {
        // write your code in Java SE 8
		String[] str=S.split("\n");
		Arrays.sort(str);
		HashMap<Integer,ArrayList<String>> map=new HashMap<>();
		for(String s:str)
		{
			String[] str2=s.split(" ");
			int number = 0;
			if(str2[0].equals("Mon"))
				number=1;
			else if(str2[0].equals("Tue"))
				number=2;
			else if(str2[0].equals("Wed"))
				number=3;
			else if(str2[0].equals("Thu"))
				number=4;
			else if(str2[0].equals("Fri"))
				number=5;
			else if(str2[0].equals("Sat"))
				number=6;
			else if(str2[0].equals("Sun"))
				number=7;;
			if(map.containsKey(number))
			{
				map.get(number).add(str2[1]);
			}
			else
			{
				ArrayList<String> a=new ArrayList<>();
				a.add(str2[1]);
				map.put(number, a);
			}
		}
//		System.out.println(map);
		int max=0;
		int remain=0; //前一天剩下的
		for(int i=1;i<map.size()+1;i++)
		{
			ArrayList<String> A=map.get(i);
			Iterator iterator2 = A.iterator();
			int lastend=0;//前一個結束時間
			while(iterator2.hasNext()) 
			{
		        String [] temp=((String) iterator2.next()).split("-");
		        String [] times=temp[0].split(":");
		        String [] timee=temp[1].split(":");
				int begin=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);
				int end=Integer.parseInt(timee[0])*60+Integer.parseInt(timee[1]);
				if(remain+begin-lastend>max)
					max=remain+begin-lastend;
				lastend=end;
				remain=0;
		    }
			remain=1440-lastend;
		}
		if(remain>max)
			max=remain;
		return max;
    }
	public int solution3(String[] T, String[] R) {
        // write your code in Java SE 8
		HashMap<Integer,ArrayList<String>> map=new HashMap<>();
		int total=0;
		for(int i=0;i<T.length;i++)
		{
			char end=T[i].charAt(T[i].length()-1);
			if(end< '0' || end>'9') //沒有分題的前提
			{
				T[i]=T[i].substring(0,T[i].length()-1);
			}
			int beginindex=T[i].length()-1;
			int endindex=T[i].length();
			while(T[i].charAt(beginindex)>= '0' && T[i].charAt(beginindex)<= '9')
			{
				beginindex--;
			}
			int number=Integer.parseInt(T[i].substring(beginindex+1,endindex));
			if(map.containsKey(number))
			{
				map.get(number).add(R[i]);
			}
			else
			{
				ArrayList<String> a=new ArrayList<>();
				a.add(R[i]);
				map.put(number, a);
			}
		}
//		System.out.println(map);
		int score=100/map.size();
		
		for(int i=1;i<=map.size();i++)
		{
			ArrayList<String> A=map.get(i);
			Iterator iterator2 = A.iterator();
			int flag=0;
			while(iterator2.hasNext()) 
			{
		         if(!iterator2.next().equals("OK"))
		         {
		        	 flag=1;
		        	 break;
		         }
		    }
			if(flag==0)
				total=total+score;
		}

		return total;
    }
}
