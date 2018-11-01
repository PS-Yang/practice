package practice;

import java.util.ArrayList;

public class Solution932 {
	public int[] beautifulArray(int N) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        while(list.size()<N)
        {
        	ArrayList<Integer> tmp=new ArrayList<>();
        	for(int n:list)
        		if(n*2-1<=N)
        			tmp.add(n*2-1);
        	for(int n:list)
        		if(n*2<=N)
        			tmp.add(n*2);
        	list=tmp;
        }
        int ans[]=new int [N];
        for(int i=0;i<list.size();i++)
        	ans[i]=list.get(i);
        return ans;
    }
}
