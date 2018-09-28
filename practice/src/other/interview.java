package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//[(0,0),(0,2),(2,2),(2,0),(5,0),(5,2)]
//find the smallest area of all rectangles
public class interview {
	
	public int smallarea(int num[][]){
		int minarea=Integer.MAX_VALUE;
		HashMap<Integer,ArrayList<Integer>> mapxy=new HashMap<>();
		for(int i=0;i<num.length;i++)
		{
			if(mapxy.containsKey(num[i][0]))
				mapxy.get(num[i][0]).add(num[i][1]);
			else
			{
				ArrayList<Integer> temp=new ArrayList<>();
				temp.add(num[i][1]);
				mapxy.put(num[i][0], temp);
			}
		}
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i][0]!=num[j][0] && num[i][1]!=num[j][1])
				{
					if(mapxy.get(num[i][0]).contains(num[j][1]) && mapxy.get(num[j][0]).contains(num[i][1]))
					{
						int area=Math.abs(num[i][0]-num[j][0])*Math.abs(num[i][1]-num[j][1]);
						if(area<minarea)
							minarea=area;
					}
				}
			}
		}
		return minarea;
	}
//	//1. 暴力破解(N*N*N*N)
//	public int smallarea(int num[][]){
//		int minarea=Integer.MAX_VALUE;
//		for(int i=0;i<num.length-3;i++)
//		{
//			for(int j=i+1;j<num.length-2;j++)
//			{
//				for(int k=j+1;k<num.length-1;k++)
//				{
//					for(int l=k+1;l<num.length;l++)
//					{
//						HashSet<Integer> x=new HashSet<>();
//						HashSet<Integer> y=new HashSet<>();
//						x.add(num[i][0]);
//						x.add(num[j][0]);
//						x.add(num[k][0]);
//						x.add(num[l][0]);
//						y.add(num[i][1]);
//						y.add(num[j][1]);
//						y.add(num[k][1]);
//						y.add(num[l][1]);
//						if(x.size()==2 && y.size()==2)
//						{
//							Object[] a=x.toArray();
//							Object[] b=y.toArray();
//							int area=Math.abs((int)a[0]-(int)a[1])*Math.abs((int)b[0]-(int)b[1]);
//							if(area<minarea)
//								minarea=area;
//							System.out.println(area);
//						}
//					}
//				}
//			}
//		}
//		return minarea;
//	}
}
