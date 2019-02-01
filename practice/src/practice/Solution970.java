package practice;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Solution970 {
	//sol2
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> set=new HashSet<>();
        
        for (int i = 1; i <= bound; i=i*x) 
        {
        	for (int j = 1; j <= bound; j=j*y) 
        	{
        		int sum=i+j;
        		if(sum<=bound)
        			set.add(sum);
        		if(y==1)
        			break;
        	}
        	if(x==1)
        		break;
		}
        return new ArrayList<>(set);
    }
	//sol1
//	public List<Integer> powerfulIntegers(int x, int y, int bound) {
//        List<Integer> ans=new ArrayList<>();
//        HashSet<Integer> set=new HashSet<>();
//        if(x==1 && y==1)
//        {
//        	if(bound>=2)
//        		ans.add(2);
//        	return ans;
//        }
//        int i=0,j=0;
//        while(Math.pow(x, i)<bound)
//        {
//        	int sum=(int)(Math.pow(x, i)+Math.pow(y, j));
//        	if(sum<=bound)
//        	{
//        		set.add(sum);
//        		if(y==1)
//        		{
//        			i++;
//        			continue;
//        		}
//        		j++;
//        	}
//        	else 
//        	{
//				j=0;
//				if(x==1)
//					break;
//				i++;
//			}
//        }
//        ans.addAll(set);
//        return ans;
//    }
}
