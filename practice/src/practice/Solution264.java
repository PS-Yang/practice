package practice;

import java.util.ArrayList;
import java.util.List;

public class Solution264 {
	public int nthUglyNumber(int n) {
		if(n<=0)
			return 0;
		List<Integer> ugly=new ArrayList<Integer>();
        int a=0,b=0,c=0;
        ugly.add(1);
		while(ugly.size()<n)
		{
			int min = Math.min(ugly.get(a)*2,Math.min(ugly.get(b)*3,ugly.get(c)*5));
			ugly.add(min);
			if(ugly.get(a)*2==min)
				a++;
			if(ugly.get(b)*3==min)
				b++;
			if(ugly.get(c)*5==min)
				c++;
		}
		return ugly.get(n-1);
    }
}
