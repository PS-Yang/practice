package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Solution939 {
	//sol3 using hashset. 
	//     because 0 <= points[i][0] <= 40000 and 0 <= points[i][1] <= 40000
	public int minAreaRect(int[][] points) {
		HashSet<Integer> set=new HashSet<>(); //建立所有點 存在HASHSET
		for(int i=0;i<points.length;i++)
		{
			set.add(40001*points[i][0]+points[i][1]);
		}
		int minarea=Integer.MAX_VALUE;
		for(int i=0;i<points.length-1;i++)
		{
			for(int j=i+1;j<points.length;j++)
			{
				if(points[i][0]!=points[j][0] && points[i][1]!=points[j][1]) //取長方型斜對角的兩個點
				{
					if(set.contains(40001*points[i][0]+points[j][1]) && set.contains(40001*points[j][0]+points[i][1]))
					{
						int area=Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]);
						minarea=Math.min(minarea, area);
					}
				}
			}
		}
		return minarea==Integer.MAX_VALUE ? 0:minarea;
    }
	
	//sol2 using hashmap
//	public int minAreaRect(int[][] points) {
//		int minarea=Integer.MAX_VALUE;
//		HashMap<Integer,HashSet<Integer>> mapxy=new HashMap<>();//建立對應得XY值..
//		for(int i=0;i<points.length;i++)
//		{
//			HashSet<Integer> temp=mapxy.getOrDefault(points[i][0], new HashSet<Integer>());
//			temp.add(points[i][1]);
//			mapxy.put(points[i][0], temp);
//		}
//		for(int i=0;i<points.length-1;i++)
//		{
//			for(int j=i+1;j<points.length;j++)
//			{
//				if(points[i][0]!=points[j][0] && points[i][1]!=points[j][1]) //取長方型斜對角的兩個點
//				{
//					if(mapxy.get(points[i][0]).contains(points[j][1]) && mapxy.get(points[j][0]).contains(points[i][1]))
//					{
//						int area=Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]);
//						minarea=Math.min(minarea, area);
//					}
//				}
//			}
//		}
//		return minarea==Integer.MAX_VALUE ? 0:minarea;
//    }
	//sol1 in contest
//	public int minAreaRect(int[][] points) {
//		int minarea=Integer.MAX_VALUE;
//		HashMap<Integer,HashSet<Integer>> mapxy=new HashMap<>();//建立對應得XY值..
//		for(int i=0;i<points.length;i++)
//		{
			if(mapxy.containsKey(points[i][0]))
				mapxy.get(points[i][0]).add(points[i][1]);
			else
			{
				HashSet<Integer> temp=new HashSet<>();
				temp.add(points[i][1]);
				mapxy.put(points[i][0], temp);
			}
//		}
//		for(int i=0;i<points.length-1;i++)
//		{
//			for(int j=i+1;j<points.length;j++)
//			{
//				if(points[i][0]!=points[j][0] && points[i][1]!=points[j][1]) //取長方型斜對角的兩個點
//				{
//					if(mapxy.get(points[i][0]).contains(points[j][1]) && mapxy.get(points[j][0]).contains(points[i][1]))
//					{
//						int area=Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]);
//						if(area<minarea)
//							minarea=area;
//					}
//				}
//			}
//		}
//		return minarea==Integer.MAX_VALUE? 0:minarea;
//    }
}
