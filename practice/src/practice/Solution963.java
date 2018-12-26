package practice;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



public class Solution963 {
	//sol3 time O(N*N*logN)  75ms
	//找出center.
	public double minAreaFreeRect(int[][] points) {
		HashMap<Point,HashMap<Long,HashSet<Point>>> map=new HashMap<>();// center(2*cen) -> r(r^2) -> list.
		Point p[]=new Point[points.length];
		for(int i=0;i<points.length;i++)
			p[i]=new Point(points[i][0], points[i][1]);
		for(int i=0;i<points.length-1;i++)
			for(int j=i+1;j<points.length;j++)
			{
				long r=(p[i].x-p[j].x)*(p[i].x-p[j].x)+(p[i].y-p[j].y)*(p[i].y-p[j].y);
				Point cen=new Point(p[i].x+p[j].x,p[i].y+p[j].y);
				if(!map.containsKey(cen))
					map.put(cen, new HashMap<Long,HashSet<Point>>());
				if(!map.get(cen).containsKey(r))
					map.get(cen).put(r, new HashSet<Point>());
				map.get(cen).get(r).add(p[i]);
				map.get(cen).get(r).add(p[j]);
			}
//		System.out.println(map);
		double minarea=Integer.MAX_VALUE;
		for(Point cen:map.keySet())
			for (Long r : map.get(cen).keySet()) 
			{
				HashSet<Point> tmp=map.get(cen).get(r);
				if(tmp.size()>=4)
					for(int i=0;i<tmp.toArray().length;i++)
						for(int j=i+1;j<tmp.toArray().length;j++)
						{
							Point P=(Point) tmp.toArray()[i];
							Point Q=(Point) tmp.toArray()[j];
							if(P.distance(Q)!=Math.sqrt(r))
							{
								Point Q2 = new Point(cen); // (p1+p3)/2=center => p1+p3=cen
								Q2.translate(-Q.x, -Q.y);  // Q2=cen-Q
		                        double area = P.distance(Q) * P.distance(Q2);
								minarea=Math.min(minarea, area);
							}
						}
			}
		return minarea==Integer.MAX_VALUE ? 0:minarea;
    }
	//sol2 time O(N^3)  27ms
	//p1 + (p2 - p1) + (p3 - p1) = p4.
//	public double minAreaFreeRect(int[][] points) {
//		HashSet<Point> set=new HashSet<>(); //建立所有點 存在HASHSET
//		Point p[]=new Point[points.length];
//		for(int i=0;i<points.length;i++)
//		{
//			p[i]=new Point(points[i][0], points[i][1]);
//			set.add(p[i]);
//		}
//		double minarea=Integer.MAX_VALUE;
//		for(int i=0;i<p.length-2;i++) //p1
//			for(int j=i+1;j<p.length-1;j++)//p2
//				for(int k=j+1;k<p.length;k++)//p3
//				{
//					Point point=new Point(p[j].x+p[k].x-p[i].x,p[j].y+p[k].y-p[i].y);
//					if(set.contains(point))
//					{
//						int dot=(p[k].x-p[i].x)*(p[j].x-p[i].x)+(p[k].y-p[i].y)*(p[j].y-p[i].y);
//						if(dot==0)
//						{
//							double area= (p[i].distance(p[k]))*(p[i].distance(p[j]));
//							minarea=Math.min(minarea, area);
//						}
//					}
//				}
//		return minarea==Integer.MAX_VALUE ? 0:minarea;
//    }
	//sol1 time O(N^3)  419ms
	//p1 + (p2 - p1) + (p3 - p1) = p4.
//	public double minAreaFreeRect(int[][] points) {
//		HashSet<Integer> set=new HashSet<>(); //建立所有點 存在HASHSET
//		for(int i=0;i<points.length;i++)
//		{
//			set.add(40001*points[i][0]+points[i][1]);
//		}
//		double minarea=Integer.MAX_VALUE;
//		for(int i=0;i<points.length-1;i++)
//		{
//			for(int j=i+1;j<points.length;j++)
//			{
//				for(int k=j+1;k<points.length;k++)
//				{
//					int p1x=points[i][0],p1y=points[i][1],p2x=points[j][0],p2y=points[j][1];
//					int p3x=points[k][0],p3y=points[k][1];
//					int p4x=p1x+(p2x-p1x)+(p3x-p1x),p4y=p1y+(p2y-p1y)+(p3y-p1y);
//					if(set.contains(p4x*40001+p4y))
//					{
//						int dot=(p3x-p1x)*(p2x-p1x)+(p3y-p1y)*(p2y-p1y);
//						if(dot==0)
//						{
//							double area= Math.sqrt(((p3x-p1x)*(p3x-p1x)+(p3y-p1y)*(p3y-p1y)))
//									*Math.sqrt(((p2x-p1x)*(p2x-p1x)+(p2y-p1y)*(p2y-p1y)));
//							minarea=Math.min(minarea, area);
//						}
//					}
//					
//				}
//			}
//		}
//		return minarea==Integer.MAX_VALUE ? 0:minarea;
//    }
}
